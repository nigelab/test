package com.rsqa.testdev.utils;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.rallydev.rest.RallyRestApi;
import com.rallydev.rest.client.HttpClient;
import com.rallydev.rest.request.CreateRequest;
import com.rallydev.rest.request.DeleteRequest;
import com.rallydev.rest.request.GetRequest;
import com.rallydev.rest.request.QueryRequest;
import com.rallydev.rest.request.UpdateRequest;
import com.rallydev.rest.response.CreateResponse;
import com.rallydev.rest.response.DeleteResponse;
import com.rallydev.rest.response.GetResponse;
import com.rallydev.rest.response.QueryResponse;
import com.rallydev.rest.response.UpdateResponse;
import com.rallydev.rest.util.Fetch;
import com.rallydev.rest.util.QueryFilter;
import com.rallydev.rest.util.Ref;
import com.rsqa.testdev.rally.TestCase;
import com.rsqa.testdev.rally.TestCaseStep;
import com.rsqa.testdev.rally.TestFolder;
import com.rsqa.testdev.rally.TestStep;
import com.rsqa.testdev.rally.UserBean;
import com.rsqa.testdev.rally.UserStory;
import com.rsqa.testdev.rally.WorkProduct;

public class RallyExample
{

  static Gson GSON = new Gson();

  public static void main(String[] args) throws URISyntaxException, IOException
  {
    RallyRestApi restApi = new RallyRestApi(new URI("https://us1.rallydev.com"), "_3tPvFdSvSm3d86ELHKn2P7XmnkfEpPlFxbCOWnycY");
//     RallyRestApi restApi = new RallyRestApi(new
//     URI("https://rally1.rallydev.com"), "nigel.zheng@emerson.com",
//     "nigel123");

    LOG.debug(restApi.getWsapiVersion());
    // GetRequest getRequest = new GetRequest("/defect/1234.js");
    // GetResponse getResponse = restApi.get(getRequest);

    restApi.setProxy(new URI("http://10.161.64.10:8080"));

    try
    {

      //String ref = "/testcase?project=/project/24313289481&query=(Name%20contains%20%22Job_Aid_Wizard%22)&start=1&pagesize=100";
      // crudExample(restApi);
      // query(restApi);
      //JsonObject newTestCase = createTestCaseBean();
      //createTestCase(restApi, newTestCase);
      deleteMultiTestCases(restApi,"Job_Aid_Wizard");
      //delete(restApi,ref);
      // queryExample(restApi);

    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
    finally
    {
      // Release all resources
      restApi.close();
    }
  }

  private static void deleteMultiTestCases(RallyRestApi restApi, String keywords) throws IOException
  {
    QueryRequest onDelTestcases = new QueryRequest("testcase?project=/project/24313289481");
    onDelTestcases.setQueryFilter(new QueryFilter("Name", "contains", keywords));
    onDelTestcases.setPageSize(100);
    QueryResponse qResponse = restApi.query(onDelTestcases);
    JsonArray arr = qResponse.getResults();
    /*GetRequest getRequest = new GetRequest(ref);
    GetResponse getResponse = restApi.get(getRequest);
    JsonObject obj = getResponse.getObject();
    JsonArray arr = obj.get("Results").getAsJsonArray();*/
    int counter=0;
    for(int i=0;i<arr.size();i++){
      JsonObject o = arr.get(i).getAsJsonObject();
      String r = o.get("_ref").getAsString();
      String ron = o.get("_refObjectName").getAsString();
      LOG.debug("{}-{}",ron,r);
      delete(restApi,r);
      counter++;
    }
    LOG.debug("Totally deleted {} test cases!",counter);
  }

  private static void createTestCase(RallyRestApi restApi, JsonObject newTestCase) throws IOException
  {
    // TODO Auto-generated method stub
    restApi.setApplicationName("CreateTestCase");

    // JsonObject newTestCase = createBean();

    LOG.debug("Creating test case...");
    // JsonObject newTestCase = new JsonObject();
    // newTestCase.addProperty("Name", "Test Case by Nigel 1");
    String condition = "?project=https://rally1.rallydev.com/slm/webservice/v2.0/project/24313289481";

    CreateResponse createResponse = createTestCaseRequest(restApi, newTestCase);

    // Read defect
    String ref = Ref.getRelativeRef(createResponse.getObject().get("_ref").getAsString());
    get(restApi, ref);

    for (int i = 0; i < 5; i++)
    {
      createTestCaseStep(restApi, ref, i);
    }

    update(restApi, ref);

    // Delete defect
    // delete(restApi, ref);
  }

  private static void createTestCaseStep(RallyRestApi restApi, String ref, int index) throws IOException
  {
    TestStep step = createStep(index);
    JsonObject newTestStep = (JsonObject) GSON.toJsonTree(step);
    JsonObject testcaseref = new JsonObject();
    testcaseref.addProperty("_ref", ref);
    newTestStep.add("TestCase", testcaseref);
    LOG.debug(String.format("TestStep = %s", newTestStep.toString()));

    CreateResponse createStepResponse = createStep(restApi, newTestStep);
    String stepRef = Ref.getRelativeRef(createStepResponse.getObject().get("_ref").getAsString());
    getStep(restApi, stepRef);
  }

  private static JsonObject createTestCaseBean()
  {
    TestCase bean = new TestCase();
    bean.setName("Check Login Logic");
    bean.setObjective("Verify LOGIN logic");
    bean.setNotes("this is a sample note!");
    bean.setPreConditions("Open chrome browser");
    bean.setPostConditions("Close browsers");
    bean.setMethod("Automated");
    bean.setPriority("Useful");

    WorkProduct wp = new WorkProduct();
    // wp.setRefObjectName("Test User Story");
    wp.setRef("https://rally1.rallydev.com/slm/webservice/v2.0/hierarchicalrequirement/34255129153");
    bean.setWorkProduct(wp);

    // UserStory us = new UserStory();
    // us.setFormattedID("US336");
    // bean.setWorkProduct(us);

    TestFolder tf = new TestFolder();
    tf.setRef("https://rally1.rallydev.com/slm/webservice/v2.0/testfolder/34255962587");
    bean.setTestFolder(tf);

    UserBean owner = new UserBean();
    owner.setRef("https://rally1.rallydev.com/slm/webservice/v2.0/user/33916069598");
    bean.setOwner(owner);

    /*
     * TestCaseStep teststeps = new TestCaseStep(); List<TestStep> steps = new
     * ArrayList<>(); TestStep step = createStep();
     * 
     * steps.add(step); teststeps.setSteps(steps);
     */

    JsonObject newTestCase = (JsonObject) GSON.toJsonTree(bean);
    LOG.debug(String.format("TestCase = %s", newTestCase.toString()));

    return newTestCase;
  }

  private static TestStep createStep(int i)
  {
    TestStep step = new TestStep();
    step.setInput("input=" + i);
    step.setExpectedResult("output=" + i);
    return step;
  }

  private static CreateResponse createTestCaseRequest(RallyRestApi restApi, JsonObject newTestCase) throws IOException
  {
    CreateRequest createRequest = new CreateRequest("testcase", newTestCase);
    CreateResponse createResponse = restApi.create(createRequest);
    LOG.debug(String.format("Created %s", createResponse.getObject().get("_ref").getAsString()));
    return createResponse;
  }

  private static CreateResponse createStep(RallyRestApi restApi, JsonObject newTestStep) throws IOException
  {
    CreateRequest createRequest = new CreateRequest("testcasestep", newTestStep);
    CreateResponse createResponse = restApi.create(createRequest);
    LOG.debug(String.format("Created %s", createResponse.getObject().get("_ref").getAsString()));
    return createResponse;
  }

  private static void get(RallyRestApi restApi, String ref) throws IOException
  {
    LOG.debug(String.format("\nReading test case %s...", ref));
    // String ref="/testcase/34610326219";
    GetRequest getRequest = new GetRequest(ref);
    GetResponse getResponse = restApi.get(getRequest);
    JsonObject obj = getResponse.getObject();
    LOG.debug(String.format("Read test case. Name = %s, FormattedID = %s", obj.get("Name").getAsString(), obj.get("FormattedID").getAsString()));
  }

  private static void getStep(RallyRestApi restApi, String ref) throws IOException
  {
    LOG.debug(String.format("\nReading test case %s...", ref));
    // String ref="/testcase/34610326219";
    GetRequest getRequest = new GetRequest(ref);
    GetResponse getResponse = restApi.get(getRequest);
    JsonObject obj = getResponse.getObject();
    LOG.debug(String.format("Read test step.  index = %s, input = %s, output = %s", obj.get("StepIndex").getAsString(),
        obj.get("Input").getAsString(), obj.get("ExpectedResult").getAsString()));
  }

  private static void update(RallyRestApi restApi, String ref) throws IOException
  {
    JsonObject obj;
    // Update defect
    LOG.debug("\nUpdating test case state...");
    JsonObject owner = new JsonObject();
    owner.addProperty("_ref", "https://rally1.rallydev.com/slm/webservice/v2.0/user/33916069598");
    JsonObject updatedTestCase = new JsonObject();
    updatedTestCase.add("Owner", owner);
    updatedTestCase.addProperty("Reaqdy", true);
    UpdateRequest updateRequest = new UpdateRequest(ref, updatedTestCase);
    UpdateResponse updateResponse = restApi.update(updateRequest);
    obj = updateResponse.getObject();
    LOG.debug(String.format("Updated test case. Ready = %s", obj.get("Ready").getAsString()));
  }

  private static void delete(RallyRestApi restApi, String ref) throws IOException
  {
    LOG.debug("\nDeleting test case...");
    DeleteRequest deleteRequest = new DeleteRequest(ref);
    DeleteResponse deleteResponse = restApi.delete(deleteRequest);
    if (deleteResponse.wasSuccessful())
    {
      LOG.debug("Deleted test case.");
    }
  }

  private static JsonArray query(RallyRestApi restApi) throws IOException
  {
    HttpClient client = restApi.getClient();
    String baseUrl = client.getWsapiUrl();
    LOG.debug("{} - {} - {}", baseUrl, client.getServer(), client.getWsapiVersion());

    /*
     * String url = baseUrl + "/workspace"; String response = null; try {
     * response = client.doGet(url);
     * 
     * LOG.debug("response: {}", response); } catch (IOException e) { // TODO
     * Auto-generated catch block e.printStackTrace(); } finally { try {
     * client.close(); LOG.debug("Client closed finally!"); } catch (IOException
     * e) { // TODO Auto-generated catch block e.printStackTrace(); } }
     */

    restApi.setApplicationName("QueryProject");

    // QueryRequest projects = new
    // QueryRequest("testcase?workspace=https://rally1.rallydev.com/slm/webservice/v2.0/workspace/16411227326");
    // QueryRequest projects = new
    // QueryRequest("testcase?project=https://rally1.rallydev.com/slm/webservice/v2.0/project/24313289481");
    QueryRequest projects = new QueryRequest("user");
    // projects.setQueryFilter(new QueryFilter("ObjectID", "=", "23098414968"));
    // projects.setQueryFilter(new QueryFilter("Name", "=", "Team MSS-R"));
    // projects.setQueryFilter(new QueryFilter("project", "contains", "Test"));
    // projects.setQueryFilter(new QueryFilter("Workspace", "=",
    // "https://rally1.rallydev.com/slm/webservice/v2.0/workspace/15671378290"));
    /*
     * defects.setFetch(new Fetch("FormattedID", "Name", "State", "Priority"));
     * defects.setQueryFilter(new QueryFilter("State", "<", "Fixed"));
     * defects.setOrder("Priority ASC,FormattedID ASC");
     */

    // Return up to 5, 1 per page
    /*
     * defects.setPageSize(1); defects.setLimit(10);
     */
    QueryResponse queryResponse = restApi.query(projects);
    if (queryResponse.wasSuccessful())
    {
      LOG.debug(String.format("\nTotal results: %d", queryResponse.getTotalResultCount()));
      // LOG.debug("{}",queryResponse.getResults());
      /*
       * for (JsonElement result : queryResponse.getResults()) { JsonObject
       * defect = result.getAsJsonObject();
       * LOG.debug(String.format("\t%s - %s: Priority=%s, State=%s",
       * defect.get("FormattedID").getAsString(),
       * defect.get("Name").getAsString(), defect.get("Priority").getAsString(),
       * defect.get("State").getAsString())); }
       */

      return queryResponse.getResults();
    }
    else
    {
      System.err.println("The following errors occurred: ");
      for (String err : queryResponse.getErrors())
      {
        System.err.println("\t" + err);
      }
    }
    return new JsonArray();
  }

  @SuppressWarnings("unused")
  private static void queryExample(RallyRestApi restApi) throws IOException
  {
    restApi.setApplicationName("QueryExample");

    LOG.debug("Querying for top 5 highest priority unfixed defects...");

    QueryRequest defects = new QueryRequest("defect");

    defects.setFetch(new Fetch("FormattedID", "Name", "State", "Priority"));
    defects.setQueryFilter(new QueryFilter("State", "<", "Fixed"));
    defects.setOrder("Priority ASC,FormattedID ASC");

    // Return up to 5, 1 per page
    defects.setPageSize(1);
    defects.setLimit(5);

    QueryResponse queryResponse = restApi.query(defects);
    if (queryResponse.wasSuccessful())
    {
      LOG.debug("Project: {}", defects.getProject());
      LOG.debug(String.format("\nTotal results: %d", queryResponse.getTotalResultCount()));
      LOG.debug("Top 5:");
      for (JsonElement result : queryResponse.getResults())
      {
        JsonObject defect = result.getAsJsonObject();
        LOG.debug(String.format("\t%s - %s: Priority=%s, State=%s", defect.get("FormattedID").getAsString(), defect.get("Name").getAsString(), defect
            .get("Priority").getAsString(), defect.get("State").getAsString()));
      }
    }
    else
    {
      System.err.println("The following errors occurred: ");
      for (String err : queryResponse.getErrors())
      {
        System.err.println("\t" + err);
      }
    }
  }

  private static void crudExample(RallyRestApi restApi) throws IOException
  {
    restApi.setApplicationName("CrudExample");
    // Create a defect
    LOG.debug("Creating defect...");
    JsonObject newDefect = new JsonObject();
    newDefect.addProperty("Name", "Test Defect");
    CreateRequest createRequest = new CreateRequest("defect", newDefect);
    CreateResponse createResponse = restApi.create(createRequest);
    LOG.debug(String.format("Created %s", createResponse.getObject().get("_ref").getAsString()));

    // Read defect
    String ref = Ref.getRelativeRef(createResponse.getObject().get("_ref").getAsString());
    LOG.debug(String.format("\nReading defect %s...", ref));
    GetRequest getRequest = new GetRequest(ref);
    GetResponse getResponse = restApi.get(getRequest);
    JsonObject obj = getResponse.getObject();
    LOG.debug(String.format("Read defect. Name = %s, State = %s", obj.get("Name").getAsString(), obj.get("State").getAsString()));

    // Update defect
    LOG.debug("\nUpdating defect state...");
    JsonObject updatedDefect = new JsonObject();
    updatedDefect.addProperty("State", "Fixed");
    UpdateRequest updateRequest = new UpdateRequest(ref, updatedDefect);
    UpdateResponse updateResponse = restApi.update(updateRequest);
    obj = updateResponse.getObject();
    LOG.debug(String.format("Updated defect. State = %s", obj.get("State").getAsString()));

    // Delete defect
    LOG.debug("\nDeleting defect...");
    DeleteRequest deleteRequest = new DeleteRequest(ref);
    DeleteResponse deleteResponse = restApi.delete(deleteRequest);
    if (deleteResponse.wasSuccessful())
    {
      LOG.debug("Deleted defect.");
    }
  }

  private static final Logger LOG = LoggerFactory.getLogger(RallyExample.class);
}
