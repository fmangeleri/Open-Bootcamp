
# Escribe un programa en la consola de python que pida al usuario su peso (en kg) y estatura
# (en metros), calcule el índice de masa corporal y lo almacene en una variable, e imprima por
# pantalla la frase Tu índice de masa corporal es donde es el índice de masa corporal calculado
# redondeado con dos decimales. Tienes que subir capturas de pantalla en una carpeta comprimida zip.

print("Hola, este es un programa que calcula tu indice de masa corporal (BMI)")
peso = input("Ingrese su peso: ")

estatura = input("Ingrese su estatura en metros: ")

peso = float(peso)
estatura = float(estatura)

bmi = peso / (estatura * estatura)

print("BMI: " + str(bmi))