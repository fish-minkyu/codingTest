function solution(num_list) {
   let arr = num_list

    if(arr.at(-1) > arr.at(-2)) {
        arr.push(arr.at(-1) - arr.at(-2))
    } else {
        arr.push(arr.at(-1) * 2)
    }
    return arr
}