# Ejercicio 18 Contar aprobados y reprobados 
# Preparar contadores
aprobados = 0
reprobados = 0
i = 1
# Solicitar cantidad de estudiantes
N = int(input("Ingrese la cantidad de estudiantes: "))
# Continuar mientras i sea menor o igual a N
while i <= N:
    # Solicitar nota del estudiante
    nota = float(input(f"Ingrese la nota del estudiante {i}: "))
    # Comprobar si el estudiante aprobo
    if nota >= 7:
        aprobados = aprobados + 1
    # Si no aprobo, contar como reprobado
    else:
        reprobados = reprobados + 1
    # Incrementar el contador
    i = i + 1
# Presentar los resultados obtenidos
print("Cantidad de aprobados:", aprobados)
print("Cantidad de reprobados:", reprobados)
