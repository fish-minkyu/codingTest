function solution(names) {
  let ans = []

 for (let i = 0; i < names.length; i++) {
  if (i % 5 == 0) {
    ans.push(names[i])
  }
 }

 return ans
}