// arr, n
// if arr.length % 2 == 0
// true -> index 홀수번호 for문하여 n 더하기
// false -> index 짝수번호 for문하여 n 더하기
// return

let arr = [49, 12, 100, 276, 33];
let n = 27;

function solution(arr, n) {
    let sum_arr = []

    for (let i = 0; i < arr.length; i++) {
        if (arr.length % 2 == 0) {
            i % 2 == 1 ? sum_arr.push(arr[i] + n) : sum_arr.push(arr[i])
        } else {
            i % 2 == 0 ? sum_arr.push(arr[i] + n) : sum_arr.push(arr[i])
        }
    }
    return sum_arr
}