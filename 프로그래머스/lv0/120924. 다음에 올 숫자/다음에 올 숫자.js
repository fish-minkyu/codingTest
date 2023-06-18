// 내 코드

// 등차수열 or 등비수열
//  d = An - A / (n-1)
//  r = a[1] / a[o]

// arr
// d = arr[arr.length-1] - arr[0] / (arr.length -1)

// r = arr[arr.length] / arr[arr.length-1]

// 문제점.
// 등차수열 & 등비수열의 공식을 못 써서 if문이 정상적으로 작동을 못함

// 시도.
// 노트에 식을 적어 공식을 추출하려고 노력함

// 내 코드

// 등차수열 or 등비수열
//  d = An - A / (n-1)
//  r = a[1] / a[o]

// arr
// d = arr[arr.length-1] - arr[0] / (arr.length -1)

// r = arr[arr.length] / arr[arr.length-1]

// 모범 답안

// 등차수열 a = [2, 4, 6, 8]
// 등비수열 a = [2, 4, 8, 16]

function solution(a) { 
		// 1. 등비수열 조건식
    // if (((a[1] / a[0]) * a[1]) === a[2])
		// 1-1. (a[1] / a[0])으로 공비(r)를 구한다.
		// 1-2. 다음 값인 a[2]와 a[1] * r을 곱해서 같으면 등비수열

		// 2. 등비수열 중간값으로 조건식 구하기
		// 2-1. [a, ar, arr]
		// 2-2. a * arr = aarr    ar * ar = aarr
		// if (a[0] * a[2] == a[1] ** 2)

		// 3. 등차수열 조건식
		// 3-1. [a, a+d, a+d+d]
		// 3-2. (a[1] - a[0]) == (a+d - a)
		// 3-3. ((a[1] - a[0]) + a[1]) == (a+d - a) + (a+d)
		// 3-4 (a+d - a) + (a+d) == (a+d+d)
    if (((a[1] - a[0]) + a[1]) === a[2]) {
        gap = a[1] - a[0];
        return a[a.length -1] + gap
    }
    else {
        gap = a[1] / a[0];
        return a[a.length - 1] * gap;
    }
}

// 알게된 점.
// 1. 등차수열의 공차 구하는 식과 등비수열의 공비를 구하는 식을 remind함
// 2. 수열에 약하다는 것을 깨달음
// 3. return answer.at(-1); 
// 	=> 배열일 때, 배열의 길이에 상관없이 at()의 ()값이 음수이면 index 끝에서부터 추출 가능
// 		(js 함수에서 정리)