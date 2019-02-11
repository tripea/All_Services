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
				<th>Rooms</th>
				<th>Photos</th>
				<th>Facilities</th>
				<th>Description</th>
				<th>Availability</th>
			</tr>
			<%-- <jstl:set var="rooms" value="" scope="sesion"></jstl:set> --%>
		 
				<tr>
					<td>${hotel.hotelName}</td>
					<td> landMark : ${hotel.address.landMark} <br>
						city : ${hotel.address.city}<br>
						pincode : ${hotel.address.pincode}<br>
						state: ${hotel.address.state}<br>
						nation : ${hotel.address.nation}<br>
					
					</td> 
					<td>${hotel.review}</td>
					<td>${hotel.photos}</td>
					<td>${hotel.rooms}</td>
					<td>${hotel.facilities}</td>
					<td>${hotel.description}</td>
					
					<jstl:if test="${hotel.totalAvailableRooms==0}">
					<td>No Rooms Available</td>
					</jstl:if>
					<jstl:if test="${hotel.totalAvailableRooms != 0}">
					<td>Available Rooms :${hotel.totalAvailableRooms}<br>
					<a href ="bookingForm">Book Room </a></td>
					
					</jstl:if>
					
	
				</tr>
			 

		</table>

	</div>

</body>
</html>