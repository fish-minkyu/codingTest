// left와 right 사이의 숫자를 구한다.
// 구한 숫자들의 약수를 구하고 개수를 구해 반환한다.
// 약수의 개수가 짝수이면 * 1
// 약수의 개수가 홀수이면 * -1
// 약수의 개수들을 더한다.

function solution(left, right) {
  let arr = []
  let sum = 0
  
  for (let i = 0; i <= right - left; i++) {
    let arg = (left + i)
    let cnt = 0
    for (let j = 1; j <= arg; j++) {
      if (arg % j == 0) {
        cnt++
      }
    }
    console.log(cnt)
    if (cnt % 2 == 0) {
      sum += arg
    } else {
      sum -= arg
    }
  }

  return sum
}