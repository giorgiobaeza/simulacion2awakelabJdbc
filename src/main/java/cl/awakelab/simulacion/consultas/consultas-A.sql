select productoid, nombre from producto 
where categoria_categoriaid is null
order by nombre desc;