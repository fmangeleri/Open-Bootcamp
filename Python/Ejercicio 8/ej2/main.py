# ej2
# En este segundo ejercicio, tendréis que crear un archivo py y dentro crearéis
# una clase Vehículo, haréis un objeto de ella, lo guardaréis en un archivo y
# luego lo cargamos.

import pickle


class Vehiculo:
    marca = None
    modelo = None

    def __int__(self, marca, modelo):
        self.marca = marca
        self.modelo = modelo


coche = Vehiculo('Mercedes Benz', 'Clase A')

f = open('datos.bin', 'wb')
pickle.dump(coche, f)
f.close()

f = open('datos.bin', 'rb')
cocheLoad = pickle.load(f)
f.close()

print(coche.marca)
print(cocheLoad.marca)
