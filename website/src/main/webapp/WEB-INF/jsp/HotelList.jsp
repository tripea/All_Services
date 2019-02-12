<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%-- <%@ taglib prefix="jstl" uri="http://java.sun.com/jstl/core"%> --%>
<%@ taglib prefix="jstl" uri="http://java.sun.com/jstl/core_rt"%>
<%-- <%@ page isELIgnored="false"%> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style type="text/css">
table, th, td {
	padding: 5px;
	height: 80px;
	width: 1100px;
	font-size: 20px;
	text-align: center;
	font-family: inherit;
}

th, td {
	padding: 1px;
	background-color: lightblue
}
</style>

<body>

	<div>
		<table>
			<tr>
				<th>Hotel Name</th>
				<th>Address</th>
				<th>Review</th>
				<th>Photos</th>
			</tr>


			<%-- <jstl:set var="rooms" value="" scope="sesion"></jstl:set> --%>
			<jstl:forEach var="hotelList" items="${hotelList}">
				<tr>
					<td> <a href="/hotel/getHotel?hotelId=${hotelList.hotelId}">${hotelList.hotelName}</a></td>
					<td>${hotelList.address.city}</td>
					<td>${hotelList.review}</td>
					<td>${hotelList.photos}</td>



				</tr>
			</jstl:forEach>

		</table>

	</div>

</body>
</html>