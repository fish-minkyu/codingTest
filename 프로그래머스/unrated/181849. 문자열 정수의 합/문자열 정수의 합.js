function solution (num_str) {
    let sum = 0
    let arr = num_str.split('')

    return arr.map(item => {
       return sum += Number(item)
    }).at(-1)

}