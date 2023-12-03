function solution(myString) {
  const arr = myString.split("x")
  const result = []
  for (let i = 0; i < arr.length; i++) {
    result.push(arr[i].length)
  }

  return result
}