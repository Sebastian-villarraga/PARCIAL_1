# PARCIAL_1
### Sebastian Julian Villarraga Guerrero
### CVDS
### 2/24/2025

1. Creo el repositorio en git hub y el proyecto maven:
![image](https://github.com/user-attachments/assets/d660c3dd-4d63-456d-b001-3656c0d952be)

2. Modifico el pom para el proyecto
![image](https://github.com/user-attachments/assets/3b031735-bc50-4c52-b762-ea3773be6cd1)

3. Creo el arbol del proyecto con las clases y tests

creo la clase Producto, Log, y Advertencia: 
- Producto: se encargara de la logica detras de un producto, estos deben tener nombre, precio, cantidad en stock y categoría.
- log: Este es un tipo de agente que debe escribir en stdout cada vez que se modifica el stock de un producto.
- Advertencia: Este es el otro tipo de agente que debe escribir en stdout cada vez que el stock de un producto es menor a 5. 
![image](https://github.com/user-attachments/assets/657ea5a7-fb15-4e6d-ab1d-dabe60ed947f)
![image](https://github.com/user-attachments/assets/1ef5a650-4bbe-4999-93d0-c4b6d44e6852)


#

### Single Responsibility Principle
establece que una clase debe tener una única razón para cambiar, es decir, debe tener una única responsabilidad.
En este caso, la clase Producto tiene la responsabilidad de manejar los detalles del producto, como el nombre, precio, stock, y los agentes asociados. 

### Open/Closed Principle 
dice que una clase debe estar abierta para ser extendida, pero cerrada para ser modificada. Es decir, puedes agregarle nuevas funciones sin tener que modificar la clase original.
El código usa como clases como Log y Advertencia, lo que nos permite, por ejemplo, poder agregar más tipos de agentes sin modificar la clase Producto.

### Dependency Inversion Principle 
En nuestro proyecto la clase Producto depende de clases como Log y Advertencia. Para cumplir con el DIP.

#

4. Implenento la clase Producto.
   ![image](https://github.com/user-attachments/assets/6e85193d-5fc6-41cb-8188-768e025da83e)

5. Implemento la clase Log.
   ![image](https://github.com/user-attachments/assets/f9733bde-e0da-42c3-a18b-e826401be3e2)

6. Implemento la clase Advertencia.
   ![image](https://github.com/user-attachments/assets/801af24c-c861-41ed-ab41-2a2d8b5ff18f)

7. Implemento la clase ProductoTest.
   ![image](https://github.com/user-attachments/assets/68b52363-7291-45f8-b10d-7c88a5a2c55c)

9. Implemento la clase LogTest.
   ![image](https://github.com/user-attachments/assets/36d813ee-0cc2-496c-bbb5-cc9e879014d2)

11. Implemento la clase AdvertenciaTest.
    ![image](https://github.com/user-attachments/assets/842cfbfc-f21c-4f1a-bfe1-b4644b655d27)

# no me compilo el proyecto maven, no pude realizar el reporte JACOCO aunque las pruebas si estan.
