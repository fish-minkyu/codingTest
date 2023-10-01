// 반복문 횟수 구하기: arr.length - idx
// 반복문 - time만큼 반복, i + idx로 인덱스 계산

function solution(arr, idx) {
  let time = arr.length - idx // 2
  let ans = 0

  for (let i = 0; i < time; i++) {
    if (arr[i + idx] == 1) {
      return ans = i + idx
    }
  }

  return ans = -1
}