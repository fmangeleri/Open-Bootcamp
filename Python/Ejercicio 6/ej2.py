# ej2
# En este segundo ejercicio, tendréis que crear un programa que tenga
# una clase llamada Alumno que tenga como atributos su nombre y su nota.
# Deberéis de definir los métodos para inicializar sus atributos, imprimirlos
# y mostrar un mensaje con el resultado de la nota y si ha aprobado o no.

class Alumno():
    nombre = None
    nota = None

    def __init__(self, nombre, nota):
        self.nombre = nombre
        self.nota = nota

    def examen(self):
        if self.nota > 6 :
            print("El alumno " + self.nombre + " ha aprobado el examen con un " + str(self.nota))
        else:
            print("El alumno " + self.nombre + " ha reprobado el examen con un " + str(self.nota))

miAlumno = Alumno("Franco", 9)
miAlumno.examen()