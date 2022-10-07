# ej2
# En este segundo ejercicios tendréis que crear un script que nos diga si es la
# hora de ir a casa. Tendréis que hacer uso del modulo time. Necesitaréis la fecha
# del sistema y poder comprobar la hora.
# En el caso de que sean más de las 7, se mostrará un mensaje y en caso contrario,
# haréis una operación para calcular el tiempo que queda de trabajo.

import time

horario = time.localtime()
hora = horario.tm_hour

def trabajo():
    if hora >= 19 :
        print('Es hora de ir a casa')
    else:
        hres = 19 - hora - 1
        mres = 60 - horario.tm_min
        print('Restan ', hres, ' horas y ', mres, ' minutos para terminar con el trabajo')

trabajo()