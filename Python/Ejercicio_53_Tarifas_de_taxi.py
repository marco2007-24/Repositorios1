# Ejercicio 53 Tarifas de taxi 
# Leer los valores necesarios
km = float(input("Ingrese los kilómetros recorridos: "))
noche = input("¿Es de noche? (S/N): ").upper()

# Comprobar distancia
if km >= 0:
    # Obtener tarifa base
    tarifa = 2 + (1.50 * km)

    # Incorporar recargo por distancia
    if km > 10:
        tarifa = tarifa * 1.20

    # Incorporar recargo nocturno
    if noche == "S":
        tarifa = tarifa * 1.30

    # Presentar el resultado calculado
    print("Total a pagar: $", tarifa)
else:
    print("Los kilómetros no pueden ser negativos")
