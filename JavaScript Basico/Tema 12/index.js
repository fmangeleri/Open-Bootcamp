function fibonacci(num) {
    if (num === 1) return [1]
    if (num === 2) return [1, 1]
    let array = [1, 1]
    for(let i = 1; i < num; i++) {
        array.push(array[i] + array[i - 1])
    }
    return array
}

console.log(fibonacci(5))
