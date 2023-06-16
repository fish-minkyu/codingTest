function solution(x, n) {
    let sum = 0
    var ans = [];

    for (let i = 0; i < n; i++) {
        sum += x
        ans.push(sum)
    }
    return ans
}
