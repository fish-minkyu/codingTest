function solution(numbers, n) {
   let result = 0
   let i = 0

   while (result <=n) {
      result += numbers[i]
      i++
     
   }
   return result
}