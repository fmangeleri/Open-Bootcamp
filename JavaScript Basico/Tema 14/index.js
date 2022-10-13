
const boton = document.querySelector("button")

boton.addEventListener("click", () => alert("click en el botón"))

$("button").click(() => alert("Hola, estoy utilizando jQuery"))