<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New/Edit Contact</title>
</head>
<body>
    <div align="center">
        <h1>New/Edit Marchand</h1>
        <form:form action="addMarchand" method="post" modelAttribute="marchand">
        <table>
            <form:hidden path="id"/>
            <tr>
                <td>Date of creation:</td>
                <td><form:input path="create_date" /></td>
            </tr>
            <tr>
                <td>Label:</td>
                <td><form:input path="label" /></td>
            </tr>
            <tr>
                <td>Price:</td>
                <td><form:input path="unit_price" /></td>
            </tr>
            <tr>
                <td>Currency:</td>
                <td><form:input path="currency" /></td>
            </tr>
            <tr>
            	<td>Weight:</td>
            	<td><form:input path="weight" /></td>
            </tr>
            <tr>
            	<td>Height:</td>
            	<td><form:input path="height" /></td>
            </tr>
             <c:forEach var="product" items="${marchand.products}">
				<tr>

					<td>${marchand.create_date}</td>
					<td>${marchand.label}</td>
					<td>${marchand.unit_price}</td>
					<td>${marchand.currency}</td>
					<td>${marchand.weight}</td>
					<td>${marchand.height}</td>

				</tr>
			</c:forEach>
            <tr>
                <td colspan="2" align="center"><input type="submit" value="Save"></td>
            </tr>
        </table>
        </form:form>
    </div>
</body>
</html>