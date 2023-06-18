// s.length 4 or 6
// only 숫자로만 구성이 되어야 true
// if문 -> for문 -> if문 사용 

function solution(s) {
    let ans = 0

    if(s.length == 4 || s.length == 6) {
        for (let i = 0; i < s.length; i++) {
            if (isNaN(parseInt(s[i]))) {
                return ans = false
            } else {
                ans = true
            }
        }
    } else {return false}
     return ans
}
