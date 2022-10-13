
function verdadero() {
    return true;
}

async function damePromesa() {
    return setTimeout(() => console.log("Hola soy una promesa"), 5000)
}

damePromesa()

function* generarIdPares() {
    let id = 0
    while(true){
        id += 2
        yield id
    }
}

const gen = generarIdPares()

console.log(gen.next())
console.log(gen.next())
console.log(gen.next())
