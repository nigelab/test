package json;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import json.node.Node;

/*import com.cpcus.oxygen.beans.ActionXmlBean;
import com.cpcus.oxygen.beans.Operation;
import com.cpcus.oxygen.beans.TestCaseXmlBean;
import com.cpcus.oxygen.beans.VerificationXmlBean;*/
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.InstanceCreator;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

public class GsonTest1
{

 /* public static void main(String[] args)
  {
    // TODO Auto-generated method stub
    ActionXmlBean action = new ActionXmlBean();
    action.setPage("testPage");
    action.setWidget("testWidget");
    action.setMethod("testMethod");
    action.setVariable("@varname");
    VerificationXmlBean verification = new VerificationXmlBean();
    verification.setPage("testPage");
    verification.setWidget("testWidget");
    verification.setMethod("testMethod");
    verification.setExpectedValue("user");
    List<Operation> ops = new ArrayList<Operation>();
    ops.add(action);
    ops.add(verification);
    TestCaseXmlBean bean = new TestCaseXmlBean();
    bean.setOperations(ops);
    Gson GSON = new GsonBuilder().registerTypeAdapter(Operation.class, new GsonTest1().new OperationInterfaceDeserializer()).setPrettyPrinting().create();
    String jsonop = GSON.toJson(action);
    System.out.println(jsonop);

    // Class<Object> classOfT = Operation.class;
    // GSON.registerInstanceCreator(Operation.class, new
    // OperationInstanceCreator());
    Operation op = GSON.fromJson(jsonop, Operation.class);
    printOP(op);
    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    String json = gson.toJson(bean);
    System.out.println(json);
    TestCaseXmlBean testcase = GSON.fromJson(json, TestCaseXmlBean.class);
    for(Operation op1 : testcase.getOperations()){
      printOP(op1);
    }
//    System.out.println(gson.toJson(testcase));
  }

  private static void printOP(Operation op)
  {
    if (op.getClass().isAssignableFrom(ActionXmlBean.class))
    {
      System.out.println(((ActionXmlBean) op).getVariable());
    }
    else if (op.getClass().isAssignableFrom(VerificationXmlBean.class))
    {
      System.out.println(((VerificationXmlBean) op).getExpectedValue());
    }
  }*/

  /*
   * public class MyInstanceCreator implements InstanceCreator<A.B> { private
   * final A a; public MyInstanceCreator(A a) { this.a = a; } public A.B
   * createInstance(Type type) { return a.new B(); }
   * 
   * @Override public B createInstance(Type arg0) { // TODO Auto-generated
   * method stub return null; } }
   */

  /*
   * class MyListInstanceCreator implements InstanceCreator<MyList<?>> {
   * 
   * @SuppressWarnings("unchecked") public MyList<?> createInstance(Type type) {
   * // No need to use a parameterized list since the actual instance will have
   * the raw type anyway. return new MyList(); }
   */

  /*
   * class OperationInstanceCreator implements InstanceCreator<Operation> {
   * 
   * @SuppressWarnings("unchecked") public Operation createInstance(Type type) {
   * // Type[] typeParameters =
   * ((ParameterizedType)type).getActualTypeArguments(); // No need to use a
   * parameterized list since the actual instance will have // the raw type
   * anyway. if(type.equals(ActionXmlBean.class)){ return new ActionXmlBean();
   * }else if(type.equals(VerificationXmlBean.class)){ return new
   * VerificationXmlBean(); } return null; } }
   */

  /*class OperationInterfaceDeserializer implements JsonDeserializer<Operation>
  {
    @Override
    public Operation deserialize(JsonElement json, Type arg1, JsonDeserializationContext arg2) throws JsonParseException
    {
      if (json.isJsonObject())
      {
        JsonObject jsonObject = json.getAsJsonObject();
        if (jsonObject.get("variable") != null)
        {
          return new Gson().fromJson(json, ActionXmlBean.class);
        }
        else if (jsonObject.get("expectedValue") != null)
        {
          return new Gson().fromJson(json, VerificationXmlBean.class);
        }
      }
      // TODO Auto-generated method stub
      return null;
    }

  }*/
}
