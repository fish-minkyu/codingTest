// s 문자열 split word 주머니 만들기
// 이중 map 메서드 활용 <- try를 넣고 t를 넣어야 하므로
// 2번째 map에 if문 넣기
// 결과괎이 문자열이므로 join으로 TrY 한번 묶기
// join 한번 더전체 문자열 하나로 묶기


function solution(s) {
	let arr = s.split(' ') // ['try', 'hello', 'world']
    let word = ''

    let ans = arr.map((a) => {
    word = a.split('') //['t', 'r', 'y']
   return word.map((w, i) => {
        if(i % 2 ==0) {
            return w.toUpperCase() // 짝수일 시 대문자
        } else {
            return w.toLowerCase() // 홀수일 시 소문자
        }
    }).join('') // ['Try']
    }).join(' ') // ['Try' 'HeLlO', ]

    return ans
}