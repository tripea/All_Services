<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="addedHotel" method="get">
		Enter Name Of Hotel: 	<input name=hotelName /><br /> Enter
		Enter Name Of Area:	 	<input name="address.area" /><br /> 
		Enter Name Of Landmark:	 <input name="address.landMark" /><br /> 
		Enter Name Of State :	 <input name="address.state" /><br /> 
		Enter Name Of Nation:	 <input name="address.nation" /><br /> 
		Enter Name Of City:	 <input name="address.city" /><br /> 
		Enter Name Of Pin code:	 <input name="address.pincode" /><br /> 
		Enter Name Of Total Rooms:	 <input name="totalRooms" /><br /> 
		Enter Name Of Total Available Rooms: <input name="totalAvailableRooms" /><br /> 
 	<!-- TODO how to take value for hashmap --> 
 		Enter Name Of Area:	 <input name="address" /><br /> 
 
		<input type="submit" />
	</form>
</body>
</html>