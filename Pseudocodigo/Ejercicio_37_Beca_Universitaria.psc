// Ejercicio 37 Beca Universitaria
Algoritmo BecaUniversitaria()
 Inicio
        // Definir los datos utilizados
        Definir promedio Como Real
        Definir reprobadas, beca Como Entero
        Definir primerCiclo Como Cadena
    
        // Leer los valores necesarios
        Escribir "Ingrese el promedio (0 a 10):"
        Leer promedio
        Escribir "Ingrese el número de materias reprobadas:"
        Leer reprobadas
        Escribir "¿Es estudiante de primer ciclo? (S/N):"
        Leer primerCiclo
    
        // Comprobar que las entradas sean válidas
        Si promedio >= 0 Y promedio <= 10 Y reprobadas >= 0 Entonces
    
            // Identificar porcentaje de beca
            Si promedio >= 9 Y reprobadas = 0 Y Mayusculas(primerCiclo) = "S" Entonces
                beca <- 100
            SiNo
                Si promedio >= 8 Y reprobadas <= 1 Entonces
                    beca <- 70
            SiNo
                Si promedio >= 7 Y reprobadas <= 2 Entonces
                    beca <- 40
                SiNo
                    beca <- 0
                FinSi
            FinSi
        FinSi
    
        // Presentar los resultados calculados
        Si beca > 0 Entonces
            Escribir "Beca aprobada"
            Escribir "Porcentaje de beca: ", beca, "%"
        SiNo
            Escribir "Beca rechazada"
        FinSi
    
    SiNo
        Escribir "Datos fuera del rango permitido"
    FinSi
Fin
