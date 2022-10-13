
let yo = {
    nombre: 'Franco',
    apellido: 'Angeleri',
    edad: 22,
    altura: 172,
    eresDesarrollador: true
}

let miEdad = yo.edad


let lista = [{...yo}, 
    {
        nombre: 'Mia',
        apellido: 'Angeleri',
        edad: 18,
        altura: 170,
        eresDesarrollador: false 
    },
    {   
        nombre: 'Vatu',
        apellido: 'Angeleri',
        edad: 20,
        altura: 175,
        eresDesarrollador: false }
]

let listaOrd = lista.sort((a, b)=> b.edad - a.edad)

console.log(listaOrd[0].edad, listaOrd[1].edad, listaOrd[2].edad)