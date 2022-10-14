
let nombre = 'Franco'
let apellido = 'Angeleri'

let persona = {nombre, apellido}

sessionStorage.setItem("persona", JSON.stringify({nombre, apellido}))
localStorage.setItem("persona", JSON.stringify({nombre, apellido}))

const now = new Date()

document.cookie = `dale=${JSON.stringify(persona)};expires=` + new Date(now.getTime() + 2 * 60000).toUTCString()