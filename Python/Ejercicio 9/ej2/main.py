# ej2
# En este segundo ejercicio, tenéis que crear una aplicación que obtendrá los
# elementos impares de una lista pasada por parámetro con filter y realizará una
# suma de todos estos elementos obtenidos mediante reduce.

import functools


lista = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]


def impar(num):
    if num % 2 != 0:
        return True
    else:
        return False


impares = filter(impar, lista)

print(functools.reduce(lambda a, b: a+b, impares))
