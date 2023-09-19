// n 이하 양의 정수 배열 만들기
// n 홀짝 판단
// 반복 루프를 돌아서 홀, 짝 값 더하기
function solution(n) {
	let sum = 0
	let nums = Array(n).fill().map((_, idx) => idx + 1)
	
	if (n % 2 == 0) {
		nums.filter(item => item %  2 == 0).map(v => sum += v * v)
	} else {
		nums.filter(item => item %  2 !== 0).map(v => sum += v)
	}

	return sum
}