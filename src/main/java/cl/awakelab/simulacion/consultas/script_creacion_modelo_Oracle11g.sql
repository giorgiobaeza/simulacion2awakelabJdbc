
DROP TABLE categoria CASCADE CONSTRAINTS;
DROP TABLE detallefactura CASCADE CONSTRAINTS;
DROP TABLE factura CASCADE CONSTRAINTS;
DROP TABLE producto CASCADE CONSTRAINTS;



CREATE TABLE categoria (
    categoriaid  INTEGER NOT NULL,
    nombre       VARCHAR2(50) NOT NULL
);

ALTER TABLE categoria ADD CONSTRAINT categoria_pk PRIMARY KEY ( categoriaid );

CREATE TABLE detallefactura (
    factura_facturaid    INTEGER NOT NULL,
    producto_productoid  INTEGER NOT NULL,
    cantidad             INTEGER NOT NULL
);

ALTER TABLE detallefactura ADD CONSTRAINT detallefactura_pk PRIMARY KEY ( factura_facturaid,
                                                                          producto_productoid );

CREATE TABLE factura (
    facturaid  INTEGER NOT NULL,
    cliente    VARCHAR2(50),
    fecha      DATE
);

ALTER TABLE factura ADD CONSTRAINT factura_pk PRIMARY KEY ( facturaid );

CREATE TABLE producto (
    productoid             INTEGER NOT NULL,
    nombre                 VARCHAR2(30) NOT NULL,
    valor                  INTEGER NOT NULL,
    categoria_categoriaid  INTEGER
);

ALTER TABLE producto ADD CONSTRAINT producto_pk PRIMARY KEY ( productoid );

ALTER TABLE detallefactura
    ADD CONSTRAINT detallefactura_factura_fk FOREIGN KEY ( factura_facturaid )
        REFERENCES factura ( facturaid );

ALTER TABLE detallefactura
    ADD CONSTRAINT detallefactura_producto_fk FOREIGN KEY ( producto_productoid )
        REFERENCES producto ( productoid );

ALTER TABLE producto
    ADD CONSTRAINT producto_categoria_fk FOREIGN KEY ( categoria_categoriaid )
        REFERENCES categoria ( categoriaid );


insert into categoria values (1,'Electrónica');
insert into categoria values (2,'Dormitorio');
insert into categoria values (3,'Tecno');

insert into producto values (1,'Ventilador sobremesa',19990,1);
insert into producto values (2,'Horno eléctrico',25480,NULL);
insert into producto values (3,'Tostadora',10990,1);
insert into producto values (4,'Cama 1 plaza',99990,2);
insert into producto values (5,'Juego de sábanas',12790,2);
insert into producto values (6,'Almohada',5470,NULL);
insert into producto values (7,'Televisor',150000,3);
insert into producto values (8,'Consola multiuso',200000,3);
insert into producto values (9,'Cámara reflex',50000,NULL);

insert into factura values (1,'Diego Abarca',TO_DATE('04-08-2020','DD-MM-YYYY'));
insert into factura values (2,NULL,TO_DATE('01-08-2020','DD-MM-YYYY'));
insert into factura values (3,'Francisca Cordero',NULL);
insert into factura values (4,'Gastón Durán',TO_DATE('10-08-2020','DD-MM-YYYY'));
insert into factura values (5,'Héctor Espinoza',TO_DATE('04-08-2020','DD-MM-YYYY'));

insert into detallefactura values (1,5,2);
insert into detallefactura values (1,4,1);
insert into detallefactura values (1,1,3);
insert into detallefactura values (2,9,3);
insert into detallefactura values (2,1,2);
insert into detallefactura values (3,2,1);
insert into detallefactura values (3,4,1);
insert into detallefactura values (3,7,2);
insert into detallefactura values (3,6,3);
insert into detallefactura values (4,3,1);
insert into detallefactura values (5,3,2);
insert into detallefactura values (5,6,2);


COMMIT;
