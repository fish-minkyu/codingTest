function solution(arr) {
  let ans = []

  for (let i = 0; i < arr.length; i++) {
    if (arr[i] >= 50 && arr[i] % 2 == 0) {
      ans.push(arr[i] / 2)
    } else if (arr[i] < 50 && arr[i] % 2 == 0) {
      ans.push(arr[i])
    } else if (arr[i] > 50 && arr[i] % 2 == 1) {
      ans.push(arr[i])
    } else {
      ans.push(arr[i] * 2)
    }
  }
  return ans
}