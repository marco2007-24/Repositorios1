// Ejercicio 08 Promedio de tres notas
Algoritmo promedioNotas()
  Inicio 
//Definicion de variables
    Definir calificacion1, calificacion2, calificacion3, promedio como decimal
    Escribir "Ingrese calificacion1"
    Leer calificacion1
// validacion de notas
    Mientras calificacion1< 0 o calificacion1 > 10 hacer
      Escribir "Nota incorrecta, ingrese nuevamente"
      Leer calificacion1
    FinMientras
    Escribir "Ingrese calificacion2"
    Leer calificacion2
    Mientras calificacion2 < 0 o calificacion2 > 10 hacer
      Escribir "Nota incorrecta, ingrese nuevamente"
      Leer calificacion2
    FinMientras
    Escribir "Ingrese calificacion3"
    Leer calificacion3
    Mientras calificacion3 < 0 o calificacion3 > 10 hacer
      Escribir "Nota incorrecta, ingrese nuevamente"
      Leer calificacion3
    FinMientras
//Calculo Promedio
    promedio = (calificacion1+calificacion2+calificacion3) / 3
    Escribir "El promedio de las notas es:" ,promedio
  Fin
