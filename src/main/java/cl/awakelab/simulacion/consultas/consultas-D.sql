SELECT f.facturaid, p.nombre, p.valor, d.cantidad, f.fecha
FROM factura f
LEFT JOIN detallefactura d ON d.factura_facturaid = f.facturaid
LEFT JOIN producto p ON p.productoid = d.producto_productoid
WHERE f.facturaid >= 1 AND f.facturaid <=5
ORDER BY f.facturaid, p.nombre DESC;
