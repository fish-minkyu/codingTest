function solution(my_string, alp) {
  let arr = my_string.split('')

  let ans = arr.map(item => {
      if (item == alp) {
         return item.toUpperCase()
      } else {
         return item
      }
  }).join('')

  return ans
}