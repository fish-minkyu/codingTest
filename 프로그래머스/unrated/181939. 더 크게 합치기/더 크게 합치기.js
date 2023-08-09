function solution(a, b) {
    let str_a = a.toString()
    let str_b = b.toString()

    if (Number(str_a + str_b) > Number(str_b + str_a)) {
        return Number(str_a + str_b)
    } else {
        return Number(str_b + str_a)
    }
}