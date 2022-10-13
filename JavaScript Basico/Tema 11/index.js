class Estudiante {
    nombre
    asignaturas = ['JavaScript', 'HTML', 'CSS']

    obtenDatos() {
        return this
    }
}

let yo = new Estudiante

yo.nombre = 'Franco'

console.log(yo.obtenDatos())