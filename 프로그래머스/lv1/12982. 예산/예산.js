function solution(d, budget) {
  let arr = d.sort((a, b) => a - b), sum = 0, count = 0
  
  for (let i = 0; i < arr.length; i++) {
   count++
   sum += arr[i]

   if (sum > budget) 
    count--
  }
  return count
}