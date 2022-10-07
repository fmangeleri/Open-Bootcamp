# ej1
# Este ejercicio, tendréis que crear un archivo py donde creéis un archivo txt,
# lo abráis y escribáis dentro del archivo. Para ello, tendréis que acceder dos
# veces al archivo creado.

open('fichero.txt', 'x')


f = open('fichero.txt', 'w')

f.write('Vamos a escribir en este fichero unos numeros')

for i in range(5):
    f.write('\n' + str(i))

f.close()

f = open('fichero.txt', 'a')

f.write('\nContinuamos con la enumeracion')


for i in range(5, 11):
    f.write('\n' + str(i))