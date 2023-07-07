// code.Array.fill().map으로 code의 길이만큼 idx배열 생성
// filter로 q로 나누면 r값이 나오는 idx배열 새로 생성
// for-of문으로 빈 배열 ans에 push
// ans.join(')

function solution(q, r, code) {
    let ans = []

    let length = Array(code.length).fill().map((_, idx) => idx)
    let filter = length.filter(item => item % q == r)

    for (let i of filter) {
        ans.push(code[i])
    }

    return ans.join('')
}
