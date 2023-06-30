function solution(num_list) {
  let sum = 0
  let multiply = 1

  if(num_list.length >= 11) return num_list.map(x => sum += x).at(-1)
  else return num_list.map(y => multiply *= y).at(-1)
}
