// Ejercicio 23 Costo de envio con peso volumetrico
Algoritmo costoEnvio()
 Inicio
        // Definir los datos utilizados
        Definir peso, largo, ancho, alto Como Real
        Definir pesoVolumetrico, pesoCobrar, tarifa, totalPagar Como Real
    
        // Definir tarifa
        tarifa <- 2.50
    
        // Leer los valores necesarios
        Escribir "Ingrese peso real en kg:"
        Leer peso
        Escribir "Ingrese largo en cm:"
        Leer largo
        Escribir "Ingrese ancho en cm:"
        Leer ancho
        Escribir "Ingrese alto en cm:"
        Leer alto
    
        // Obtener peso volumétrico
        pesoVolumetrico <- (largo * ancho * alto) / 5000
    
        // Identificar peso a cobrar
        Si (peso > pesoVolumetrico) Entonces
            pesoCobrar <- peso
        SiNo
            pesoCobrar <- pesoVolumetrico
        FinSi

        // Obtener costo total
        totalPagar <- pesoCobrar * tarifa
    
        // Presentar los resultados calculados
        Escribir "El peso a cobrar es: ", pesoCobrar, " kg"
        Escribir "El total a pagar es: $", totalPagar
Fin
