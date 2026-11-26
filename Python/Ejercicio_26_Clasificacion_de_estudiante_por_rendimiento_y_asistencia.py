# Ejercicio 26 Clasificacion de estudiante por rendimiento y asistencia 
# Leer los valores necesarios
promedio = float(input("Ingrese el promedio (0 a 10): "))
asistencia = float(input("Ingrese el porcentaje de asistencia: "))

# Comprobar que las entradas sean válidas
if 0 <= promedio <= 10 and 0 <= asistencia <= 100:

    # Clasificar estudiante
    if promedio >= 9 and asistencia >= 90:
        categoria = "Excelente"
    elif promedio >= 7 and asistencia >= 80:
        categoria = "Bueno"
    elif promedio >= 6 and asistencia >= 70:
        categoria = "Regular"
    else:
        categoria = "Deficiente"

    # Presentar el resultado calculado
    print("Categoría:", categoria)
else:
    print("Datos fuera del rango permitido")
