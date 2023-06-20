function solution(l, r) {
    const result = []
    for(let i = l ; i <= r ; i ++) {
        if(i%5 !== 0) continue // 5의 배수가 아닌 수들은 continue
        const charI = String(i)
  // console.log(charI) // 문자타입의 5의 배수들이 할당
        if(![...charI].every(a => a === '5' || a === '0')) continue

	// console.log([...charI]) // 문자타입의 5의 배수들이 배열화되어 저장 ex. 550 -> ['5', '5', '0']

	// if(![...charI].every(a => a === '5' || a === '0'))은
	// [...charI].every(a => a === '5' || a === '0')가 논리 부정 연산자 '!'로 인해
	// true이면 false를 false이면 true가 나온다.
	// 예를 들어, charI가 20일 때, every()가 false를 반환하고 !로 인해 true되어
	// continue를 만나 for문을 실행한다.
        result.push(i) // false를 만나면 result 배열에 들어간다.

  // if([...charI].every(a => a === '5' || a === '0')) result.push(i)
	// => 배열 charI의 요소들을 every가 하나 하나 조건에 대입한다.
	// true이면 result 배열에 넣는다.
        
    }
    return result.length ? result : [-1] 
		//=>  배열 result의 길이가 0이라면 false이므로 삼항 논산자를 이용해서 -1를 추출한다.
}