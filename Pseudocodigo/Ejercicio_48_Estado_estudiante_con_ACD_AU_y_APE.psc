// Ejercicio 48 Estado estudiante con ACD AU y APE
Algoritmo estadoEstudiante()
  Inicio
        //Variables
          Definir ACD, AU, APE, promedio como decimal
          promedio = 0
          Escribir "Ingrese nota ACD"
          Leer ACD
      // Validacion Nota ACD
          Mientras ACD < 0 o ACD > 10 hacer
            Escribir "Nota incorrecta, ingrese nuevamente"
            Leer ACD
          FinMientras
          Escribir "Ingrese nota AU"
          Leer AU
      // Validacion Nota AU
          Mientras AU < 0 o AU > 10 hacer
            Escribir "Nota incorrecta, ingrese nuevamente"
            Leer AU
          FinMientras
          Escribir "Ingrese nota APE"
          Leer APE
      // Validacion Nota APE
          Mientras APE < 0 o APE > 10 hacer
            Escribir "Nota incorrecta, ingrese nuevamente"
            Leer APE
         FinMientras
    // calculos de las variables
        ACD = ACD * 0.3
        AU = AU * 0.3
        APE = APE * 0.4
    // calculo de promedio
        promedio = ACD + AU + APE
        Escribir "Promedio final: ", promedio
    // Aprobado o reproado
        Si promedio >= 7 entonces
          Escribir "Estudiante aprobado"
        SiNo
          Escribir "Estudiante reprobado"
        FinSi
  Fin
