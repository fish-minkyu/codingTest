function solution(number) {
  let arr = number.split('')
  let sum = 0
  let res = 0

  for (const arg of arr) {
    sum += +arg
  }

  return res = sum % 9
}