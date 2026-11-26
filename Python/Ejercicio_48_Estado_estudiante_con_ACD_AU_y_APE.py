# Ejercicio 48 Estado estudiante con ACD AU y APE 
# Solicitar y validar nota ACD
ACD = float(input("Ingrese nota ACD: "))
while ACD < 0 or ACD > 10:
    ACD = float(input("Nota incorrecta, ingrese nuevamente: "))

# Solicitar y validar nota AU
AU = float(input("Ingrese nota AU: "))
while AU < 0 or AU > 10:
    AU = float(input("Nota incorrecta, ingrese nuevamente: "))

# Solicitar y validar nota APE
APE = float(input("Ingrese nota APE: "))
while APE < 0 or APE > 10:
    APE = float(input("Nota incorrecta, ingrese nuevamente: "))

# Obtener promedio ponderado
promedio = ACD * 0.30 + AU * 0.30 + APE * 0.40

# Presentar el resultado calculado
print("Promedio final:", promedio)

# Identificar aprobación
if promedio >= 7:
    print("Estudiante aprobado")
else:
    print("Estudiante reprobado")
