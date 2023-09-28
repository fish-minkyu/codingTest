function solution(n_str) {
  let result = ''

  for (let i = 0; i < n_str.length; i++) {
    if (n_str[i] !== '0') {
      result = n_str.slice(i)
      break
  }}
  return result
}