// Ejercicio 30 Determinacion de cuadrante
Algoritmo determinacionCuadrante()
 Inicio
        // Definir los datos utilizados
        Definir x, y Como Real
    
        // Solicitar coordenadas
        Escribir "Ingrese la coordenada x:"
        Leer x
        Escribir "Ingrese la coordenada y:"
        Leer y
    
        // Identificar posición del punto
        Si (x = 0 Y y = 0) Entonces
            Escribir "El punto está en el origen"
        SiNo
            Si (x = 0) Entonces
                Escribir "El punto está sobre el eje Y"
            SiNo
                Si (y = 0) Entonces
                    Escribir "El punto está sobre el eje X"
                SiNo
                    // Identificar cuadrante
                    Si (x > 0 Y y > 0) Entonces
                        Escribir "Primer cuadrante"
                    SiNo
                        Si (x < 0 Y y > 0) Entonces
                            Escribir "Segundo cuadrante"
                        SiNo
                            Si (x < 0 Y y < 0) Entonces
                                Escribir "Tercer cuadrante"
                            SiNo
                                Escribir "Cuarto cuadrante"
                            FinSi
                        FinSi
                    FinSi
                FinSi
            FinSi
        FinSi
 Fin
