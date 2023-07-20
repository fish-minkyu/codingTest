function solution(arr) {
  let ans = []

  for (let i = 0; i < arr.length; i++) {
    for (let j = 0; j < arr[i]; j++) {
      ans.push(arr[i])
    }
  }
  return ans
}