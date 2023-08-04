function solution(my_string, n) {
  var repeatString = ''
  var newString = ''
  for (let i = 0; i < my_string.length; i++) {
    for (let j = 1; j <= n; j++) {
      repeatString += my_string[i]
    }
  }
  newString += repeatString
  return newString
}