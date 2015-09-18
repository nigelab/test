package json;

import com.cpcus.oxygen.beans.GroupBean;
import com.cpcus.oxygen.beans.SingleBean;
import com.cpcus.oxygen.beans.SuiteBean;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.gson.Gson;
import com.oxygen.core.beans.TestCaseBean;

public class SuiteXmlTest
{

  public static void main(String[] args)
  {
    SuiteBean suite = new SuiteXmlTest().buildSuite();
    String json = new Gson().toJson(suite);
    System.out.println(json);
  }

  SuiteBean buildSuite()
  {
    TestCaseBean bean = new TestCaseBean();
    bean.setAuthor("Nigel.Zheng");
    SingleBean single = new SingleBean();
    single.setRefId("Application/ AHU/ Alarm/ Ctrl_Temp_UNOCC_Critical");
    single.setBean(bean);
    single.setBrowser("FF");
//    single.setUrl(bean.getUrl());
    //single.setRefId(bean.getTestCaseId());

    GroupBean group = new GroupBean();
    group.setSingles(Lists.newArrayList(single));

    SuiteBean suite = new SuiteBean();
    suite.setGroups(Sets.newHashSet(group));
    return suite;
  }

}
