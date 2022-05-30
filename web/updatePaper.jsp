<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<html>
<head>
    <title>修改论文</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    基于SSM框架的管理系统：简单实现增、删、改、查。
                </h1>
            </div>
        </div>
    </div>

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改论文</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="<%=basePath %>paper/updatePaper" method="post">
        <input type="hidden" name="id" value="${paper.id}"/>
        论文名称：
        <label>
            <input type="text" name="paper_name" value="${paper.paper_name}"/>
        </label>
        论文数量 ：
        <label>
            <input type="text" name="paper_num" value="${paper.paper_num}"/>
        </label>
        论文详情 ：
        <label>
            <input type="text" name="paper_detail" value="${paper.paper_detail}"/>
        </label>
        <input type="submit" value="提交"/>
    </form>
</div>