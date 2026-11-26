// Ejercicio 38 Registro Ventas Diarias
Algoritmo RegistroVentas()
 Inicio
        // Definir los datos utilizados
        Definir venta, total, promedio, mayorVenta Como Real
        Definir dias, diasSuperiores, diaMayor Como Entero
        // Asignar los valores iniciales
        total <- 0
        dias <- 0
        diasSuperiores <- 0
        mayorVenta <- 0
        diaMayor <- 0
        // Solicitar primera venta
        Escribir "Ingrese la venta del día (-1 para terminar):"
        Leer venta
        // Registrar ventas
        Mientras (venta <> -1) Hacer
            Si (venta >= 0) Entonces
                dias <- dias + 1
                // Acumular ventas
                total <- total + venta
                // Contar ventas superiores a $500
                Si venta > 500 Entonces
                    diasSuperiores <- diasSuperiores + 1
                FinSi
                // Identificar venta máxima
                Si dias = 1 O venta > mayorVenta Entonces
                    mayorVenta <- venta
                    diaMayor <- dias
                FinSi
                // Solicitar siguiente venta
                Escribir "Ingrese la siguiente venta (-1 para terminar):"
                Leer venta
            SiNo
                Escribir "La venta no puede ser negativa"
                Escribir "Ingrese nuevamente (-1 para terminar):"
                Leer venta
            FinSi
        FinMientras
        // Obtener promedio y mostrar resultados
        Si dias > 0 Entonces
            promedio <- total / dias
            Escribir "Total de ventas: $", total
            Escribir "Promedio de ventas: $", promedio
            Escribir "Días con ventas superiores a $500: ", diasSuperiores
            Escribir "Mayor venta: $", mayorVenta
            Escribir "Día de la mayor venta: ", diaMayor
        SiNo
            Escribir "No se registraron ventas"
        FinSi
 Fin
