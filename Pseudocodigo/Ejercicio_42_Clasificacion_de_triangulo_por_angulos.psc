// Ejercicio 42 Clasificacion de triangulo por angulos
Algoritmo ClasificarTriangulo()
 Inicio
        // Definir los datos utilizados
        Definir a1, a2, a3 Como Real
    
        // Solicitar ángulos
        Escribir "Ingrese el primer ángulo:"
        Leer a1
        Escribir "Ingrese el segundo ángulo:"
        Leer a2
        Escribir "Ingrese el tercer ángulo:"
        Leer a3
    
        // Comprobar ángulos positivos
        Si a1 <= 0 O a2 <= 0 O a3 <= 0 Entonces
            Escribir "Error: los ángulos deben ser positivos"
        SiNo
            // Comprobar suma de 180 grados
            Si a1 + a2 + a3 <> 180 Entonces
                Escribir "Los ángulos no forman un triángulo"
            SiNo
                // Clasificar triángulo
                Si a1 = 90 O a2 = 90 O a3 = 90 Entonces
                    Escribir "Triángulo rectángulo"
                SiNo
                    Si a1 > 90 O a2 > 90 O a3 > 90 Entonces
                        Escribir "Triángulo obtusángulo"
                    SiNo
                        Escribir "Triángulo acutángulo"
                    FinSi
                FinSi
            FinSi
        FinSi
Fin
