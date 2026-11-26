# Ejercicio 47 Estacion del ano 
# Leer los valores necesarios
mes = int(input("Ingrese el número del mes (1-12): "))
dia = int(input("Ingrese el día: "))
anio = int(input("Ingrese el año: "))

# Identificar días del mes
if mes in (1, 3, 5, 7, 8, 10, 12):
    maxDias = 31
elif mes in (4, 6, 9, 11):
    maxDias = 30
elif mes == 2:
    maxDias = 29 if anio % 400 == 0 or (anio % 4 == 0 and anio % 100 != 0) else 28
else:
    maxDias = 0

# Comprobar fecha
if anio <= 0 or mes < 1 or mes > 12 or dia < 1 or dia > maxDias:
    print("Fecha no válida")
else:
    # Identificar estación
    if mes in (12, 1, 2):
        print("Verano")
    elif mes in (3, 4, 5):
        print("Otoño")
    elif mes in (6, 7, 8):
        print("Invierno")
    else:
        print("Primavera")
