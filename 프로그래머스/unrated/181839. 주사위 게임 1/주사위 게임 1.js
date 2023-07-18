function solution(a, b) {
  let arr = [a, b]

  let odd = arr.filter(item => item % 2 == 1).length

  return odd == 2 ? a**2 + b**2 : odd == 1 ? 2*(a + b) : Math.abs(a - b)
}