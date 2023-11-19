function solution(a, b) {
  let str = Number(a.toString() + b.toString())
  let num = 2 * a * b

  return str >= num ? str : num
}