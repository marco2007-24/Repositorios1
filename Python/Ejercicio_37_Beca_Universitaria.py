# Ejercicio 37 Beca Universitaria 
# Leer los valores necesarios
promedio = float(input("Ingrese el promedio (0 a 10): "))
reprobadas = int(input("Ingrese el número de materias reprobadas: "))
primerCiclo = input("¿Es estudiante de primer ciclo? (S/N): ").upper()

# Comprobar que las entradas sean válidas
if 0 <= promedio <= 10 and reprobadas >= 0:

    # Identificar porcentaje de beca
    if promedio >= 9 and reprobadas == 0 and primerCiclo == "S":
        beca = 100
    elif promedio >= 8 and reprobadas <= 1:
        beca = 70
    elif promedio >= 7 and reprobadas <= 2:
        beca = 40
    else:
        beca = 0

    # Presentar los resultados calculados
    if beca > 0:
        print("Beca aprobada")
        print("Porcentaje de beca:", beca, "%")
    else:
        print("Beca rechazada")
else:
    print("Datos fuera del rango permitido")
