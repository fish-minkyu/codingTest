function solution(n) {
  let ans = null
  for (let i = 1; i <= n; i++) {
    if (n % i == 1) return ans = i
  }
}