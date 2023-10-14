function solution(a, b, n) {
  let sum = 0
  let c = 0
  let d = 0

  
  while(n >= a) {
    c = Math.floor(n / a)
    d = Math.floor(n % a)
    
    sum += c * b

    n = (c * b) + d 
  }
  
  return sum
}