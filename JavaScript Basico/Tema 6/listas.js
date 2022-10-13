
let compras = ['Fideos', 'Carne', 'Queso', 'Cereal', 'Leche']

compras.push('Aceite de Girasol')
compras.pop()


let peliculas = [
    {titulo: 'El Origen', director: 'Christopher Nolan', fecha: '2010'},
    {titulo: 'El Codigo Da Vinci', director: 'Ron Howard', fecha: '2006'},
    {titulo: 'El Crimen Perfecto', director: 'Gregory Hoblit', fecha: '2007'}
]

let peliculas2010 = peliculas.filter(pelicula => pelicula.fecha >= 2010)

let directores = peliculas.map(pelicula => pelicula.director)
let titulos = peliculas.map(pelicula => pelicula.titulo)

let dirTit = directores.concat(titulos)
let dirTit2 = [...directores, ...titulos]



