package com.nigel.test.axis2;

import javax.xml.namespace.QName;

import org.apache.axis2.AxisFault;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.rpc.client.RPCServiceClient;
import org.junit.Assert;
import org.junit.Test;

public class E2SoapRemoteTest
{

  public static void main(String[] args)
  {
    // TODO Auto-generated method stub

  }

  private static Object[] initAxisTest(QName testMethod, Object[] opArgs, Class[] returnTypes) throws AxisFault
  {
    RPCServiceClient serviceClient = new RPCServiceClient();
    Options options = serviceClient.getOptions();
    EndpointReference targetEPR = new EndpointReference("http://10.161.92.140/soap");
    options.setTo(targetEPR);
    // serviceClient.invokeBlocking(testMethod, opArgs, returnTypes);
    Object[] response = serviceClient.invokeBlocking(testMethod, opArgs, returnTypes);
    return response;
  }

  @Test
  public void testSayHello() throws AxisFault
  {
    Object[] opSayHelloArgs = new Object[] { /*"Mr Jack"*/ };
    Class[] returnTypes = new Class[] { String.class };
    QName opSayHello = new QName("http://tempuri.org/e2.xsd", "GetThisControllerName");
    Object[] response = initAxisTest(opSayHello, opSayHelloArgs, returnTypes);
    String result = (String) response[0];
    Assert.assertEquals("E2 Unit03", result);
  }
}
