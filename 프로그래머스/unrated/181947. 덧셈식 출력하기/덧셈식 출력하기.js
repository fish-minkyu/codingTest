const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

let input = [];

rl.on('line', function (line) {
    input = line.split(' ');
}).on('close', function () {
    a = +input[0]
    b = +input[1]
    console.log(`${a} + ${b} = ${a+b}`)

    
});