// Ejercicio 61 Descuento Comercial
Algoritmo DescuentoComercial()
 Inicio
        // Definir los datos utilizados
        Definir categoria, cantidad Como Entero
        Definir precio, subtotal, descuento, total Como Real
        Definir membresia Como Cadena
        // Solicitar los valores de entrada
        Escribir "Categoría (1=Elec, 2=Ropa, 3=Alim): "
        Leer categoria
        Escribir "Cantidad: "
        Leer cantidad
        Escribir "Precio unitario: "
        Leer precio
        Escribir "¿Tiene membresía? (S/N): "
        Leer membresia
        // Comprobar que las entradas sean válidas
        Si categoria < 1 O categoria > 3 O cantidad <= 0 O precio < 0 Entonces
            Escribir "Datos inválidos"
        SiNo
            // Obtener subtotal
            subtotal <- cantidad * precio
            descuento <- 0
            // Descuento según categoría
                Segun categoria Hacer
                1:
                    Si cantidad >= 5 Entonces
                        descuento <- subtotal * 0.08
                    FinSi
                2:
                    Si cantidad >= 3 Entonces
                        descuento <- subtotal * 0.12
                    FinSi
                3:
                    descuento <- subtotal * 0.05
            FinSegun
            // Descuento por membresía
            Si Mayusculas(membresia) = "S" Entonces
                descuento <- descuento + subtotal * 0.05
            FinSi
            total <- subtotal - descuento
            // Descuento extra por monto
            Si total > 100 Entonces
                descuento <- descuento + total * 0.03
                total <- subtotal - descuento
            FinSi
            // Presentar los resultados calculados
            Escribir "Subtotal: $", subtotal
            Escribir "Descuento: $", descuento
            Escribir "Total a pagar: $", total
        FinSi
 Fin
