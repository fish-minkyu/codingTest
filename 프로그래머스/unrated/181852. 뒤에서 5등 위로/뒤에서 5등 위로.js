function solution(num_list) {
   let sorted_num = num_list.sort((a, b) => {
        return a - b
   })
   
   return sorted_num.splice(5, num_list.length)
}