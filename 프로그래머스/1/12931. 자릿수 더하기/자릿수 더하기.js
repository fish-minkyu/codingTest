// 1의 자릿수 10 ** 0
// 10의 자릿수 10 ** 1
// 100의 자릿수 10 ** 2

function solution(n){
    let num = n + ''
    let sum = 0
    // console.log(sum)
  for (let i = 0; i < num.length; i++) {
    sum += Math.floor(n/(10**i)) % 10
    // console.log(sum)
  }
  return sum
}