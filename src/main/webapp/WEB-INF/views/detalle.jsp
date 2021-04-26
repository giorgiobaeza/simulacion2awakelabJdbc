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
			<div class="col-3">Cliente:</div>
			<div class="col-9"><c:out value="${detfac.getCliente()}"/></div>
			</div>
			<div class="row">
			<div class="col-3">Fecha:</div>
			<div class="col-9"><c:out value="${detfac.getFecha()}"/></div>
			</div>
			<table class="table table-bordered">
				<thead>
					<tr>
						<th scope="col">Producto</th>
						<th scope="col">Precio</th>
						<th scope="col">Cantidad</th>
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
			<div class="col-3">Subtotal:</div>
			<div class="col-9"><c:out value="${detfac.getSubtotal()}"/></div>
			</div>
			<div class="row">
			<div class="col-3">Impuesto:</div>
			<div class="col-9"><c:out value="${detfac.getImpuesto()}"/></div>
			</div>
			<div class="row">
			<div class="col-3">Total:</div>
			<div class="col-9"><c:out value="${detfac.getTotal()}"/></div>
			</div>
		</div>

	</div>
</body>
</html>