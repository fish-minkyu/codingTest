function solution(array) {
    const arr = array.sort((a, b) => a - b)
    return array[Math.floor(arr.length/2)]
}