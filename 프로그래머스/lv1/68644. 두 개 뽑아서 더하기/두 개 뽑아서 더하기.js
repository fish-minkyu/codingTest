function solution(numbers) {
	let arr = []
	let sum = 0

	for (let i = 0; i < numbers.length; i++) {
		for (let j = i+1; j < numbers.length; j++) {
			sum = numbers[i] + numbers[j]
			arr.push(sum)
		}
	}

	let ans = [...new Set(arr)].sort((a, b) => a - b)
	return ans
}