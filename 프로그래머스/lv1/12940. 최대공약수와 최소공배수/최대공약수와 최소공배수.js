// 두 수 m과 n이 있을 때, m * n = 최대공약수(GCD) * 최소공배수(LCM)
// 최대공약수 구하는게 더 빠를거 같다
// m,n은 1이상 1000000이하의 자연수 -> 유클리드 호제법으로 구하자

// 1071, 1029 (a > b)
// 1071(a) % 1029(b) = 42

// 1029(b) % 42(r) != 0, 
// 1029(b) % 42(r) = 21(c)
// 42(r) % 21(c) == 0
// GCD == 21

// 최소공배수 = m * n / GCD

function solution(n, m) {
    let ans = [n, m] // [5, 12]

    let sorted_ans = ans.sort((a, b) => { b - a }) // [12, 5]


    for (let i = 0; i < 100; i++) {
        if (!sorted_ans[i] % sorted_ans[i + 1] != 0) {
            continue
        } else {
            ans.push(sorted_ans[i] % sorted_ans[i + 1])
        }
    } 

    let GCD = ans.at(-2) // 21
    let LCM = (m * n) / GCD // 52479

    return [GCD, LCM]
}