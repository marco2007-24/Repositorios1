# Ejercicio 19 Incremento salarial anual 
# Asignar los valores iniciales
salario = 1500
anio = 1
# Continuar durante 6 años
while anio <= 6:
    # Incrementar el salario un 10%
    salario = salario * 1.10
    # Presentar el salario de cada año
    print("Salario del año", anio, ": $", round(salario, 2))
    # Incrementar el contador
    anio = anio + 1
# Presentar el salario final
print("Salario final: $", round(salario, 2))
