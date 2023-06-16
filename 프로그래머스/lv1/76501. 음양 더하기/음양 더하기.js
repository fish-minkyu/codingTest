function solution(absolutes, signs) {
    let ans = 0

    for (let i = 0; i < signs.length; i++) {
        if (signs[i] === false) absolutes[i] = absolutes[i] * -1
    };

    for (let i = 0; i < absolutes.length; i++) {
        ans += absolutes[i]
    };
    return ans
}
