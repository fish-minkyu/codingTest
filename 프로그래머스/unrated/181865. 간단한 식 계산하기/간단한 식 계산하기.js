function solution(binomial) {
  let arr = binomial.split(" ")
  let result = 0

  switch(arr[1]) {
    case "+":
      result = Number(arr[0]) + Number(arr[2])
      break
    case "-":
      result = Number(arr[0]) - Number(arr[2])
      break
    case "*":
      result = Number(arr[0]) * Number(arr[2])
      break
  } 

  return result
}