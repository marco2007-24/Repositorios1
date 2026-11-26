# Ejercicio 62 Tarifa Transporte
# Solicitar los valores de entrada
edad = int(input("Ingrese la edad: "))
estudiante = input("¿Es estudiante? (S/N): ").upper() 
horario_pico = input("¿Es horario pico? (S/N): ").upper()
tarifa_base = float(input("Ingrese la tarifa base: "))

# Comprobar que las entradas sean válidas
if edad < 0 or tarifa_base < 0 or estudiante not in ("S", "N") or horario_pico not in ("S", "N"):
    print("Datos inválidos")
else:
    # Preparar tarifa
    tarifa_final = tarifa_base

    # Incorporar gratuidad por edad
    if edad < 5 or edad >= 65:
        tarifa_final = 0

    # Incorporar descuento estudiantil del 20 % (regla provisional)
    elif estudiante == "S" and horario_pico == "N":
        tarifa_final = tarifa_base * 0.80

    # Presentar el resultado calculado
    print(f"Tarifa final: ${tarifa_final:.2f}")
