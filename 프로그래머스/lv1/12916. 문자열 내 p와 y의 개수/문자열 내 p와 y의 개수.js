// s에 p와 y의 개수가 같으면 Ture 다르면 False
// 대소문자 상관없으므로 전부 대문자 변환(조건식 간단히 써줄려고)
// for문으로 문자열 하나씩 넣어주기
// 각각의 조건문 사용
// 조건문1 각 요소별로 P가 있다면 +1
// 조건문2 각 요소별로 Y과 있다면 +1
// 조건문3 변수 p와 y를 비교

// key point. 하나의 반복문에 각기 다른 조건문을 넣을 수 있다.

function solution(s){
    var str_c = s.toUpperCase()
    let p = 0
    let y = 0

    for (let i = 0; i < str_c.length; i++) {
        if (str_c[i] == 'P') p++

        if (str_c[i] == 'Y') y++
    }
    return (p == y) ? true : false
}