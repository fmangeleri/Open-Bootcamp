// factorial-break.js -> Este archivo debe calcular el factorial de 10 utilizando un bucle while,
// una bifurcación if y una sentencia break

const num = 10;
var factorial = 1;
var i = 1;

while (true) {
    if(i > num){
        break
    }
    factorial *= i;
    i++;
}

console.log(factorial);