function solution(n) {
  let ans = []
  let sum = 0

  for (let i = 1; i <= n; i++) {
    if (n % i == 0) {
      ans.push(i)
    }
  }

  ans.map(item => sum +=item)

  return sum
}