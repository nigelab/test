package org.tempuri.e2_xsd.E2SoapInterface_wsdl;

public class E2SoapInterfacePortTypeProxy implements org.tempuri.e2_xsd.E2SoapInterface_wsdl.E2SoapInterfacePortType {
  private String _endpoint = null;
  private org.tempuri.e2_xsd.E2SoapInterface_wsdl.E2SoapInterfacePortType e2SoapInterfacePortType = null;
  
  public E2SoapInterfacePortTypeProxy() {
    _initE2SoapInterfacePortTypeProxy();
  }
  
  public E2SoapInterfacePortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initE2SoapInterfacePortTypeProxy();
  }
  
  private void _initE2SoapInterfacePortTypeProxy() {
    try {
      e2SoapInterfacePortType = (new org.tempuri.e2_xsd.E2SoapInterface_wsdl.E2SoapInterfaceLocator()).getE2SoapInterface();
      if (e2SoapInterfacePortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)e2SoapInterfacePortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)e2SoapInterfacePortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (e2SoapInterfacePortType != null)
      ((javax.xml.rpc.Stub)e2SoapInterfacePortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.e2_xsd.E2SoapInterface_wsdl.E2SoapInterfacePortType getE2SoapInterfacePortType() {
    if (e2SoapInterfacePortType == null)
      _initE2SoapInterfacePortTypeProxy();
    return e2SoapInterfacePortType;
  }
  
  public org.tempuri.e2_xsd.PropertyInfo[] getPropertyInfo(java.lang.String[] propIdArr) throws java.rmi.RemoteException{
    if (e2SoapInterfacePortType == null)
      _initE2SoapInterfacePortTypeProxy();
    return e2SoapInterfacePortType.getPropertyInfo(propIdArr);
  }
  
  public org.tempuri.e2_xsd.PropertyExpandedStatus[] getPropertyExpandedStatus(java.lang.String[] propIdArr) throws java.rmi.RemoteException{
    if (e2SoapInterfacePortType == null)
      _initE2SoapInterfacePortTypeProxy();
    return e2SoapInterfacePortType.getPropertyExpandedStatus(propIdArr);
  }
  
  public org.tempuri.e2_xsd.PropertyValue[] getPropertyConfigValue(java.lang.String[] propIdArr) throws java.rmi.RemoteException{
    if (e2SoapInterfacePortType == null)
      _initE2SoapInterfacePortTypeProxy();
    return e2SoapInterfacePortType.getPropertyConfigValue(propIdArr);
  }
  
  public org.tempuri.e2_xsd.PropertyStatus[] setPropertyConfigValue(org.tempuri.e2_xsd.PropertyValue[] propValueArray) throws java.rmi.RemoteException{
    if (e2SoapInterfacePortType == null)
      _initE2SoapInterfacePortTypeProxy();
    return e2SoapInterfacePortType.setPropertyConfigValue(propValueArray);
  }
  
  public int overridePropertyValue(java.lang.String propId, boolean enable, int type, java.lang.String time, java.lang.String value) throws java.rmi.RemoteException{
    if (e2SoapInterfacePortType == null)
      _initE2SoapInterfacePortTypeProxy();
    return e2SoapInterfacePortType.overridePropertyValue(propId, enable, type, time, value);
  }
  
  public org.tempuri.e2_xsd.PropertyLogEntry[] getPropertyLog(java.lang.String propId) throws java.rmi.RemoteException{
    if (e2SoapInterfacePortType == null)
      _initE2SoapInterfacePortTypeProxy();
    return e2SoapInterfacePortType.getPropertyLog(propId);
  }
  
  public org.tempuri.e2_xsd.AlarmInfo[] getAlarmList(java.lang.String controller, boolean filter) throws java.rmi.RemoteException{
    if (e2SoapInterfacePortType == null)
      _initE2SoapInterfacePortTypeProxy();
    return e2SoapInterfacePortType.getAlarmList(controller, filter);
  }
  
  public int performAlarmAction(int action, int[] alarmIdArray, java.lang.String controller) throws java.rmi.RemoteException{
    if (e2SoapInterfacePortType == null)
      _initE2SoapInterfacePortTypeProxy();
    return e2SoapInterfacePortType.performAlarmAction(action, alarmIdArray, controller);
  }
  
  public org.tempuri.e2_xsd.ApplicationInfo[] getApplicationList(java.lang.String controller) throws java.rmi.RemoteException{
    if (e2SoapInterfacePortType == null)
      _initE2SoapInterfacePortTypeProxy();
    return e2SoapInterfacePortType.getApplicationList(controller);
  }
  
  public org.tempuri.e2_xsd.ControllerInfo[] getControllerList(int controllerType) throws java.rmi.RemoteException{
    if (e2SoapInterfacePortType == null)
      _initE2SoapInterfacePortTypeProxy();
    return e2SoapInterfacePortType.getControllerList(controllerType);
  }
  
  public java.lang.String getThisControllerName() throws java.rmi.RemoteException{
    if (e2SoapInterfacePortType == null)
      _initE2SoapInterfacePortTypeProxy();
    return e2SoapInterfacePortType.getThisControllerName();
  }
  
  public java.lang.String getThisControllerVersion() throws java.rmi.RemoteException{
    if (e2SoapInterfacePortType == null)
      _initE2SoapInterfacePortTypeProxy();
    return e2SoapInterfacePortType.getThisControllerVersion();
  }
  
  
}