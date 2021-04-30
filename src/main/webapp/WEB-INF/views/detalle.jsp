 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Facturas</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf"
	crossorigin="anonymous"></script>
</head>
<body>
	
	<div class="container">
		<div class="form-group">

			<h1>Facturas</h1>
			<form action="detallefactura" method="post">
				<p>
					<label for="facturaid">Especialidad:</label>
					<input type="text" id="facturaid" name="facturaid" placeholder="Ingrese ID de factura" required/>
					<input type="submit" value="buscar" />
				</p>
			</form>
			<div class="row">
				<div class="col-3"><b>Cliente: </b>
				<c:out value="${detfac.getCliente()}"/></div>
			</div>
			<div class="row">
				<div class="col-3"><b>Fecha: </b>
				<c:out value="${detfac.getFecha()}"/></div>
			</div>
			<table class="table table-bordered">
				<thead>
					<tr class="table-active">
						<th scope="col" class="col-4">Producto</th>
						<th scope="col" class="col-4">Precio</th>
						<th scope="col" class="col-4">Cantidad</th>
					</tr>
				</thead>
				<c:forEach items="${ldetfac}" var="ld">
				
				<tbody>
					<tr>
						<td>${ld.getNombreproducto()}</td>
						<td>${ld.getPrecio()}</td>
						<td>${ld.getCantidad()}</td>
					</tr>
				</tbody>
				</c:forEach>
			</table>
			<div class="row">
				<div class="col-3"><b>Subtotal: $</b>
				<c:out value="${detfac.getSubtotal()}"/></div>
			</div>
			<div class="row">
				<div class="col-3"><b>Impuesto: $</b>
				<c:out value="${detfac.getImpuesto()}"/></div>
			</div>
			<div class="row">
				<div class="col-3"><b>Total: $</b>
				<c:out value="${detfac.getTotal()}"/></div>
			</div>
		</div>

	</div>
</body>
</html>