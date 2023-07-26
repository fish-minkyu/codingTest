function solution(arr, k) {
    let new_arr = [...new Set(arr)]; // [0, 1]

    if (new_arr.length > k) {
        return new_arr.slice(0, k);
    } else {
        let test = [...new_arr, Array(k - new_arr.length).fill(-1)].flat();
        console.log(test);
        return [...new_arr, Array(k - new_arr.length).fill(-1)].flat();
        // flat : 평평하다.
        // [0, [1, [-1, -1]]] => [0, 1, [-1, -1]]
        // Array(n).fill(m) => n의 길이를 가진 배열을 만든 후 모든 값을 m 으로 채워주세요.
    };
}