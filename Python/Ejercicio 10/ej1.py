# ej1
# En este ejercicio tenéis que crear una lista de RadioButton que muestre la opción
# que se ha seleccionado y que contenga un botón de reinicio para que deje
# todo como al principio.
#
# Al principio no tiene que haber una opción seleccionada.

from tkinter import *

def seleccionar():
    monitor.config(text="{}".format(opcion.get()))
def reset():
    opcion.set(None)
    monitor.config(text="")

root = Tk()
opcion = StringVar()
opcion.set(None)
Radiobutton(root, text="Secundario", variable=opcion,
            value='Secundario', command=seleccionar).pack(anchor=W)

Radiobutton(root, text="Grado Universitario", variable=opcion,
            value='Grado Universitario', command=seleccionar).pack(anchor=W)
Radiobutton(root, text="Master", variable=opcion,
            value='Master', command=seleccionar).pack(anchor=W)
Radiobutton(root, text="Doctorado", variable=opcion,
            value='Doctorado', command=seleccionar).pack(anchor=W)

monitor = Label(root)
monitor.pack()
Button(root, text="Reiniciar", command=reset).pack()

root.mainloop()