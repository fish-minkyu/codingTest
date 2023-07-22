function solution(num_list) {
  let str = num_list.sort((a, b) => a - b)
  let arr = []

  for (let i = 0; i < 5; i++) {
    arr.push(str[i])
  }
  return arr
}