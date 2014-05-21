<!DOCTYPE html>
<!--[if IE 8]><html class="no-js lt-ie9" lang="en"><![endif]-->
<!--[if gt IE 8]><!-->
<html class="no-js" lang="en">
<!--<![endif]-->
<%@ page import="com.sjsu.edu.common.Utils"%>
<%@ page import="com.sjsu.edu.dao.beans.*"%>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>SMash Online Store</title>
	
	<!-- Le styles -->
	<link href="assets/css/bootstrap.css" rel="stylesheet">
	<link href="assets/css/bootstrap-responsive.css" rel="stylesheet">
	<link href="assets/css/global.css" rel="stylesheet">

	<script src="assets/js/jquery.js"></script>
	<script src="assets/js/bootstrap.js"></script>
	<style id="holderjs-style" type="text/css"></style>	
</head>
<body>
	<div class="container">
		<div class="masthead">
			<h3 class="muted">SMash Online Product Catalog</h3>
			<div class="navbar navbar-inverse">
				<div class="navbar-inner">
					<div class="container">
						<ul class="nav navbar-nav">
							<li class="active"><a href="index.jsp">Home</a></li>
							<li><a href="catalog/agg.jsp">Televisions</a></li>
							<li><a href="catalog/fridges.jsp">Refrigerators</a></li>
							<li><a href="catalog/phones.jsp">Phones</a></li>
							<li><a href="catalog/books.jsp">Books</a></li>
							<li><a href="catalog/search.jsp">Search</a></li>
						</ul>
					</div>
				</div>
			</div>
		</div>
		<div class="jumbotron">
			<h2>SMash Online Store</h2>
			<p>The ONE STOP SHPOP for all your consumer appliance and electronics needs!!!</p> 
			<p>Televisions</p>
			<p>Refrigerators</p>
			<p>Cell Phones</p>
			<p>Books</p>
			<a href="http://localhost:8080/kibana-3.0.1" target="_self">Search Appliance Catalog</a>
		</div>
		<hr>
		 
		<div class="footer">
			<p>SMash Online Store copyright @2014</p>
		</div>
	</div>
</body>
</html>