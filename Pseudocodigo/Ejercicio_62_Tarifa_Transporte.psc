// Ejercicio 62 Tarifa Transporte 
Algoritmo TarifaTransporte()
Inicio
    // Definir los datos utilizados
    Definir edad Como Entero
    Definir tarifaBase, tarifaFinal Como Real
    Definir estudiante, horarioPico Como Cadena
    // Solicitar los valores de entrada
    Escribir "Ingrese la edad: "
    Leer edad
    Escribir "¿Es estudiante? (S/N): "
    Leer estudiante
    Escribir "¿Es horario pico? (S/N): "
    Leer horarioPico
    Escribir "Ingrese la tarifa base: "
    Leer tarifaBase
    // Comprobar que las entradas sean válidas
    Si edad < 0 O tarifaBase < 0 O (Mayusculas(estudiante) <> "S" Y Mayusculas(estudiante) <> "N") O (Mayusculas(horarioPico) <> "S" Y Mayusculas(horarioPico) <> "N") Entonces
        Escribir "Datos inválidos"
    SiNo
        // Preparar tarifa
        tarifaFinal <- tarifaBase

        // Incorporar gratuidad por edad
        Si edad < 5 O edad >= 65 Entonces
            tarifaFinal <- 0
        SiNo
            // Incorporar descuento estudiantil del 20 % (regla provisional)
            Si Mayusculas(estudiante) = "S" Y Mayusculas(horarioPico) = "N" Entonces
                tarifaFinal <- tarifaBase * 0.80
            FinSi
        FinSi
        // Presentar el resultado calculado
        Escribir "Tarifa final: $", tarifaFinal
    FinSi
Fin
