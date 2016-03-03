<%@ page contentType="text/html; charset=GBK" language="java" errorPage="" %> 
 <%@taglib prefix="s" uri="/struts-tags" %> 
 <!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
    "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"> 
 <html xmlns="http://www.w3.org/1999/xhtml"> 
 <head> 
    <title> modify ID#  <s:property value="id"/> book</title> 
    <link href="<%=request.getContextPath() %>/css/demo.css"
        rel="stylesheet" type="text/css" /> 
 </head> 
 <body> 
 <s:form method="post" 
    action="%{#request.contextPath}/book/%{id}"> 
 <s:hidden name="_method" value="put" /> 
 <table> 
    <s:textfield name="id" label="Book ID" disabled="true"/> 
    <s:textfield name="name" label="Book Name" disabled="true"/> 
    <s:textfield name="price" label="Book Price" disabled="true"/> 
 </table> 
 </s:form> 
 <a href="<%=request.getContextPath() %>/book"> return </a> 
 </body> 
 </html>