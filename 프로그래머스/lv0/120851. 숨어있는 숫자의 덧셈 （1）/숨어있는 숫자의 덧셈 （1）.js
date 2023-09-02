function solution(my_string) {
  let ans = 0
  for (let i = 0; i < my_string.length; i++) {
    if (isNaN(my_string[i])) {}
    else {
      ans += Number(my_string[i])
    }
  }
  return ans
}