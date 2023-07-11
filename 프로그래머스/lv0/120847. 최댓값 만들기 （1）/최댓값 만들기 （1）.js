function solution(numbers) {
    let sorted_num = numbers.sort((a, b) => a - b)
    
    return sorted_num.at(-1) * sorted_num.at(-2)
}