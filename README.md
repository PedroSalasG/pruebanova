Hola Esta es solo una prueba.

Para poder levantar los servicios con las configuraciones primero se debe de levantar el proyecto Server, despues Productos y al final detalle

Una vez que se hayan levantado, los endpoints por default son:

**localhost:8001 para detalle que es el que consume a producto
**localhost:8002 para productos

desde los dos se pueden enviar las peticiones.

--EJEMPLO DETALLE:
localhost:8001/listardetalle
localhost:8001/detalle/1/cantidad/2
localhost:8001/detalle/crearproducto

--EJEMPLO DETALLE:
localhost:8002/listar
localhost:8002/listar/1
localhost:8002/crearproducto

Dejo un Ejemplo del JSON del POST, para postman para que se pueda insertar ya sea en el detalle o en el producto, los agrega de igual forma
{
    "nombre":"Telexd",
    "precio":1900.99,
    "createAt":"2023-02-12"
}
