function solution(num_list) {
    let even = ''
    let odd = ''

    for (let i = 0; i < num_list.length; i++) {
        if (num_list[i] % 2 == 0) {
            even += num_list[i].toString()
        } else {
            odd += num_list[i].toString()
        }
    }

    return +even + +odd

}