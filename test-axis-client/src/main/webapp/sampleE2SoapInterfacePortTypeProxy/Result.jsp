<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleE2SoapInterfacePortTypeProxyid" scope="session" class="org.tempuri.e2_xsd.E2SoapInterface_wsdl.E2SoapInterfacePortTypeProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleE2SoapInterfacePortTypeProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleE2SoapInterfacePortTypeProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleE2SoapInterfacePortTypeProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        org.tempuri.e2_xsd.E2SoapInterface_wsdl.E2SoapInterfacePortType getE2SoapInterfacePortType10mtemp = sampleE2SoapInterfacePortTypeProxyid.getE2SoapInterfacePortType();
if(getE2SoapInterfacePortType10mtemp == null){
%>
<%=getE2SoapInterfacePortType10mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
</TABLE>
<%
}
break;
case 19:
        gotMethod = true;
        String propId_1id=  request.getParameter("propId22");
            java.lang.String propId_1idTemp = null;
        if(!propId_1id.equals("")){
         propId_1idTemp  = propId_1id;
        }
        String enable_2id=  request.getParameter("enable24");
        boolean enable_2idTemp  = Boolean.valueOf(enable_2id).booleanValue();
        String type_3id=  request.getParameter("type26");
        int type_3idTemp  = Integer.parseInt(type_3id);
        String time_4id=  request.getParameter("time28");
            java.lang.String time_4idTemp = null;
        if(!time_4id.equals("")){
         time_4idTemp  = time_4id;
        }
        String value_5id=  request.getParameter("value30");
            java.lang.String value_5idTemp = null;
        if(!value_5id.equals("")){
         value_5idTemp  = value_5id;
        }
        int overridePropertyValue19mtemp = sampleE2SoapInterfacePortTypeProxyid.overridePropertyValue(propId_1idTemp,enable_2idTemp,type_3idTemp,time_4idTemp,value_5idTemp);
        String tempResultreturnp20 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(overridePropertyValue19mtemp));
        %>
        <%= tempResultreturnp20 %>
        <%
break;
case 32:
        gotMethod = true;
        String propId_6id=  request.getParameter("propId35");
            java.lang.String propId_6idTemp = null;
        if(!propId_6id.equals("")){
         propId_6idTemp  = propId_6id;
        }
        org.tempuri.e2_xsd.PropertyLogEntry[] getPropertyLog32mtemp = sampleE2SoapInterfacePortTypeProxyid.getPropertyLog(propId_6idTemp);
if(getPropertyLog32mtemp == null){
%>
<%=getPropertyLog32mtemp %>
<%
}else{
        String tempreturnp33 = null;
        if(getPropertyLog32mtemp != null){
        java.util.List listreturnp33= java.util.Arrays.asList(getPropertyLog32mtemp);
        tempreturnp33 = listreturnp33.toString();
        }
        %>
        <%=tempreturnp33%>
        <%
}
break;
case 37:
        gotMethod = true;
        String controller_7id=  request.getParameter("controller40");
            java.lang.String controller_7idTemp = null;
        if(!controller_7id.equals("")){
         controller_7idTemp  = controller_7id;
        }
        String filter_8id=  request.getParameter("filter42");
        boolean filter_8idTemp  = Boolean.valueOf(filter_8id).booleanValue();
        org.tempuri.e2_xsd.AlarmInfo[] getAlarmList37mtemp = sampleE2SoapInterfacePortTypeProxyid.getAlarmList(controller_7idTemp,filter_8idTemp);
if(getAlarmList37mtemp == null){
%>
<%=getAlarmList37mtemp %>
<%
}else{
        String tempreturnp38 = null;
        if(getAlarmList37mtemp != null){
        java.util.List listreturnp38= java.util.Arrays.asList(getAlarmList37mtemp);
        tempreturnp38 = listreturnp38.toString();
        }
        %>
        <%=tempreturnp38%>
        <%
}
break;
case 44:
        gotMethod = true;
        String controller_9id=  request.getParameter("controller47");
            java.lang.String controller_9idTemp = null;
        if(!controller_9id.equals("")){
         controller_9idTemp  = controller_9id;
        }
        org.tempuri.e2_xsd.ApplicationInfo[] getApplicationList44mtemp = sampleE2SoapInterfacePortTypeProxyid.getApplicationList(controller_9idTemp);
if(getApplicationList44mtemp == null){
%>
<%=getApplicationList44mtemp %>
<%
}else{
        String tempreturnp45 = null;
        if(getApplicationList44mtemp != null){
        java.util.List listreturnp45= java.util.Arrays.asList(getApplicationList44mtemp);
        tempreturnp45 = listreturnp45.toString();
        }
        %>
        <%=tempreturnp45%>
        <%
}
break;
case 49:
        gotMethod = true;
        String controllerType_10id=  request.getParameter("controllerType52");
        int controllerType_10idTemp  = Integer.parseInt(controllerType_10id);
        org.tempuri.e2_xsd.ControllerInfo[] getControllerList49mtemp = sampleE2SoapInterfacePortTypeProxyid.getControllerList(controllerType_10idTemp);
if(getControllerList49mtemp == null){
%>
<%=getControllerList49mtemp %>
<%
}else{
        String tempreturnp50 = null;
        if(getControllerList49mtemp != null){
        java.util.List listreturnp50= java.util.Arrays.asList(getControllerList49mtemp);
        tempreturnp50 = listreturnp50.toString();
        }
        %>
        <%=tempreturnp50%>
        <%
}
break;
case 54:
        gotMethod = true;
        java.lang.String getThisControllerName54mtemp = sampleE2SoapInterfacePortTypeProxyid.getThisControllerName();
if(getThisControllerName54mtemp == null){
%>
<%=getThisControllerName54mtemp %>
<%
}else{
        String tempResultreturnp55 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getThisControllerName54mtemp));
        %>
        <%= tempResultreturnp55 %>
        <%
}
break;
case 57:
        gotMethod = true;
        java.lang.String getThisControllerVersion57mtemp = sampleE2SoapInterfacePortTypeProxyid.getThisControllerVersion();
if(getThisControllerVersion57mtemp == null){
%>
<%=getThisControllerVersion57mtemp %>
<%
}else{
        String tempResultreturnp58 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getThisControllerVersion57mtemp));
        %>
        <%= tempResultreturnp58 %>
        <%
}
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>