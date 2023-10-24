function solution(nums) {
  let answer = 0

  for (let i = 0; i < nums.length -2; i++) {
    for (let j = i+1; j < nums.length -1; j++) {
      for (let z = j+1; z < nums.length; z++) {
        let sum = nums[i] + nums[j] + nums[z]
        answer++

        for (let n = 2; n <= Math.sqrt(sum); n++) {
          if (sum % n === 0) {
            answer--
            break
          }
        }
      }
    }
  }

  return answer
}