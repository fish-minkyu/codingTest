// A = 65 Z = 90
// a = 97 z = 122

function solution(s, n) {
	let ans = ''
	for (let i = 0; i < s.length; i++) {
		let sASCII = s.charCodeAt(i)

		if (sASCII >= 65 && sASCII <= 90) {
			sASCII += n
			if (sASCII > 90) {
				sASCII -= 26
			}
		} else if (sASCII >= 97 && sASCII <= 122) {
			sASCII += n
			if (sASCII > 122) {
				sASCII -= 26
			}
		}

		str = String.fromCharCode(sASCII)
		ans += str
	}

	return ans
}