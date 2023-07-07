function solution(n) {
    var result = 0
    // 반복문으로 n이하 숫자 가지고오기
    for (i = 1; i <= n; i++) {
    // 조건문으로 짝수만 걸러내서 더하기
        if (i % 2 === 0) {
            result += i
        }
    }
    return result
}

