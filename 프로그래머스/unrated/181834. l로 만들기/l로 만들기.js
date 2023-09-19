function solution(myString) {
  let ans = []
   
  for (let i = 0; i < myString.length; i++) {
    if (myString[i].charCodeAt() < "l".charCodeAt()) {
      ans.push("l")
    } else {
      ans.push(myString[i])
    }
  }
  return ans.join('')
}