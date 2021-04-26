SELECT p.nombre
FROM producto p
LEFT JOIN categoria c ON c.categoriaid = p.categoria_categoriaid
LEFT JOIN detallefactura d ON d.producto_productoid = p.productoid
WHERE cantidad >= 1 AND c.categoriaid = 1
GROUP BY p.nombre;