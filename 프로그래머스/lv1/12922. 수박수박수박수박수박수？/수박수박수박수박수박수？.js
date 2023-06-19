// if문 사용
// repeat() 메서드 사용
// 짝수면 n/2를 해서 '수박' 반복
// 홀수면 기본값 '수'를 주고 3이상부터 (n-1)/2 '박수' 반복

function solution(n) {
    let ans = 0
        if (n % 2 == 0) {
            ans = '수박'.repeat(n/2)
        } else {
            ans = '수'
            ans += '박수'.repeat((n-1)/2)
        }
    return ans
}