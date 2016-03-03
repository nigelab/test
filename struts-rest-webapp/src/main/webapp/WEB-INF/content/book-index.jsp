<%@ page contentType="text/html; charset=GBK" language="java" errorPage="" %> 
 <%@taglib prefix="s" uri="/struts-tags" %> 
 <!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
    "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"> 
 <html xmlns="http://www.w3.org/1999/xhtml"> 
 <head> 
    <title> 图书展示系统 </title> 
    <link href="<%=request.getContextPath() %>/css/demo.css"
        rel="stylesheet" type="text/css" /> 
 </head> 
 <body> 
 <%-- <s:actionmessage />  --%>
 <table> 
    <tr> 
        <th> ID</th> 
        <th> name </th> 
        <th> price </th> 
        <th> actions </th> 
    </tr> 
    <s:iterator value="model"> 
    <tr> 
        <td><s:property value="id"/></td> 
        <td><s:property value="name"/></td> 
        <td><s:property value="price"/></td> 
        <td><a href="book/<s:property value="id"/>"> View </a> | 
        <a href="book/<s:property value="id"/>/edit"> Edit </a> | 
        <a href="book/<s:property value="id"/>/deleteConfirm"> Delete </a></td> 
    </tr> 
    </s:iterator> 
 </table> 
 <a href="<%=request.getContextPath() %>/book/new"> Add new </a> 
 </body> 
 </html>