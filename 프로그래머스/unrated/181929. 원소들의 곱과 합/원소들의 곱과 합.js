function solution(num_list) {
    let sum = 0
    let multi = 1

    let result_sum_2 = num_list.map(item => sum += item).at(-1) ** 2
    let result_multi = num_list.map(item => multi *= item).at(-1)

   return result_sum_2 > result_multi ? 1 : 0
}