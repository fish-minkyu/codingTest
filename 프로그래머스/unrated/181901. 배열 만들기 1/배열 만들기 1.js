// 1부터 n이하의 배열 생성
// ans = filter로 k 배수 걸러내기
// return ans

function solution(n, k) {
  let arr = Array(n).fill().map((_, i) => i+1)

  ans = arr.filter(item => item % k == 0)
  return ans
}