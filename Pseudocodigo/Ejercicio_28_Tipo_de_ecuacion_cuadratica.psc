// Ejercicio 28 Tipo de ecuacion cuadratica
Algoritmo ecuacionCuadratica()
 Inicio
        // Definir los datos utilizados
        Definir a, b, c, discriminante Como Real
    
        // Solicitar coeficientes
        Escribir "Ingrese el coeficiente a:"
        Leer a
        Escribir "Ingrese el coeficiente b:"
        Leer b
        Escribir "Ingrese el coeficiente c:"
        Leer c
    
        // Comprobar si es cuadrática
        Si a = 0 Entonces
            Escribir "No es una ecuación cuadrática"
        SiNo
            // Obtener discriminante
            discriminante <- b^2 - 4 * a * c
    
            // Clasificar las soluciones
            Si discriminante > 0 Entonces
                Escribir "Tiene dos soluciones reales"
            SiNo
                Si discriminante = 0 Entonces
                    Escribir "Tiene una solución real"
                SiNo
                    Escribir "No tiene soluciones reales"
                FinSi
            FinSi
        FinSi
 Fin
