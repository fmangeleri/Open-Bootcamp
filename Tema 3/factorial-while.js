// factorial-while.js -> Este archivo debe calcular el factorial de 10 utilizando un bucle while

const num = 10;
var factorial = 1;
var i = 1;

while (i <= num) {
    factorial *= i;
    i++;
}

console.log(factorial);