// Ejercicio 11 Sueldo y horas extra
Algoritmo sueldo_y_HorasExtra()
  Inicio 
  //Definicion de variables
    Definir horas, pagoHora, sueldo como decimal
    Escribir "Ingrese horas trabajadas"
    Leer horas
    Escribir "Ingrese pago por horas"
    Leer pagoHoras
  // condiciones
    si horas <= 40 entonces
      sueldo <- horas * pagoHora
    FinSi
    si horas > 40 entonces
      sueldo <- (40 × pagoHora) + ((horas – 40) × pagoHora × 2)
    FinSi
    Escribir "El sueldo semanal es:" , sueldo
  Fin
