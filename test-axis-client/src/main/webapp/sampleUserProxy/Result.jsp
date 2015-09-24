<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleUserProxyid" scope="session" class="com.nigel.test.UserProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleUserProxyid.setEndpoint(request.getParameter("endpoint"));
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
        String name_0id=  request.getParameter("name5");
            java.lang.String name_0idTemp = null;
        if(!name_0id.equals("")){
         name_0idTemp  = name_0id;
        }
        sampleUserProxyid.setName(name_0idTemp);
break;
case 7:
        gotMethod = true;
        java.lang.String welcome7mtemp = sampleUserProxyid.welcome();
if(welcome7mtemp == null){
%>
<%=welcome7mtemp %>
<%
}else{
        String tempResultreturnp8 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(welcome7mtemp));
        %>
        <%= tempResultreturnp8 %>
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