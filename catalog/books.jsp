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
	<title>SMash Online Store</title>
	
	<link href="../assets/css/bootstrap.css" rel="stylesheet">
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
							<li><a href="fridges.jsp">Refrigsrators</a></li>
							<li><a href="phones.jsp">Phones</a></li>
							<li class="active"><a href="books.jsp">Books</a></li>
							<li><a href="search.jsp">Search</a></li>
						</ul>
					</div>
				</div>
			</div>
		</div>
		<div class="container">
			<table id="table2" class="table table-striped table-hover table-bordered">
				<thead>
					<tr>
						<th style="width: 30%;">Product</th>
						<th style="width: 70%;">Details</th>						
					</tr>
				</thead>
				<tbody>
					<%
						List<CatalogEntry> entries = Utils.getCatalog("book");
									if(entries != null && entries.size() > 0) {			         		
						            	for(CatalogEntry entry: entries) {
					%>
					<tr>
						<td align="center"><img src=<%=entry.getUrl()%>></td>
						<td><h3><%=entry.getName()%> (<%=entry.getYear()%>)</h3><br>
						    Description: <%=entry.getDesc()%><br>
						    Price (USD): $<%=entry.getPrice()%><br>
						    Author: <%=entry.getBrand()%><br>
						    Year Published: <%=entry.getYear()%><br>
					    </td>						
					</tr>
					<%
						}
					}
					%>
				</tbody>
			</table>
		</div>
		<hr>
		<div class="footer">
			<p>SMash Online Store @2014</p>
		</div>
	</div>
</body>
</html>