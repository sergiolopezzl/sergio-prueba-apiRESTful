CREATE TABLE SergioLopezTable (
    id NUMBER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    nombre VARCHAR2(255) NOT NULL,
    identificacion VARCHAR2(255) NOT NULL,
    direccion VARCHAR2(255),
    telefono VARCHAR2(20),
    ciudad VARCHAR2(100),
    estado VARCHAR2(10) CHECK (estado IN ('activo', 'inactivo'))
);
