function solution(n) {
  var array = []
  for (let i = 0; i <= n; i++) {
    if (i % 2 === 1) {
      array.push(i)
    }
  }
  return array
}