# Ej1
# En este ejercicio vais a crear la clase Vehículo la cual tendrá los siguientes atributos:
# - Color
# - Ruedas
# - Puertas
# Por otro lado crearéis la clase Coche la cual heredará de Vehículo y tendrá los siguientes atributos:
# - Velocidad
# - Cilindrada
# Por último, tendrás que crear un objeto de la clase Coche y mostrarlo por consola.

class Vehiculo():
    color = None
    ruedas = None
    puertas = None

    def __init__(self, color, ruedas, puertas):
        self.color = color
        self.ruedas = ruedas
        self.puertas = puertas


class Coche(Vehiculo):
    velocidad = None
    cilindrada = None

    def __init__(self, color, ruedas, puertas, velocidad, cilindrada):
        Vehiculo.__init__(self, color, ruedas, puertas)
        self.velocidad = velocidad
        self.cilindrada = cilindrada


miCoche = Coche("Negro", 4, 2, 350, 3500)

print(miCoche.__dict__)
