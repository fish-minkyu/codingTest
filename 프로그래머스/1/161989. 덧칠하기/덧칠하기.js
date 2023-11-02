function solution(n, m, section) {
 let arr = Array(n).fill(false)
 let count = 0

 for (let sector of section) {
  arr[sector] = true
 }

 for (let i = 0; i < arr.length; i) {
  if (arr[i]) {
    arr.splice(i, m)
    i = 0
    count++
  } else {
    i++
  }
 }

 return count
}