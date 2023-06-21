// sort 사용 불가 arr 원본 그대로 출력해야 함
// splice 사용
// Math.min 사용

let arr = [4, 3, 1, 2]

function solution(arr){
    if (arr.length == 1) {
        return [-1]
    } else {
        arr.splice(arr.indexOf(Math.min(...arr)), 1)
        return arr        
    }
}
