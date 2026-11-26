// Ejercicio 02 Cuatro datos producto suma y media
Algoritmo suma_mediaAritmetica()
Inicio

    // Definir los datos utilizados
    Definir dato1, dato2, dato3, dato4, suma, producto Como Entero
    Definir mediaAritmetica Como Real

    // Leer los valores necesarios
    Escribir "Ingrese dato 1"
    Leer dato1
    Escribir "Ingrese dato 2"
    Leer dato2
    Escribir "Ingrese dato 3"
    Leer dato3
    Escribir "Ingrese dato 4"
    Leer dato4

    // Obtener suma, producto y media
    suma <- dato1 + dato2 + dato3 + dato4
    producto <- dato1 * dato2 * dato3 * dato4
    mediaAritmetica <- suma / 4

    // Presentar los resultados calculados
    Escribir "La suma es: ", suma
    Escribir "El producto es: ", producto
    Escribir "La media aritmética es: ", mediaAritmetica
Fin
