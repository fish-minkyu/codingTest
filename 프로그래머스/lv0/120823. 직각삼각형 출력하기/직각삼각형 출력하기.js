const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.on('line', function (line) {
  let ans = []

    for (let i = 1; i <= line; i++) {
      console.log('*'.repeat(i))
    }
}).on('close', function () {
});