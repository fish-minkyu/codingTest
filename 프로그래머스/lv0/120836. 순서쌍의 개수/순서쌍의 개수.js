function solution(n) {
    let ans = []
    for (let i = 0; i <= n; i++) {
        if (n % i === 0) ans.push(i)
    }
    return ans.length
}