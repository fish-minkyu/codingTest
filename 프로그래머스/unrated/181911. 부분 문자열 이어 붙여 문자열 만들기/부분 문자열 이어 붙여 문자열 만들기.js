function solution(my_strings, parts) {
  let result = ''
  let a = 0, b = 0
 
  for (let i = 0; i < my_strings.length; i++) {
    [a, b] = parts[i]
    
    result += my_strings[i].substring(a, b+1)
  }

  return result
}