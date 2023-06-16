// sum += price * N
// for문 사용 - count번 반복
// if문 사용 - sum
// return 
// => result = sum - money

function solution(price, money, count) {
    let sum = 0
    let ans = 0
    for (let i = 1; i <= count; i++) {
        if (i <= count) sum += price * i
    }

    if (money >= sum) {
        return ans = 0
    } else {
        return ans = sum - money
    }
}


