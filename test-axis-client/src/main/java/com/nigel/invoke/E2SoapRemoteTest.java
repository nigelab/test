package com.nigel.invoke;

import java.rmi.RemoteException;

import javax.xml.namespace.QName;
import javax.xml.rpc.ServiceException;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.encoding.XMLType;

public class E2SoapRemoteTest
{

  public static void main(String[] args)
  {
    E2SoapRemoteTest test = new E2SoapRemoteTest();
    String result = test.invokeRemoteFuc();
    System.out.println(result);
  }

  public String invokeRemoteFuc()
  {
    // Զ�̵���·��
    String endpoint = "http://10.161.92.140/soap";
    String result = "call failed!";
    Service service = new Service();
    Call call;

    try
    {
      call = (Call) service.createCall();
      call.setTargetEndpointAddress(endpoint);
      // ���õķ�����
      // call.setOperationName("GetThisControllerVersion");

      // ���ò�����
      // call.addParameter("name", // ������
      // XMLType.XSD_STRING, // ��������:String
      // ParameterMode.IN); // ����ģʽ��'IN' or 'OUT'

      // ���÷���ֵ����
      call.setReturnType(XMLType.XSD_STRING); // ����ֵ���ͣ�String
      // result = (String) call.invoke(new Object[] { /* name */ });// Զ�̵���
      // QName gete2info = new
      // QName("http://tempuri.org/e2.xsd/E2SoapInterface.wsdl","GetThisControllerVersion");
      // String localPart = "GetThisControllerVersion";
      String localPart = "GetThisControllerName";
      QName qname = new QName("http://tempuri.org/e2.xsd", localPart);
      result = (String) call.invoke(qname, new Object[] { /* name */ });// Զ�̵���
    }
    catch (ServiceException e)
    {
      e.printStackTrace();
    }
    catch (RemoteException e)
    {
      e.printStackTrace();
    }

    return result;
  }
}