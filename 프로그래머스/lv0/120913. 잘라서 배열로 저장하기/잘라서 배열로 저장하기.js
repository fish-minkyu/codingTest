function solution(my_str, n) {
   let arr = []
   for (let i = 1; i <= Math.ceil(my_str.length / n); i++) {
      arr.push(my_str.substr((i-1) * n, n))
   }
   return arr
}