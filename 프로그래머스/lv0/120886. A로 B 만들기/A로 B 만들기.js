// sort()
// before 정렬
// after 정렬
// 배열이면 비교를 못하므로 문자열로 합쳐서 비교


function solution(before, after) {
    let sorted_before = [...before].sort().join('')
    let sorted_after = [...after].sort().join('')

    return sorted_before == sorted_after ? 1 : 0
}
