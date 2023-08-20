function solution(arr) {
  return arr.filter((_, idx) => {
  return arr[idx] !== arr[idx + 1]
  })
}