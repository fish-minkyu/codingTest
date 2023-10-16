function solution(my_string) {
  let arr = []

  for (let i = 0; i < my_string.length; i++) {
    if (!isNaN(Number(my_string[i]))) {
      arr.push(Number(my_string[i]))
    }
  }

  return arr.sort((a, b) => a - b)
}