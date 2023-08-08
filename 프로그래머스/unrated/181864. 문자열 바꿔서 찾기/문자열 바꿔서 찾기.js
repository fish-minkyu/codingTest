function solution(myString, pat) {
 let str = ''

  for (let i = 0; i < myString.length; i++) {
    if (myString[i] == "A") {
      str += "B"
    } else {
      str += "A"
    }
  }
  return str.indexOf(pat) +1 ? 1 : 0
}