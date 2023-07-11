// 2 -> 0
// 0 -> 5
// 5 -> 2

function solution(rsp) {
    let ans = ''

   for (let i = 0; i < rsp.length; i++) {
        if (rsp[i] == 2) ans += 0
        if (rsp[i] == 0) ans += 5
        if (rsp[i] == 5) ans += 2
   }
   return ans
}