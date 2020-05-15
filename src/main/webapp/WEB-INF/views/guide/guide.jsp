<%@ page language="java" contentType="text/html;charset=utf-8" pageEncoding="utf-8"%>
<%@include file="/WEB-INF/views/common/taglib.jsp" %>

<!DOCTYPE html>
<html>

<head>

  <%@include file="/WEB-INF/views/common/meta.jsp" %>
  <%@include file="/WEB-INF/views/common/style.jsp" %>

  <title>INSPINIA | Main view</title>

</head>

<body>

  <div id="wrapper">

    <nav class="navbar-default navbar-static-side" role="navigation">
      <div class="sidebar-collapse">
        <ul class="nav metismenu" id="side-menu">
          <li class="nav-header">
            <div class="dropdown profile-element">
              <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                <span class="block m-t-xs font-bold">Example user</span>
                <span class="text-muted text-xs block">menu <b class="caret"></b></span>
              </a>
              <ul class="dropdown-menu animated fadeInRight m-t-xs">
                <li><a class="dropdown-item" href="login.html">Logout</a></li>
              </ul>
            </div>
            <div class="logo-element">
              IN+
            </div>
          </li>
          <li class="active">
            <a href="index.html"><i class="fa fa-th-large"></i> <span class="nav-label">Main view</span></a>
          </li>
          <li>
            <a href="minor.html"><i class="fa fa-th-large"></i> <span class="nav-label">Minor view</span> </a>
          </li>
        </ul>

      </div>
    </nav>

    <div id="page-wrapper" class="gray-bg">
      <div class="row border-bottom">
        <nav class="navbar navbar-static-top white-bg" role="navigation" style="margin-bottom: 0">
          <div class="navbar-header">
            <a class="navbar-minimalize minimalize-styl-2 btn btn-primary " href="#"><i class="fa fa-bars"></i> </a>
            <form role="search" class="navbar-form-custom" method="post" action="#">
              <div class="form-group">
                <input type="text" placeholder="Search for something..." class="form-control" name="top-search"
                  id="top-search">
              </div>
            </form>
          </div>
          <ul class="nav navbar-top-links navbar-right">
            <li>
              <a href="#">
                <i class="fa fa-sign-out"></i> Log out
              </a>
            </li>
          </ul>

        </nav>
      </div>
      <div class="wrapper wrapper-content animated fadeInRight">
        <div class="row">
          <div class="col-lg-12">
            <div class="text-center m-t-lg">
              <h1>
                INSPINIA Static Seed Project for BS4
              </h1>
              <small>
                It is an application skeleton for a typical web app. You can use it to quickly bootstrap your webapp
                projects and dev environment for these projects.
              </small>
            </div>
          </div>
        </div>
      </div>
      <div class="footer">
        <div class="pull-right">
          10GB of <strong>250GB</strong> Free.
        </div>
        <div>
          <strong>Copyright</strong> Example Company &copy; 2014-2019
        </div>
      </div>

    </div>
  </div>

  <%@include file="/WEB-INF/views/common/script.jsp" %>

</body>

</html>
