function solution(my_string, is_suffix) {
  let ans = []

  for (let i = 0; i < my_string.length; i++) {
    ans.push(my_string.slice(i, my_string.length+1))
  }
  
  return ans.filter(item => item === is_suffix).length
}