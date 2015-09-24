/**
 * E2SoapInterfacePortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri.e2_xsd.E2SoapInterface_wsdl;

public interface E2SoapInterfacePortType extends java.rmi.Remote {

    /**
     * Service definition of function e2__GetPropertyInfo
     */
    public org.tempuri.e2_xsd.PropertyInfo[] getPropertyInfo(java.lang.String[] propIdArr) throws java.rmi.RemoteException;

    /**
     * Service definition of function e2__GetPropertyExpandedStatus
     */
    public org.tempuri.e2_xsd.PropertyExpandedStatus[] getPropertyExpandedStatus(java.lang.String[] propIdArr) throws java.rmi.RemoteException;

    /**
     * Service definition of function e2__GetPropertyConfigValue
     */
    public org.tempuri.e2_xsd.PropertyValue[] getPropertyConfigValue(java.lang.String[] propIdArr) throws java.rmi.RemoteException;

    /**
     * Service definition of function e2__SetPropertyConfigValue
     */
    public org.tempuri.e2_xsd.PropertyStatus[] setPropertyConfigValue(org.tempuri.e2_xsd.PropertyValue[] propValueArray) throws java.rmi.RemoteException;

    /**
     * Service definition of function e2__OverridePropertyValue
     */
    public int overridePropertyValue(java.lang.String propId, boolean enable, int type, java.lang.String time, java.lang.String value) throws java.rmi.RemoteException;

    /**
     * Service definition of function e2__GetPropertyLog
     */
    public org.tempuri.e2_xsd.PropertyLogEntry[] getPropertyLog(java.lang.String propId) throws java.rmi.RemoteException;

    /**
     * Service definition of function e2__GetAlarmList
     */
    public org.tempuri.e2_xsd.AlarmInfo[] getAlarmList(java.lang.String controller, boolean filter) throws java.rmi.RemoteException;

    /**
     * Service definition of function e2__PerformAlarmAction
     */
    public int performAlarmAction(int action, int[] alarmIdArray, java.lang.String controller) throws java.rmi.RemoteException;

    /**
     * Service definition of function e2__GetApplicationList
     */
    public org.tempuri.e2_xsd.ApplicationInfo[] getApplicationList(java.lang.String controller) throws java.rmi.RemoteException;

    /**
     * Service definition of function e2__GetControllerList
     */
    public org.tempuri.e2_xsd.ControllerInfo[] getControllerList(int controllerType) throws java.rmi.RemoteException;

    /**
     * Service definition of function e2__GetThisControllerName
     */
    public java.lang.String getThisControllerName() throws java.rmi.RemoteException;

    /**
     * Service definition of function e2__GetThisControllerVersion
     */
    public java.lang.String getThisControllerVersion() throws java.rmi.RemoteException;
}
