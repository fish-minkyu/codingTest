const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

let input = [];

rl.on('line', function (line) {
    input = line.split(' '); //['string', '5']
}).on('close', function () {
    str = input[0];
    n = Number(input[1]);
    ans = ''
    for (let i = 0; i < n; i++) {
        ans += str
    }
    console.log(ans)
    
});