const readline = require('readline');
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});
let input = [];



rl.on('line', function (line) {
  input = line.split(' ');
  
}).on('close', function () {
    let a = input[0]
    let b = input[1]
  console.log(`a = ${a}\nb = ${b}`);
});