function solution(myString, pat) {
	let string1 = ''
	let string2 = ''

	for (let i = 0; i < myString.length; i++) {
		string1 += myString[i].toUpperCase()
	}

	for (let j = 0; j < pat.length; j++) {
		string2 += pat[j].toUpperCase()
	}

	return string1.includes(string2) ? 1 : 0
}