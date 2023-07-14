// sum = 자릿수 합 구하기
// x % sum == 0, 하샤드 수

function solution(x) {
    let sum = 0
    let str = x + ''

    for (let i = 0; i < str.length; i++) {
        sum += Math.floor(x/(10**[i])) % 10
    }

    return (x % sum == 0) ? true : false

}
