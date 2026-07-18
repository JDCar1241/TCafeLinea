
## Descripcion

un sistema de pedidos para una tienda de cafe
desarrollado en Java. El sistema permite seleccionar una bebida base y
personalizarla agregando diferentes complementos, calculando
automaticamente el precio final del pedido.

El proyecto aplica el patron de diseño **Decorator**, el cual permite
agregar funcionalidades o caracteristicas adicionales a un objeto de
forma dinamica sin modificar su estructura original.

## Problema

Una tienda de cafe necesita permitir que sus clientes personalicen sus
bebidas agregando diferentes ingredientes, como leche, chocolate o
crema.

Una solucion tradicional requeriria crear una clase diferente para cada
combinacion posible de cafe e ingredientes. Esto provocaria un aumento
innecesario de clases, codigo repetido y dificultades para mantener o
ampliar el sistema.

## Solucion propuesta

Para resolver este problema se utiliza el patron de diseño Decorator.

El sistema cuenta con una bebida base, por ejemplo:

-   Cafe Americano
-   Espresso
-   Cappuccino

A estas bebidas se les pueden agregar decoradores que representan
complementos:

-   Leche
-   Chocolate
-   Crema
-   Caramelo

Cada complemento puede agregarse de manera independiente y aumenta el
precio total del pedido.

Ejemplo:

``` text
Cafe Americano
    + Leche
    + Chocolate
    + Crema
```

Resultado:

``` text
Cafe Americano + Leche + Chocolate + Crema
Precio total: S/ 11.50
```

## Patron de diseño utilizado

### Decorator

El patron Decorator permite añadir responsabilidades adicionales a un
objeto dinamicamente. En este proyecto, la interfaz `Cafe` define el
comportamiento comun de todas las bebidas.

Los cafes base implementan esta interfaz, mientras que los complementos
heredan de la clase abstracta `DecoradorCafe`, que tambien implementa
`Cafe`.

De esta manera, un cafe puede ser envuelto por uno o varios decoradores.

## Estructura del proyecto

``` text
TiendaCafe/
│
├── Cafe.java
│
├── CafeAmericano.java
├── Espresso.java
├── Cappuccino.java
│
├── DecoradorCafe.java
│
├── Leche.java
├── Chocolate.java
├── Crema.java
├── Caramelo.java
│
├── Pedido.java
└── Main.java
```

## Funcionamiento

El sistema sigue el siguiente proceso:

1.  Se selecciona una bebida base.
2.  Se agregan uno o más complementos.
3.  Cada complemento modifica la descripción del producto.
4.  Cada complemento agrega su costo al precio base.
5.  Se crea el pedido con los datos del cliente.
6.  Se muestra la información final del pedido.

## Ejemplo de implementación

``` java
Cafe pedido = new CafeAmericano();

pedido = new Leche(pedido);
pedido = new Chocolate(pedido);
pedido = new Crema(pedido);

Pedido nuevoPedido = new Pedido(
        1001,
        "Cliente",
        pedido
);

nuevoPedido.mostrarPedido();
```

## Resultado esperado

``` text
========== PEDIDO ==========
Nuero: 1001
Cliente: Cliente
Producto: Cafe Americano + Leche + Chocolate + Crema
Total: S/ 11.50
============================
```
