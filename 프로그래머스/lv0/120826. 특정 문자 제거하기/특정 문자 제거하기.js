function solution(my_string, letter) {
  var newString = ''
  for (let i = 0; i < my_string.length; i++)  
    if (my_string[i] === letter) {
      continue
    } else {
      newString += my_string[i]
    }
    return newString
}