function solution (numbers) {
    let arr = [1, 2, 3, 4, 5, 6, 7, 8, 9]
    let total_sum = 45

    for (let i = 0; i < numbers.length; i++) {
        if (arr.indexOf(numbers[i]) >= 0) {
            total_sum -= numbers[i]
        }
    }
    return total_sum
}