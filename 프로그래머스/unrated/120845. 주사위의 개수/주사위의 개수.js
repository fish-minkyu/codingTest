function solution(box, n) {
  let int = 0
  let multi = 1

 for (let item of box) {
  int = Math.floor(item / n)
  multi *= int
 }

 return multi
}