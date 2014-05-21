<!DOCTYPE html>
<!--[if IE 8]><html class="no-js lt-ie9" lang="en"><![endif]-->
<!--[if gt IE 8]><!-->
<%@ page import="com.sjsu.edu.common.Utils"%>
<%@ page import="com.sjsu.edu.dao.beans.*"%>
<%@page import="java.util.List"%>
<html class="no-js" lang="en">
<!--<![endif]-->
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>SMash Online Product Catalog</title>
	
	<link href="../assets/css/bootstrap.css" rel="stylesheet">
	<link href="../assets/css/foltergrid.css" rel="stylesheet">
    <script src="../assets/js/actb.js"></script>
	<script src="../assets/js/tablefilter.js"></script>    
</head>
<style>
 table { table-layout: fixed; }
 table th, table td { overflow: scroll; }
</style>
<body>
	<div class="container">
		<div class="masthead">
			<h3 class="muted">SMash Online Product Catalog</h3>
			<div class="navbar navbar-inverse">
				<div class="navbar-inner">
					<div class="container">
						<ul class="nav navbar-nav">
							<li><a href="../index.jsp">Home</a></li>
							<li><a href="agg.jsp">Televisions</a></li>
							<li><a href="fridges.jsp">Refrigerators</a></li>
							<li><a href="phones.jsp">Phones</a></li>
							<li><a href="books.jsp">Books</a></li>
							<li class="active"><a href="search.jsp">Search</a></li>
						</ul>
					</div>
				</div>
			</div>
		</div>
		<div class="jumbotron">
			<object data=http://localhost:8080/kibana-3.0.1/index.html#dashboard/temp/41GSkVs9RvaOnL6-fquWlw width="1000" height="800"> 
			<b>Error: Elastic Search cannot be displayed. Please ensure Elastic Search has been started and Kibana folder is placed in the WebApps folder in Tomcat.</b>
			</object>
			<br>
			<b>  </b>
			<br>
			<a href="http://localhost:8080/kibana-3.0.1/index.html#/dashboard/elasticsearch/Appliance%20Catalog%20Search">Search Appliance Catalog</a>
		</div>
		<hr>
		<div class="footer">
			<p>SMash Online Store @2014</p>
		</div>
	</div>
</body>
</html>