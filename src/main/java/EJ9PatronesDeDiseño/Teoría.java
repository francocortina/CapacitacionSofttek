package EJ9PatronesDeDiseño;

/*
1- ¿Qué es un patron?
*Es una solución es estadanrizada, que se podrá reutilizar
*
2-Tipos de Patrones
* /Creacional, Estructural, Comportamiento/

Creacionales: El objetivo de estos patrones es la inicialización
y la configuracion de objetos

Estructurales: Van a separar la interfaz de la implementación y
se ocupan de las clases y objetos, como se pueden agrupar

Comportamiento:Describen a los objetos y clases que estan implicados y
la comunicacion entre ellos
-----------------------------------------------------------------------
Creacionales:

Singleton:Tener una unica instancia  de una misma clase durante
toda la aplicacion.

Fabrica:Devolver instancias de una clase en particular por medio
de un identificador

Fabrica Abstracta. Es una fabrica de fabricas, mediante una interface  de Fábricas.

Prototipo:Crear una nueva instancia con los valores clonados de otra instancia.
-------------------------------------------------------------------------
Estructurales:
Fachada:Ocultar o simplificar la complejidad que puede tener nuestra aplicación, Como por ejemplo
El cliente al pedir la información de vuelos , lo unico que debe hacer es ingresar datos y luego la implementación
por detrás el no la sabrá.

Decorador: Permite agregar una funcionalidad sin modificar una estructura

Proxy:Es una clase que viene ser un intermediador entre el cliente y el objeto destino final.Se usa para no
cambiar la estructura de la lógica y agregar algún detalle.


Comportamiento:
Command:Cuando quieras poner operaciones en cola, programar su ejecución o ejecutarals de forma remota.

Memento:Patrón de diseño para guardar el estado de un objeto y mediantes el memento reestablecer un punto anterior

Observer:Para que al momento de un evento o cambio en un Objeto , se le notifique a los
observadores de ese cambio

Strategy:Te permite ejecutar diferentes logicas, mediante una interfaz  y asi no tener que usar ifs en
todo momento

DAO: Se utiliza para abstraer la lógica de acceso de un conjunto de operaciones, como por ejemplo
para accerder a operaciones a la base de datos

Inyeccion de dependencias:Se suministran objetos a una clase y no al reves. ejempo al usar Autowired, Spring boot me proporciona la instancia

MVC(Modelo Vista Controlador): Secciona por contextos y hace el proyecto mas mantenible.

=====================================

Maven: Este es un gestor de dependencias que nos va a   permitir gestionar nuestras librerias dentros
de un archivo xml
*/