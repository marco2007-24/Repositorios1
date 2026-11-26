# Ejercicio 54 Validacion de fecha 
# Solicitar fecha
dia = int(input("Ingrese el día: "))
mes = int(input("Ingrese el mes: "))
anio = int(input("Ingrese el año: "))

# Identificar año bisiesto
bisiesto = False

if anio % 400 == 0:
    bisiesto = True
elif anio % 4 == 0 and anio % 100 != 0:
    bisiesto = True

# Identificar días del mes
maxDias = 0

if mes in (1, 3, 5, 7, 8, 10, 12):
    maxDias = 31
elif mes in (4, 6, 9, 11):
    maxDias = 30
elif mes == 2:
    if bisiesto:
        maxDias = 29
    else:
        maxDias = 28

# Comprobar fecha
if anio > 0 and 1 <= mes <= 12 and 1 <= dia <= maxDias:
    print("La fecha es válida")
else:
    print("La fecha no es válida")
