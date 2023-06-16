function solution(a, b) {
    let ans = 0
  if (a > b) {
    for (let i = b; i <= a; i++) {
        ans += i
    }
    // return ans
    } else if (a <= b) {
        for (let i = a; i<= b; i++) {
            ans += i
        }
        // return ans
    }
    return ans
}