<%@ page language="java" contentType="text/html;charset=utf-8" pageEncoding="utf-8"%>
<%@include file="/WEB-INF/views/common/taglib.jsp" %>

<!DOCTYPE html>
  <html>

  <head>
    <%@include file="/WEB-INF/views/common/meta.jsp" %>
    <%@include file="/WEB-INF/views/common/style.jsp" %>

    <title>INSPINIA Admin Theme Documentation</title>

    <style>
      .documentation .jumbotron .row {
        padding-top: 60px;
      }

      .anchor {
        padding-top: 50px;
      }
    </style>
  </head>

  <body>
    <div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="/">INSPINIA - Documentation</a>
          <a class="navbar-brand" href="/guide">Guide Page</a>
        </div>
      </div>
    </div>

    <div class="jumbotron">
      <div class="container">
        <div class="row">
          <div class="col-md-6">
            <h2>INSPINIA - Responsible Admin Theme</h2>

            <p>Thank you for purchasing INSPINIA admin theme. If you have any questions about the template, please feel
              free to contact us via email: <a
                href="mailto:support@webapplayers.com">support@webapplayers.com</a>.<br />
              Thanks very much!</p>
            <small>

              <strong>Documentation created:</strong> 19/05/2014<br />
              <strong>Latest update:</strong> 12/11/2019<br />
              <strong>By:</strong> WebAppLayers Team<br />
              <strong>Theme Version:</strong> 2.9.3<br />

            </small>
            <br />
          </div>
          <div class="col-md-6">
            <img src="/resources/images/preview.png" alt="screen" class="img-responsive" />

          </div>
        </div>

      </div>
    </div>

    <div class="container">
      <input type="button" id="guideButton" value="API 테스트" />
      <input type="button" id="guideButton2" value="API 테스트 (마이바티스)" />
      <input type="button" id="guideButton3" value="API 테스트 (JPA)" />

      <div class="row">

        <div class="col-lg-12">

          <h2>
            Table of Contents
          </h2>

          <ul>

            <li><a href="#documentation">About documentation</a></li>
            <li><a href="#folder_structure">Folder structure</a></li>
            <li><a href="#layout_structure">Layout structure</a></li>
            <li>
              <a href="#options">Options</a>
              <ul>
                <li><a href="#fixed_sidebar">Fixed sidebar</a></li>
                <li><a href="#fixed_navbar">Fixed navbar</a></li>
                <li><a href="#fixed_navbar2">Fixed navbar v.2</a></li>
                <li><a href="#fixed_footer">Fixed footer</a></li>
                <li><a href="#rtl_support">RTL support</a></li>
                <li><a href="#layout_2">Layout 2</a></li>
                <li><a href="#off_canvas_menu">Off canvas menu</a></li>
                <li><a href="#skins">Skins</a></li>
                <li><a href="#themeconfig">Theme config</a></li>
              </ul>
            </li>
            <li><a href="#seed_project">Seed Project</a></li>
            <li><a href="#change_log">Change log v.2.9.2 -> v.2.9.3</a></li>
            <li><a href="#change_log">Change log v.2.8 -> v.2.9.2</a></li>
            <li><a href="#change_log">Change log v.2.7.1 -> v.2.8</a></li>
            <li><a href="#change_log">Change log v.2.6.7 -> v.2.7.1</a></li>
            <li><a href="#change_log">Change log v.2.6.2 -> v.2.7</a></li>
            <li><a href="#change_log">Change log v.2.6 -> v.2.6.2</a></li>
            <li><a href="#change_log">Change log v.2.5 -> v.2.6</a></li>
            <li><a href="#change_log">Change log v.2.4 -> v.2.5</a></li>
            <li><a href="#change_log">Change log v.2.3 -> v.2.4</a></li>
            <li><a href="#change_log">Change log v.2.2 -> v.2.3</a></li>
            <li><a href="#change_log">Change log v.2.0/2.1 -> v.2.2</a></li>
            <li><a href="#change_log">Change log v.2.0 -> v.2.1</a></li>
            <li><a href="#change_log">Change log v.1.9 -> v.2.0</a></li>
            <li><a href="#change_log">Change log v.1.9 -> v.1.9.2</a></li>
            <li><a href="#change_log">Change log v.1.8 -> v.1.9</a></li>
            <li><a href="#contact">Contacts</a></li>


          </ul>


        </div>

      </div>

      <div class="row">
        <div class="col-md-12">
          <a name="documentation" class="anchor"></a>
          <h3>About the template</h3>

          <p>INSPINIA has a clean and minimalistic design which helps you create an awesome and powerful project. It is
            perfectly designed and precisely prepared. Template was built based on the latest
            standards and recommendations. INSPINIA theme
            is powered by Twitter Bootstrap v4 - the most popular front-end framework.<br />

            Please note that this documentation is dedicated to the main element of the template. With each version, we
            will try to develop it. But if you have any questions going beyond what is described
            here don't hesitate to write to us.</p>




          <div class="row">
            <a name="folder_structure" class="anchor"></a>
            <div class="col-md-6">
              <h3>Structure</h3>
              <h4>Folders and files</h4>

              <div>
                <pre class="prettyprint linenums">
<code>HTML5_Full_Version/
    ├── <strong>css/</strong>
    ├── <strong>email_templates/</strong>
    ├── <strong>font-awesome/</strong>
    ├── <strong>fonts/</strong>
    ├── <strong>img/</strong>
    ├── <strong>js/</strong>
    ├── 404.html
    ├── 500.html
    ├── agile_board.html
    ├── article.html
    ├── badges_labels.html
    ├── basic_gallery.html
    ├── blog.html
    ├── buttons.html
    ├── calendar.html
    ├── carousel.html
    ├── chat_view.html
    ├── clients.html
    ├── code_editor.html
    ├── contacts.html
    ├── css_animation.html
    ├── dashboard_2.html
    ├── dashboard_3.html
    ├── dashboard_4.html
    ├── dashboard_4_1.html
        ...
</code></pre>
              </div>

            </div>
            <div class="col-md-6">
              <h3>Main HTML elements</h3>

              <p>Theme files have almost unchanging structure consisting of:</p>
              <ol>
                <li><code>#wrapper</code> main container of body elements.</li>
                <li><code>nav .navbar-static-side</code> left navigation <b>menu</b>.</li>
                <li><code>#page-wrapper</code> main container for page elements.</li>
                <li><code>nav .navbar-static-top</code> top navigation with second menu.</li>
                <li><code>.page-heading</code> container with page title and breadcrumb</li>
                <li><code>.wrapper-content</code> main container for html elements.</li>
                <li><code>.footer</code> main container for footer.</li>
              </ol>

              <a target="_blank" href="/resources/images/page.png"><img class="img-responsive" src="/resources/images/page.png"
                  alt="page structure"></a>
            </div>
          </div>
          <div class="row">
            <a name="layout_structure" class="anchor"></a>
            <div class="col-lg-12">
              <h3>Layout structure</h3>

              <p>Page <code>&lt;head /&gt;</code> contains Metadata, CSS files.</p>
              <pre class="prettyprint linenums">
&lt;!DOCTYPE html>
&lt;head>

    &lt;!-- Metadata --&gt;
    &lt;meta charset="utf-8"&gt;
    &lt;meta name="viewport" content="width=device-width, initial-scale=1.0"&gt;
    &lt;title&gt;INSPINIA | Page&lt;/title&gt;

    &lt;!-- CSS Files --&gt;
    &lt;link href="css/bootstrap.min.css" rel="stylesheet"&gt;
    &lt;link href="font-awesome/css/font-awesome.css" rel="stylesheet"&gt;
    &lt;link href="css/animate.css" rel="stylesheet"&gt;
    &lt;link href="css/style.css" rel="stylesheet"&gt;

&lt;/head&gt;</pre>

              <hr>
              <h3>Main menu - navigation</h3>

              <p>Navigation menu with profile submenu.</p>
              <pre class="prettyprint linenums">
&lt;ul class="nav" id="side-menu"&gt;
    &lt;li class="nav-header"&gt;
        &lt;div class="dropdown profile-element"&gt; &lt;span&gt;
            &lt;img alt="image" class="img-circle" src="/resources/images/profile_small.jpg"&gt;
             &lt;/span&gt;
            &lt;a data-toggle="dropdown" class="dropdown-toggle" href="#"&gt;
            &lt;span class="clear"&gt; &lt;span class="block m-t-xs"&gt; &lt;strong class="font-bold"&gt;Amelia Smith&lt;/strong&gt;
             &lt;/span&gt; &lt;span class="text-muted text-xs block"&gt;Art Director &lt;b class="caret"&gt;&lt;/b&gt;&lt;/span&gt; &lt;/span&gt; &lt;/a&gt;
            &lt;ul class="dropdown-menu animated fadeInRight m-t-xs"&gt;
                &lt;li&gt;&lt;a href="profile.html"&gt;Profile&lt;/a&gt;&lt;/li&gt;
                &lt;li&gt;&lt;a href="contacts.html"&gt;Contacts&lt;/a&gt;&lt;/li&gt;
                &lt;li&gt;&lt;a href="mailbox.html"&gt;Mailbox&lt;/a&gt;&lt;/li&gt;
                &lt;li class="divider"&gt;&lt;/li&gt;
                &lt;li&gt;&lt;a href="login.html"&gt;Logout&lt;/a&gt;&lt;/li&gt;
            &lt;/ul&gt;
        &lt;/div&gt;
        &lt;div class="logo-element"&gt;
            IN+
        &lt;/div&gt;
    &lt;/li&gt;
    &lt;li&gt;
        &lt;!-- All li elements o navigation --&gt;
    &lt;/li&gt;

&lt;/ul&gt; </pre>
              <hr>
              <h3>Second menu</h3>

              <p>Menu for notifications and primary functions such as logout or global search.</p>
              <pre class="prettyprint linenums">
&lt;nav class="navbar navbar-static-top  " role="navigation"&gt;
        &lt;div class="navbar-header"&gt;
            &lt;a class="navbar-minimalize minimalize-styl-2 btn btn-primary " href="#"&gt;&lt;i class="fa fa-bars"&gt;&lt;/i&gt; &lt;/a&gt;
            &lt;form role="search" class="navbar-form-custom" method="post" action="search_results.html"&gt;
                &lt;div class="form-group"&gt;
                    &lt;input type="text" placeholder="Search for something..." class="form-control" name="top-search" id="top-search"&gt;
                &lt;/div&gt;
            &lt;/form&gt;
        &lt;/div&gt;
            &lt;ul class="nav navbar-top-links navbar-right"&gt;
                &lt;li&gt;
                    &lt;span class="m-r-sm text-muted welcome-message"&gt;Welcome to INSPINIA+ Admin Theme.&lt;/span&gt;
                &lt;/li&gt;
                &lt;li class="dropdown"&gt;
                    &lt;a class="dropdown-toggle count-info" data-toggle="dropdown" href="#"&gt;
                        &lt;i class="fa fa-envelope"&gt;&lt;/i&gt;  &lt;span class="label label-warning"&gt;16&lt;/span&gt;
                    &lt;/a&gt;
                    &lt;ul class="dropdown-menu dropdown-messages"&gt;
                        &lt;li&gt;
                            &lt;div class="dropdown-messages-box"&gt;
                                &lt;a href="profile.html" class="pull-left"&gt;
                                    &lt;img alt="image" class="img-circle" src="/resources/images/a7.jpg"&gt;
                                &lt;/a&gt;
                                &lt;div class="media-body"&gt;
                                    &lt;small class="pull-right"&gt;46h ago&lt;/small&gt;
                                    &lt;strong&gt;Mike Loreipsum&lt;/strong&gt; started following &lt;strong&gt;Monica Smith&lt;/strong&gt;. &lt;br&gt;
                                    &lt;small class="text-muted"&gt;3 days ago at 7:58 pm - 10.06.2014&lt;/small&gt;
                                &lt;/div&gt;
                            &lt;/div&gt;
                        &lt;/li&gt;
                        &lt;li class="divider"&gt;&lt;/li&gt;
                        &lt;li&gt;
                            &lt;div class="dropdown-messages-box"&gt;
                                &lt;a href="profile.html" class="pull-left"&gt;
                                    &lt;img alt="image" class="img-circle" src="/resources/images/a4.jpg"&gt;
                                &lt;/a&gt;
                                &lt;div class="media-body "&gt;
                                    &lt;small class="pull-right text-navy"&gt;5h ago&lt;/small&gt;
                                    &lt;strong&gt;Chris Johnatan Overtunk&lt;/strong&gt; started following &lt;strong&gt;Monica Smith&lt;/strong&gt;. &lt;br&gt;
                                    &lt;small class="text-muted"&gt;Yesterday 1:21 pm - 11.06.2014&lt;/small&gt;
                                &lt;/div&gt;
                            &lt;/div&gt;
                        &lt;/li&gt;
                        &lt;li class="divider"&gt;&lt;/li&gt;
                        &lt;li&gt;
                            &lt;div class="dropdown-messages-box"&gt;
                                &lt;a href="profile.html" class="pull-left"&gt;
                                    &lt;img alt="image" class="img-circle" src="/resources/images/profile.jpg"&gt;
                                &lt;/a&gt;
                                &lt;div class="media-body "&gt;
                                    &lt;small class="pull-right"&gt;23h ago&lt;/small&gt;
                                    &lt;strong&gt;Monica Smith&lt;/strong&gt; love &lt;strong&gt;Kim Smith&lt;/strong&gt;. &lt;br&gt;
                                    &lt;small class="text-muted"&gt;2 days ago at 2:30 am - 11.06.2014&lt;/small&gt;
                                &lt;/div&gt;
                            &lt;/div&gt;
                        &lt;/li&gt;
                        &lt;li class="divider"&gt;&lt;/li&gt;
                        &lt;li&gt;
                            &lt;div class="text-center link-block"&gt;
                                &lt;a href="mailbox.html"&gt;
                                    &lt;i class="fa fa-envelope"&gt;&lt;/i&gt; &lt;strong&gt;Read All Messages&lt;/strong&gt;
                                &lt;/a&gt;
                            &lt;/div&gt;
                        &lt;/li&gt;
                    &lt;/ul&gt;
                &lt;/li&gt;
                &lt;li class="dropdown"&gt;
                    &lt;a class="dropdown-toggle count-info" data-toggle="dropdown" href="#"&gt;
                        &lt;i class="fa fa-bell"&gt;&lt;/i&gt;  &lt;span class="label label-primary"&gt;8&lt;/span&gt;
                    &lt;/a&gt;
                    &lt;ul class="dropdown-menu dropdown-alerts"&gt;
                        &lt;li&gt;
                            &lt;a href="mailbox.html"&gt;
                                &lt;div&gt;
                                    &lt;i class="fa fa-envelope fa-fw"&gt;&lt;/i&gt; You have 16 messages
                                    &lt;span class="pull-right text-muted small"&gt;4 minutes ago&lt;/span&gt;
                                &lt;/div&gt;
                            &lt;/a&gt;
                        &lt;/li&gt;
                        &lt;li class="divider"&gt;&lt;/li&gt;
                        &lt;li&gt;
                            &lt;a href="profile.html"&gt;
                                &lt;div&gt;
                                    &lt;i class="fa fa-twitter fa-fw"&gt;&lt;/i&gt; 3 New Followers
                                    &lt;span class="pull-right text-muted small"&gt;12 minutes ago&lt;/span&gt;
                                &lt;/div&gt;
                            &lt;/a&gt;
                        &lt;/li&gt;
                        &lt;li class="divider"&gt;&lt;/li&gt;
                        &lt;li&gt;
                            &lt;a href="grid_options.html"&gt;
                                &lt;div&gt;
                                    &lt;i class="fa fa-upload fa-fw"&gt;&lt;/i&gt; Server Rebooted
                                    &lt;span class="pull-right text-muted small"&gt;4 minutes ago&lt;/span&gt;
                                &lt;/div&gt;
                            &lt;/a&gt;
                        &lt;/li&gt;
                        &lt;li class="divider"&gt;&lt;/li&gt;
                        &lt;li&gt;
                            &lt;div class="text-center link-block"&gt;
                                &lt;a href="notifications.html"&gt;
                                    &lt;strong&gt;See All Alerts&lt;/strong&gt;
                                    &lt;i class="fa fa-angle-right"&gt;&lt;/i&gt;
                                &lt;/a&gt;
                            &lt;/div&gt;
                        &lt;/li&gt;
                    &lt;/ul&gt;
                &lt;/li&gt;
                &lt;li&gt;
                    &lt;a href="login.html"&gt;
                        &lt;i class="fa fa-sign-out"&gt;&lt;/i&gt; Log out
                    &lt;/a&gt;
                &lt;/li&gt;
            &lt;/ul&gt;
&lt;/nav&gt;

                </pre>
              <hr>
              <h3>Content</h3>

              <p>Main content wrapper with page heading and page content.</p>
              <pre class="prettyprint linenums">
&lt;div class="row wrapper border-bottom white-bg page-heading"&gt;
                &lt;div class="col-lg-9"&gt;
                    &lt;h2&gt;This is main title&lt;/h2&gt;
                    &lt;ol class="breadcrumb"&gt;
                        &lt;li&gt;
                            &lt;a href="index.html"&gt;This is&lt;/a&gt;
                        &lt;/li&gt;
                        &lt;li class="active"&gt;
                            &lt;strong&gt;Breadcrumb&lt;/strong&gt;
                        &lt;/li&gt;
                    &lt;/ol&gt;
                &lt;/div&gt;
                &lt;div class="col-lg-3"&gt;
                    &lt;div class="title-action"&gt;
                        &lt;a href="" class="btn btn-primary"&gt;This is action area&lt;/a&gt;
                    &lt;/div&gt;
                &lt;/div&gt;
            &lt;/div&gt;
        &lt;div class="row"&gt;
            &lt;div class="col-lg-12"&gt;
                &lt;div class="wrapper wrapper-content"&gt;

                &lt;/div&gt;
            &lt;/div&gt;
&lt;/div&gt;
                </pre>

              <hr>


              <a name="options" class="anchor"></a>
              <h3>Options</h3>

              <p>
                Inspinia provide few option for you layout app. There are:

                <ul>
                  <li>Fixed sidebar</li>
                  <li>Fixed navbar</li>
                  <li>Fixed footer</li>
                  <li>RTL support</li>
                  <li>Layout 2 (top navigation)</li>
                  <li>Skins</li>
                </ul>

              </p>


              <a name="fixed_sidebar" class="anchor"></a>
              <h4>Fixed sidebar</h4>

              <p>
                Fixed sidebar is a sidebar that is sticked on screen.

              </p>
              <p>
                To add fixed sidebar you need to add .fixed-sidebar class to body.
              </p>

              <pre class="prettyprint linenums">

    &lt;body class="fixed-sidebar"&gt;

</pre>

              <p>
                Be sure that you have included this files to your index.html file:

                <pre class="prettyprint linenums">

        &lt;!-- SlimScroll --&gt;
        &lt;script src="js/plugins/slimscroll/jquery.slimscroll.min.js"&gt;&lt;/script&gt;

    </pre>

              </p>

              <a name="fixed_navbar" class="anchor"></a>
              <h4>Fixed navbar</h4>

              <p>
                Fixed navbar is a top navbar that is sticked on screen.

              </p>
              <p>
                To add fixed sidebar you need to add .fixed-nav class to body.
              </p>

              <pre class="prettyprint linenums">

    &lt;body class="fixed-nav"&gt;

</pre>

              <p>
                Next we will need to change navbar from static to fixed. Change .navbar-static-top class to
                navbar-fixed-top

              </p>

              <a name="fixed_navbar2" class="anchor"></a>
              <h4>Fixed navbar 2</h4>

              <p>
                Fixed navbar 2 is a top navbar that is sticked on screen and it's width is the same as the width of
                wrapper

              </p>
              <p>
                To add fixed sidebar you need to add .fixed-nav class and .fixed-nav-basic class to body.
              </p>

              <pre class="prettyprint linenums">

    &lt;body class="fixed-nav fixed-nav-basic"&gt;

</pre>

              <p>
                Next we will need to change navbar from static to fixed. Change .navbar-static-top class to
                navbar-fixed-top

              </p>


              <pre class="prettyprint linenums">

&lt;nav class="navbar navbar-fixed-top" role="navigation"&gt;

</pre>


              <p>
                Fixed navbar 2 works only on primary layout

              </p>


              <a name="fixed_footer" class="anchor"></a>
              <h4>Fixed footer</h4>

              <p>
                Fixed footer is a bottom footer that is sticked on screen.

              </p>
              <p>
                To add fixed bottom footer you just need to add .fixed class to footer class.
              </p>

              <pre class="prettyprint linenums">

    &lt;div class="footer fixed"&gt;

</pre>

              <a name="rtl_support" class="anchor"></a>
              <h4>Right-to-Left Language Support </h4>

              <p>
                Adding support for language written in a Right-To-Left (RTL) direction.

              </p>
              <p>
                To add RTL support you will need to add new .rtls class to body element
              </p>

              <pre class="prettyprint linenums">

    &lt;body class="rtls"&gt;

</pre>

              <p>
                Next you will need to add new bootstrap rtl support library bootstrap-rtl. Add new link to css file just
                below the css from bootstrap in index.html page like this:
              </p>

              <pre class="prettyprint linenums">

    &lt;!-- Bootstrap --&gt;
    &lt;link href="css/bootstrap.min.css" rel="stylesheet"&gt;
    &lt;link href="css/plugins/bootstrap-rtl/bootstrap-rtl.min.css" rel="stylesheet"&gt;

</pre>

              <p>
                After that you will have RTL support similar to this:

              </p>

              <img class="img-responsive" src="/resources/images/rtl_support.png" alt="">




              <a name="layout_2" class="anchor"></a>
              <h4>Layout 2</h4>

              <p>
                Layout 2 is a top navigation with centered content layout.

              </p>
              <p>
                For layout 2 we prepared special example files dashboard_4.html
              </p>

              <p>
                To use layout 2 all you need to do remove full <code>nav</code> element (sidebar navigation). Add
                <code>.top-navigation</code> class to body element and add <code>.container</code> class with element
                after
                <code>.wrapper</code> class element. Please chcek teh example file Dashboard_4.html to see code of it.
              </p>

              <p>
                Layout 2 with example code look like this:

              </p>

              <img class="img-responsive" src="/resources/images/Dashboard_4.png" alt="">

              <a name="off_canvas_menu" class="anchor"></a>
              <h4>Off canvas menu</h4>

              <p>
                Off canvas menu is a menu that not change the width of main wrapper page. It appear on top of the page.

              </p>

              <p>
                To use off canvas menu you just need to add <code>.canvas-menu</code> to body element:

              </p>
              <pre class="prettyprint linenums">

    &lt;body class="canvas-menu"&gt;

</pre>

              <p>And in navigation after element with class <code>.sidebar-collapse</code> add special element to handle
                hide menu.</p>

              <pre class="prettyprint linenums">

            &lt;a class="close-canvas-menu"&gt;&lt;i class="fa fa-times"&gt;&lt;/i&gt;&lt;/a&gt;

</pre>


              <a name="skins" class="anchor"></a>
              <h4>Skins</h4>

              <p>Inspinai theme has 3 diferent skins</p>

              <p><strong>To change skin you just have to add skin class to body element.</strong></p>

              <p>For example: to add skin Blue skin you just need to add <code>.skin-1</code> class to body element.</p>

              <p>In LESS files skins.less you can find style for the skin. Below is a representation of css classes
                demand color skin.</p>
              <ul>
                <li><code>.skin-1</code> - Blue Light</li>
                <li><code>.skin-2</code> - Inspinia Ultra {for support with Inspinia Ultra please contact with
                  support@webapplayers.com}</li>
                <li><code>.skin-3</code> - Yellow/purple</li>
                <li><code>.light-skin</code> - Light Skin</li>
                <li><code>.md-skin</code> - Material Design Skin (In demo Inspinia Material Design version has also
                  fixed sidebar and fixed navbar option)</li>
                <li>Defaut skin does not need any class</li>
              </ul>

              <a name="themeconfig" class="anchor"></a>
              <h4>Theme config</h4>

              <p>Theme config is the configuration box for setting options in live preview. It is placed in the right
                side of page with green icon.</p>

              <p>We did not want to add code to all pages so we just add js script to append the config box. The
                function is located in inspinia.js file with comment // Append config box / Only for demo purpose</p>

              <p>If you want to remove the config box all you need to do is to remove function below this comment.</p>



              <a name="seed_project" class="anchor"></a>
              <h3>Inspinia Seed Project</h3>

              <p>
                It is an application skeleton for a typical web app. You can use it to quickly bootstrap your webapp
                projects. It has all necessary resources/files to help you started new project.
                As your project will grow you will need to add new resources. Look at the full version to select the
                elements and resources you want to use.

              </p>
              <p>
                File strucutre for Seed Project
              </p>
              <pre class="prettyprint linenums">
<code>Static_Seed_Project/
    ├── <strong>css/</strong>
    ├── <strong>font-awsome/</strong>
    ├── <strong>fonts/</strong>
    ├── <strong>img/</strong>
    ├── <strong>js/</strong>
    ├── index.html
    ├── minor.html
</code></pre>


              <a name="change_log" class="anchor"></a>

              <h3>Change log 2.9.2 -> 2.9.3</h3>

              <ul>

                <strong>Changed Inspinia js files</strong>
                <li>
                  inspinia.js - Fix width calculation for body-small class
                </li>

                <hr>
                <strong>CSS/LESS/SCSS/SASS</strong>
                <li>Add new light-skin css rules</li>
                <li>Fix carousel side effect on landing page</li>
                <li>Slightly improve ibox style</li>
                <li>Add custom style for Toast Bootstrap</li>
                <li>Add custom style for upgraded Touch Spin library</li>

                <hr>
                <strong>Updates</strong>
                <li> Bootstrap library to 4.3.1 - css/js folder</li>
                <li> TouchSpin library to 4.2.5 - css/js folder</li>
                <li> ChartJS library to 2.9.2 - js folder</li>
                <li> Select 2 library to 4.0.12 - css/js folder</li>
                <li> RangeSlider library to 2.3.0 - css/js folder</li>
                <li> DatePicker library to 1.9.0 - css/js folder</li>
                <li> Awesome Bootstrap Checkbox library - css folder</li>

                <hr>
                <strong>Replace</strong>
                <li> Bootstrap Tour library to Bootstrap Tourist - css/js folder</li>

                <hr>
                <strong>Deprecate</strong>
                <li> Toastr notification library - Since 2.9.3 Inspinia use Bootstrap toast notification feature</li>
                <li> jqGrid </li>
                <li> Choosen </li>

                <hr>
                <strong>Changed views files</strong>
                <li>dashboard_2.html, dashboard_3.html, dashboard_4.html, dashboard_4_1.html - Fix title labels position
                  - wrapp them with ibox-tools element</li>
                <li> project_detail.html - fix grid system </li>
                <li> profile_2.html, social_feed.html - remove double caret</li>
                <li> 404.html - fix position form - center</li>
                <li> tinycon.html - add preventDefault to click handler</li>
                <li> icons.html - fix presentation div</li>
                <li> projects.html - improve search form</li>
                <li> dashboard_3.html - fix right sidebar code</li>


              </ul>

              <h3>Change log 2.8 -> 2.9.2</h3>

              <ul>

                <strong>Changed Inspinia js files</strong>
                <li>
                  inspinia.js - Migrate main wrapper to flex layout - no more fix_height() function
                </li>

                <hr>
                <strong>CSS/LESS/SCSS/SASS</strong>
                <li>Fix footer with fixed sidebar width issue</li>
                <li>Fix border size in third level menu</li>
                <li>Fix align text in top navigation</li>
                <li>Fix navbar width on Material Design skin with fixed sidebar option enabled</li>
                <li>Fix tabs width and bottom border issue in left and right orientation</li>
                <li>Fix wrapper size in Material Design Skin with fixed options</li>
                <li>Fix cropped download button issue</li>

                <hr>
                <strong>Changed views files</strong>
                <li>form_advanced.html - update cropper presentation code and script for donwload</li>

                <hr>
                <strong>Updates</strong>
                <li> js/plugins/cropper </li>

              </ul>

              <h3>Change log 2.7.1 -> 2.8</h3>

              <ul>

                <strong>Version 2.8 was fully focused on migration to support Bootstrap 4</strong>
                <br />
                Please open
                <a href="BS4_MIGRATION.html">Migration to BS4</a> for detailed documetation how to upgrade your theme.


              </ul>

              <h3>Change log 2.7 -> 2.7.1</h3>

              <ul>

                <strong>Changed Inspinia js files</strong>
                <li> inspinia.js - correct typos in fix_height function</li>
                <li> inspinia.js - update navbar-minimalize event handler</li>

                <hr>
                <strong>CSS/LESS/SCSS/SASS</strong>
                <li>Fix media-body style on right sidebar</li>
                <li>Fix form-control style to allow inout sizing</li>
                <li>Fix min-height issue with small content</li>
                <li>Fix background menu on md-skin</li>
                <li>Fix tabs in top-navigation layout</li>
                <li>Fix label style to release sizing option</li>

              </ul>

              <h3>Change log 2.6.2 -> 2.7</h3>

              <ul>

                <strong>New view files</strong>

                <li> activity_stream.html </li>
                <li> password_meter.html </li>
                <li> spinners_usage.html </li>
                <li> text_spinners.html </li>

                <hr>
                <strong>Changed views files</strong>
                <li> All .html files - add new menu elements for new views</li>
                <li> All .html files - change script link to new jquery version</li>
                <li> icons.html - update font awesome icons to new set</li>
                <li> agile_board.html - add support for touch gestures - jquery.ui.touch-punch.min.js</li>
                <li> draggable_panels.html - add support for touch gestures - jquery.ui.touch-punch.min.js</li>
                <li> resizeable_panels.html - add support for touch gestures - jquery.ui.touch-punch.min.js</li>
                <li> form_advanced.html - add new example for switchery control </li>
                <li> ladda_buttons.html - update bind method for ladda example buttons </li>
                <li> helper_classes.html - change css name in border examples</li>
                <li> layouts.html - correct typos in image names and descriptions</li>
                <li> mail_compose.html - correct typos in css class</li>
                <li> dashboard_3.html - update css class of sidebar</li>

                <hr>
                <strong>Changed Inspinia js files</strong>
                <li> inspinia.js - update collapse-link click functions </li>
                <li> inspinia.js - update fix_height functions </li>

                <hr>
                <strong>Updates</strong>
                <li> js/jquery-3.1.1.min.js</li>
                <li> js/plugins/dataTables </li>
                <li> js/plugins/switchery </li>
                <li> js/plugins/jquery-ui </li>
                <li> js/plugins/steps </li>
                <li> js/plugins/validation </li>
                <li> /font-awesome </li>

                <hr>
                <strong>New plugins</strong>
                <li> js/plugins/touchpunch</li>
                <li> js/plugins/pwstrength</li>
                <li> css/plugins/textSpinners</li>

                <hr>
                <strong>CSS/LESS/SCSS/SASS</strong>
                <li> Add styles for new pages </li>
                <li> Fix jumping menu on landing page </li>
                <li> Fix bg-colors </li>
                <li> Remove rules for support old IE </li>
                <li> Add styles for third level menu on md-skin </li>
                <li> Improve select2 styles </li>
                <li> Improve menu style </li>
                <li> Clear overwrite native media-body classes </li>
                <li> Improve few styles for IE </li>
                <li> Improve style for summernote </li>
                <li> Correct selected typo </li>
                <li> Fix chat-avatar class rules </li>
                <li> Fix typo in css preprocessor variables </li>

              </ul>


              <h3>Change log 2.6 -> 2.6.2</h3>

              <ul>


                <hr>
                <strong>Updates</strong>
                <li> Bootstrap to 3.3.7</li>

                <hr>
                <strong>CSS/LESS/SCSS/SASS</strong>
                <li> Fix the issue with hidden href on mobile mini navbar</li>
                <li> Fix the flickering menu</li>
                <li> Fix Safari modal issue</li>
                <li> Fix Summernote fullscreen mode</li>
                <li> Fix css width helper classes</li>
                <li> Improve content height on fixed navbar</li>
                <li> Improve landing page on mobile view</li>


              </ul>

              <h3>Change log 2.5 -> 2.6</h3>

              <ul>

                <strong>New view files</strong>

                <li> datamaps.html </li>
                <li> form_autocomplete.html </li>
                <li> helper_classes.html </li>
                <li> pdf_viewer.html </li>
                <li> social_buttons.html </li>


                <hr>
                <strong>Changed views files</strong>
                <li> All .html files - add new menu elements for new views</li>
                <li> dashboard_2.html - update script for new Chartjs version</li>
                <li> dashboard_3.html - update script for new Chartjs version</li>
                <li> dashboard_4.html - update script for new Chartjs version</li>
                <li> dashboard_4_1.html - update script for new Chartjs version</li>
                <li> form_advanced.html - add new features: input tag, dual select</li>
                <li> file_upload.html - add new input components, update dropzone</li>
                <li> graph_chartjs.html - update script for new Chartjs version</li>
                <li> index.html - update script for new Chartjs version</li>
                <li> table_data_tables.html - remove jeditable library</li>

                <hr>
                <strong>New Inspinia files</strong>
                <li> pdf/example.pdf</li>
                <li> js/api/typehead_collection.json</li>

                <hr>
                <strong>Changed Inspinia js files</strong>
                <li> inspinia.js - update click functions </li>

                <hr>
                <strong>Updates</strong>
                <li> js/dropzone </li>
                <li> js/fullcalendar </li>
                <li> js/chartJs </li>
                <li> js/summernote </li>
                <li> css/animate.css</li>

                <hr>
                <strong>New plugins</strong>
                <li> js/plugins/bootstrap-taginput</li>
                <li> js/plugins/dualListbox</li>
                <li> js/plugins/pdfjs</li>
                <li> js/plugins/topojson</li>
                <li> js/plugins/typehead</li>
                <li> css/plugins/bootstrapSocial</li>

                <hr>
                <strong>CSS/LESS/SCSS/SASS</strong>
                <li> Add styles for new pages </li>
                <li> Fix menu jumping issue</li>
                <li> Improve print mode for Firefox</li>
                <li> Improve chosen colors</li>
                <li> Fix boxes layout with md-skin</li>
                <li> Improve custom swithc style</li>
                <li> Add few new css classes - helper classes</li>

              </ul>


              <h3>Change log 2.4 -> 2.5</h3>

              <div class="alert alert-info">
                2.5 version fully focused on update AngularJS projects.
                <strong>New features and views will be added to separate 2.6 version.</strong>
              </div>

              <h3>Change log 2.3 -> 2.4</h3>

              <ul>

                <strong>New view files</strong>

                <li> c3.html </li>
                <li> clipboard.html </li>
                <li> ecommerce-cart.html </li>
                <li> form_markdown.html </li>
                <li> i18support.html </li>
                <li> loading_buttons.html </li>
                <li> resizeable_panels.html </li>
                <li> tour.html </li>
                <li> truncate.html </li>


                <hr>
                <strong>Changed views files</strong>
                <li> All .html files - add new menu elements for new views</li>
                <li> agile_board.html - add example code for serialize list</li>
                <li> form_advanced.html - add new Touch spin control</li>
                <li> landing.html - update page-scroll click event to close menu on select in mobile</li>
                <li> package.html - add info about new MVC6 project</li>
                <li> skin-config.html - add new option for fixed nav bar</li>
                <li> table_data_tables.html - replace old swf buttons with new button plugin (update datatables library)
                </li>
                <li> video.html - add script for handle full screen video option</li>

                <hr>
                <strong>New Inspinia js/json files</strong>
                <li> locales/en.json</li>
                <li> locales/es.json</li>

                <hr>
                <strong>Changed Inspinia js files</strong>
                <li> inspinia.js - update fix_height function </li>
                <li> inspinia.js - update SmoothlyMenu function </li>

                <hr>
                <strong>Updates</strong>
                <li> js/bootstrap - update to 3.3.6 </li>
                <li> js/plugins/dataTables - create on compact datatables generate in official builder:
                  https://datatables.net/download/index </li>
                <li> js/pace - update to 1.0.2 </li>

                <hr>
                <strong>New plugins</strong>
                <li> js/plugins/c3 (with css files)</li>
                <li> js/plugins/bootstrap-markdow (with css files)</li>
                <li> js/plugins/d3 </li>
                <li> js/plugins/clipboard </li>
                <li> js/plugins/dotdotdot </li>
                <li> js/plugins/i18next </li>
                <li> js/plugins/ladda (with css files)</li>
                <li> js/plugins/touchspin (with css files)</li>
                <li> js/plugins/bootstrapTour (with css files)</li>

                <hr>
                <strong>New images</strong>
                <li> imb/flags- Set of flags images</li>

                <hr>
                <strong>CSS/LESS/SCSS/SASS</strong>
                <li> Add styles for new pages </li>
                <li> Fix buttons shadow on Chrome </li>
                <li> Fix dropdown text colour on md-skin </li>
                <li> Fix pace.js on fixed navbar option </li>
                <li> Fix few glitch animation effect </li>
                <li> Improve nav-tabs on mobile devices </li>
                <li> Fix second level menu on md-skin </li>
                <li> Improve RTL mode </li>
                <li> Add new fixed navbar option </li>
                <li> Ipmore print mode </li>

              </ul>


              <h3>Change log 2.2 -> 2.3</h3>

              <ul>

                <strong>New view files</strong>

                <li> contacts_2.html </li>
                <li> dashboard_5.html </li>
                <li> ecommerce_payments.html </li>
                <li> ecommerce_product_detail.html </li>
                <li> masonry.html </li>
                <li> profile_2.html </li>
                <li> slick_carousel.html </li>
                <li> vote_list.html </li>


                <hr>
                <strong>Changed views files</strong>
                <li> All .html files - add new menu elements for new views</li>
                <li> tabs_panels.html - add example of fullscreen panel and slim scroll panel </li>
                <li> index.html - Change color for main charts </li>
                <li> dashboard_2.html - Change color for main charts </li>
                <li> form_advanced.html - Add select2 examples</li>

                <hr>
                <strong>New Inspinia js files</strong>
                <li> <span class="text-muted">No new files</span> </li>

                <hr>
                <strong>Changed Inspinia js files</strong>
                <li> inspinia.js - Add function for handle full screen ibox </li>

                <hr>
                <strong>Updates</strong>
                <li> js/bootstrap - update to 3.3.5 </li>
                <li> js/plugins/dataTables - update to 1.10.8 </li>

                <hr>
                <strong>New plugins</strong>
                <li> js/plugins/select2 (with css files)</li>
                <li> js/plugins/slick (with css files)</li>
                <li> js/plugins/masonry </li>

                <hr>
                <strong>New images</strong>
                <li> css/patterns- Add images for header in Material Design skin</li>

                <hr>
                <strong>CSS/SCSS/SASS</strong>
                <li> Add styles for new pages </li>
                <li> Add new md-skin styles </li>
                <li> Fix ibox-tools when title is large</li>
                <li> Fix landing page menu on small devices</li>
                <li> Fix modal open backdrop with animate.css effect</li>
                <li> Fix dropdown orientation under ibox</li>
                <li> Fix profile menu on fixed sidebar</li>

              </ul>

              <h3>Change log 2.0/2.1 -> 2.2</h3>

              <ul>

                <strong>New view files</strong>
                <li> graph_chartist.html </li>
                <li> metrics.html</li>
                <li> social_feed.html</li>
                <li> sweetalert.html</li>
                <li> table_foo_table.html</li>
                <li> tabs.html</li>
                <li> landing.html (incorporate to admin)</li>
                <li> ecommerce-orders.html </li>
                <li> ecommerce_product.html </li>
                <li> ecommerce_product_list.html </li>
                <li> ecommerce_products_grid.html </li>


                <hr>
                <strong>Changed views files</strong>
                <li> All .html files - add new menu elements for new views</li>
                <li> All .html files - added ".metismenu" class to nav element id="side-menu" (new version of metisMenu)
                </li>
                <li> tabs_panels.html - add example of footer to panel and initial collapsed panel </li>
                <li> chat.html - Add left/right class to chat panels </li>
                <li> article.html - Add example of comments section</li>
                <li> landing.html - Add new sections: timeline and comments</li>
                <li> form_advanced.html - Add new new plugins</li>

                <hr>
                <strong>New Inspinia js files</strong>
                <li> <span class="text-muted">No new files</span> </li>

                <hr>
                <strong>Changed Inspinia js files</strong>
                <li> inspinia.js - Update fix_height for handle height wrapper on fixed-nav </li>

                <hr>
                <strong>Updates</strong>
                <li> js/plugins/metisMenu - update to 2.0.2 </li>
                <li> js/plugins/slimscrol - update to 1.3.6 </li>
                <li> js/plugins/jvectormap - update to 2.0.2 </li>
                <li> js/plugins/fullcalendar/moment.min.js - update to 2.9.0 </li>

                <hr>
                <strong>New plugins</strong>
                <li> js/plugins/clockpicker (with css files)</li>
                <li> js/plugins/daterangepicker (with css files)</li>
                <li> js/plugins/footable (with css files)</li>
                <li> js/plugins/sweetalert (with css files)</li>
                <li> js/plugins/chartist</li>
                <li> css/plugins/awesome-bootstrap-checkbox</li>
                <li> js/plugins/wow (for animation effect on landing)</li>

                <hr>
                <strong>New images</strong>
                <li> img/landing - Full folder of images used in landing page</li>

                <hr>
                <strong>CSS/SCSS/SASS</strong>
                <li> Add styles for new pages </li>
                <li> Add new metisMenu style </li>
                <li> Add landing page styles </li>
                <li> Add chat-discussion left/right class</li>
                <li> Fix z-index of modal-dialog</li>
                <li> Fix margins on wrapper when fixed-nav is enabled</li>

              </ul>

              <h3>Change log 2.0 - 2.1</h3>

              <strong>Version 2.1 is mainly focused on MeteorJS to provide Meteor version.</strong>
              <p>Please stay tuned for 2.2 version to get new features for HTML/JS version.</p>

              <h3>Change log 1.9 -> 2.0</h3>

              <ul>

                <strong>New view files</strong>
                <li> agile_board.html </li>
                <li> article.html </li>
                <li> blog.html </li>
                <li> clients.html </li>
                <li> diff.html </li>
                <li> forgot_password.html </li>
                <li> full_height.html (Outlook view)</li>
                <li> idle_timer.html </li>
                <li> issue_tracker.html </li>
                <li> off_canvas_menu.html </li>
                <li> spinners.html </li>
                <li> temas_board.html </li>
                <li> tinycon.html </li>

                <hr>
                <strong>Changed views files</strong>
                <li> All .html files was changed to add new menu elements</li>
                <li> faq.html - Fix the collapse effect - Create new div element <code>.faq-answer</code> before
                  <code>p</code> answer. </li>
                <li> chat.html - Add new small-chat element</li>

                <hr>
                <strong>New Inspinia js files</strong>
                <li> <span class="text-muted">No new files</span> </li>

                <hr>
                <strong>Changed Inspinia js files</strong>
                <li> inspinia.js - Update fix_height function, add local storage handler, add functions for small-chat
                  and right-sidebar </li>

                <hr>
                <strong>Updates</strong>
                <li> js/plugins/pace - update Pace to 1.0 </li>
                <li> bootstrap - update to 3.3.4 </li>
                <li> js/morris/morris.js - update to 0.5 </li>

                <hr>
                <strong>New plugins</strong>
                <li> js/plugins/diff_match_patch - Google algorithm for diff functionality </li>
                <li> js/plugins/preetyTextDiff - jQuery plugin for dif</li>
                <li> js/plugins/idle_timer</li>
                <li> js/plugins/tinycon</li>

                <hr>
                <strong>New images</strong>
                <li> img/full_height.jpg</li>
                <li> img/off_canvas.jpg</li>

                <hr>
                <strong>CSS/SCSS/SASS</strong>
                <li> Add styles for new pages </li>
                <li> Improve btn-link </li>
                <li> Add colapsed class for initial collapsed ibox </li>
                <li> Fix margins for footer with sidebar fixed </li>
                <li> Fix responsive in login page </li>
              </ul>


              <h3>Change log 1.9 -> 1.9.2</h3>

              <strong>Version 1.9.2 is mainly focused on Ruby on Rails to provide Rails version.</strong>
              <p>Please stay tuned for 2.0 version to get new features.</p>

              <h3>Change log 1.8 -> 1.9</h3>


              <ul>

                <strong>New view files</strong>
                <li> chat_view.html </li>
                <li> dashboard_4.html </li>
                <li> dashboard_4_1.html </li>
                <li> layouts.html </li>
                <li> login_two_columns.html </li>
                <li> tree_view.html </li>

                <hr>
                <strong>Changed views files</strong>
                <li> All .html files was changed to add new menu</li>
                <li> basci_gallery.html - Replace old plugin with new blueimp lightbox gallery</li>

                <hr>
                <strong>New js files</strong>
                <li> <span class="text-muted">No new files</span> </li>

                <hr>
                <strong>Changed js files</strong>
                <li> <span class="text-muted">No changes</span> </li>

                <hr>
                <strong>Updates</strong>
                <li> js/plugins/flot - update Flot chart library to version 0.8.3</li>
                <li> font-awesome - update Font awesome to version 4.3.0</li>

                <hr>
                <strong>New plugins</strong>
                <li> js/plugins/blueimp - new plugin for lightbox gallery</li>
                <li> js/plugins/jsTree - new plugin for tree view</li>

                <hr>
                <strong>New images</strong>
                <li> img/gallery - new set of images for lightbox gallery page</li>
                <li> img/dashbbard4_1.jpg</li>
                <li> img/dashbbard4_2.jpg</li>
              </ul>


              <a name="contact" class="anchor"></a>
              <h3>Contact</h3>
              <p>Contact as with email: <a href="mailto:support@webapplayers.com">support@webapplayers.com</a></p>
              <hr>
            </div>
          </div>
        </div>

        <footer>
          <p>&copy; WebAppLayers 2015 | INSPINIA Admin Theme</p>
        </footer>
      </div>
    </div>

    <%@include file="/WEB-INF/views/common/script.jsp" %>
    <script>
      $(function () {
        window.prettyPrint && prettyPrint();
      })
    </script>
    <script src="/resources/js/index/index.js"></script>
  </body>

  </html>