function solution (n) {
  for ( let i = 1; i <= n ; i++) {
   if (i*i === n) {
    return 1
   } else if (i*i > n) {
    return 2
   }
  }
}