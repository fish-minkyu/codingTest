// delete_list.indexOf(arr[i])

function solution(arr, delete_list) {
  let ans = []

  for (let i = 0; i < arr.length; i++) {
    if (!(delete_list.indexOf(arr[i]) +1)) {
      ans.push(arr[i])
    }
  }
  
  return ans
}