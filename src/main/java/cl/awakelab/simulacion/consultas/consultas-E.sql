SELECT f.facturaid, (p.valor * d.cantidad) AS subtotal, 
CAST(((p.valor * d.cantidad)*0.19)AS INT) AS IVA, 
CAST(((p.valor * d.cantidad)*1.19)AS INT) AS total
FROM factura f
LEFT JOIN detallefactura d ON d.factura_facturaid = f.facturaid
LEFT JOIN producto p ON p.productoid = d.producto_productoid
ORDER BY f.facturaid;