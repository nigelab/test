package com.nigel.test;

public class UserProxy implements com.nigel.test.User {
  private String _endpoint = null;
  private com.nigel.test.User user = null;
  
  public UserProxy() {
    _initUserProxy();
  }
  
  public UserProxy(String endpoint) {
    _endpoint = endpoint;
    _initUserProxy();
  }
  
  private void _initUserProxy() {
    try {
      user = (new com.nigel.test.UserServiceLocator()).getUser();
      if (user != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)user)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)user)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (user != null)
      ((javax.xml.rpc.Stub)user)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.nigel.test.User getUser() {
    if (user == null)
      _initUserProxy();
    return user;
  }
  
  public java.lang.String getName() throws java.rmi.RemoteException{
    if (user == null)
      _initUserProxy();
    return user.getName();
  }
  
  public void setName(java.lang.String name) throws java.rmi.RemoteException{
    if (user == null)
      _initUserProxy();
    user.setName(name);
  }
  
  public java.lang.String welcome() throws java.rmi.RemoteException{
    if (user == null)
      _initUserProxy();
    return user.welcome();
  }
  
  
}