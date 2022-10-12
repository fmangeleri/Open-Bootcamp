// factorial-for.js -> Este archivo debe calcular el factorial de 10 utilizando un solo bucle for

const num = 10;
var factorial = 1;

for (let i = 1; i <= 10; i++) {
    var factorial = factorial * i;
}

console.log(factorial)