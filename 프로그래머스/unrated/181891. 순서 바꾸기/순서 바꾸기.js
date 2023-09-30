// 얕은 복사: from 사용
// 배열 합치기: concat 사용
function solution(num_list, n) {
  let arr = Array.from(num_list)

  let arg1 = num_list.splice(0, n)
  let arg2 = arr.splice(n, arr.length)

  return arg2.concat(arg1)
}