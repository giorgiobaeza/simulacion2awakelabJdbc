SELECT f.facturaid, SUM(d.cantidad) AS cantidad 
FROM factura f
LEFT JOIN detallefactura d ON f.facturaid = d.factura_facturaid
WHERE f.cliente IS null OR f.fecha IS null
GROUP BY facturaid;