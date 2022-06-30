<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--@elvariable id="personPro" type="eu.ibacz.sample.portlet.bascispring.pto.PersonPto"--%>
<%@include file="../init.jspf"%>

<%@ page import="static org.osgiray.springmvc.ftb.util.BasicSpringPortletConstants.*" %>

<h1>Jars</h1><% 
for ( String jarWithVersion : JAR_VERSIONS ) { %>
<p><%=jarWithVersion %></p><% 
} %>
