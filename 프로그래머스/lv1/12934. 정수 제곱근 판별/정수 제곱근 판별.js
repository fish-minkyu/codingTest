function solution(n) {
    let num = Math.floor(Math.sqrt(n))
    
    if (Math.sqrt(n) == Math.floor(Math.sqrt(n))) {
        return Math.pow(num+1, 2)
    } else {
        return -1
    }
}