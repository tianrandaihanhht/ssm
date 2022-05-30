<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/5/24
  Time: 15:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <table>
    <tr>
      <th>名称</th>
      <th>余额</th>
    </tr>

<c:forEach items="${allAccount}" var="acc">
  <tr>
    <td> ${acc.name}</td>
    <td> ${acc.money}</td>
  </tr>
</c:forEach>
  </table>
  </body>
</html>