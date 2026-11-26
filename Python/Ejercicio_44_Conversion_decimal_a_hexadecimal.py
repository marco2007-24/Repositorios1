# Ejercicio 44 Conversion decimal a hexadecimal 
# Solicitar número
numero = int(input("Ingrese un número entero no negativo: "))

# Comprobar número
if numero >= 0:
    hexadecimal = ""

    # Convertir a hexadecimal
    if numero == 0:
        hexadecimal = "0"
    else:
        while numero > 0:
            residuo = numero % 16

            # Identificar dígito hexadecimal
            match residuo:
                case 10:
                    digito = "A"
                case 11:
                    digito = "B"
                case 12:
                    digito = "C"
                case 13:
                    digito = "D"
                case 14:
                    digito = "E"
                case 15:
                    digito = "F"
                case _:
                    digito = str(residuo)

            # Construir número hexadecimal
            hexadecimal = digito + hexadecimal
            numero = numero // 16

    # Presentar el resultado calculado
    print("Número hexadecimal:", hexadecimal)
else:
    print("El número no puede ser negativo")
