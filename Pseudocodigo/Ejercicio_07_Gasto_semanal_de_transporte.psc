// Ejercicio 07 Gasto semanal de transporte
Algoritmo gastoTransporte()
  Inicio 
    //Declaracion Variables
    Definir viajesDia, diasSemana como entero
    Definir pasaje, gastoTotal como decimal
    // Cantidades ingresadas
    Escribir "Ingrese viajes por dia"
    Leer viajesDia
    Escribir "Ingrese cuantos dias viaja "
    Leer diasSemana
    Escribir "Ingrese costo del pasaje "
    Leer pasaje
    // Calculo del gasto total
    gastoTotal = viajesDia * diasSemana * pasaje
    Escribir " El gasto total es:" , gastoTotal
  Fin
