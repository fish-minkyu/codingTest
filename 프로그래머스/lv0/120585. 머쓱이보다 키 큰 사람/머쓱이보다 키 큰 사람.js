function solution(array, height) {
    let num = 0
    for (let i = 0 ; i < array.length; i++) {
        if (array[i] > height) num++
    }
    return num
}