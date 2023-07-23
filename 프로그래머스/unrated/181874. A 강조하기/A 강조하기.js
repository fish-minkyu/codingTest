function solution(myString) {
  let ans = []

 for (let i = 0; i < myString.length; i++) {
  if (myString[i] == "a" || myString[i] == "A") {
    ans.push(myString[i].toUpperCase())
  } else {
    ans.push(myString[i].toLowerCase())
  }
 }
 return ans.join('')
}