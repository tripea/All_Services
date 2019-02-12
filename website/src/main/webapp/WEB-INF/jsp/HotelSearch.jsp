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
<body>


	Enter Source City :
	<form action="searchHotel" method="post">
		<input list="cities" name="city">
		<datalist id="cities">
				<jstl:forEach var="hotelCityList" items="${hotelCityList}">
					<option value="${hotelCityList.city}">
						
				</jstl:forEach>
		</datalist>
	<br>
		 
		<br><input
			type="submit">
	</form>
</body>
</html>