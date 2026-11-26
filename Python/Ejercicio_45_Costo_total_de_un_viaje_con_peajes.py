# Ejercicio 45 Costo total de un viaje con peajes 
# Leer los valores necesarios
distancia = float(input("Ingrese la distancia en km: "))
consumo = float(input("Ingrese el rendimiento en km por litro: "))
precio = float(input("Ingrese el precio por litro: "))
N = int(input("Ingrese la cantidad de peajes: "))

# Comprobar que las entradas sean válidas
if distancia >= 0 and consumo > 0 and precio >= 0 and N >= 0:
    costoPeajes = 0

    # Acumular costos de peajes
    for i in range(1, N + 1):
        costoPeaje = float(input("Ingrese el costo del peaje " + str(i) + ": "))
        costoPeajes = costoPeajes + costoPeaje

    # Obtener combustible y total
    litros = distancia / consumo
    costoCombustible = litros * precio
    total = costoCombustible + costoPeajes

    # Presentar los resultados calculados
    print("Litros necesarios:", litros)
    print("Costo de combustible: $", costoCombustible)
    print("Costo de peajes: $", costoPeajes)
    print("Costo total del viaje: $", total)
else:
    print("Datos no válidos")
