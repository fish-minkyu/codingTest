function solution(n) {
    let ans = []

    let arr = Array(n).fill().map((_, index) => index+1)
    
    for (let i = 0; i < arr.length; i++) {
        let cnt = 0
        for (let j = 1; j <= arr[i]; j++) {
            if (arr[i] % j == 0) {
                cnt++
            }
        }
        ans.push(cnt)
    }
   let arr1 = ans.filter(item => item >= 3)

    return arr1.length
}