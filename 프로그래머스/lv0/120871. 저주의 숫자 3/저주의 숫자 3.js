// n 까지 숫자를 ++ 하면서 3의 배수를 찾거나
// 3의 배수가 아니여도 3을 포함하는 숫자를 찾는 것이 목적
// ex) 13 => '13' => ['1', '3']

// 1  2  3  4  5  6  7  8  9  10  11  12  13  14  15
// 1  2  4  5  7  8  10 11 14 16  17  19  20  22  25

// 제외된 숫자 list
// 3의 배수 : 3, 6, 9, 12, 15, 18, 21, 24
// 3이 포함된 숫자 : 13, 23

function solution(n) {
    let arr = []
    let flag = 0
   for (let i = 1; i <= n; i++) {
        flag++  // flag = 30
    // 3의 배수이면 +1
    if (flag % 3 == 0) {
        flag++ // 31
    } 

    if (flag.toString().length >= 2 && flag.toString().split('').includes('3')) {
        flag++ 
    }

    if (flag == 32) {
        flag = 40
    }

    if (flag % 3 == 0) {
        flag++
    }

    if (flag == 131) {
        flag = 140
    }

    if (flag % 3 == 0) {
        flag++
    }

    arr.push(flag) // 29
   }

   return arr.at(-1)
}