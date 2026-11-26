# Ejercicio 59 Plan Materias 
# Solicitar los valores de entrada
semestre = int(input("Semestre actual (1-4): "))
promedio = float(input("Promedio actual: "))
# Comprobar que las entradas sean válidas
if semestre < 1 or semestre > 4 or promedio < 0 or promedio > 10:
    print("Datos inválidos")
else:
    # Asignar materias según el semestre
    match semestre:
        case 1 | 2:
            materias = 5
        case 3 | 4:
            materias = 4
    # Ajustar materias según el promedio
    if promedio >= 8.5:
        materias += 1
    elif promedio < 7:
        materias -= 1
    # Establecer mínimo y máximo de materias
    if materias < 3:
        materias = 3
    if materias > 6:
        materias = 6
    # Presentar el resultado calculado
    print("Materias recomendadas:", materias)
