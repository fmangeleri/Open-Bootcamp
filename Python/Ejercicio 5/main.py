# Ejercicio 5
# Escribe una función que pueda decirte si un año (número entero) es bisiesto o no.


print("Quieres saber si un año es biciesto o no?")
año = int(input("Ingrese un año: "))


biciesto = lambda año: print("El año ", año ," es biciesto") if año%4 == 0 else print("El año ", año ," no es biciesto")

biciesto(año)