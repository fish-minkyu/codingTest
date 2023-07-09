// before의 스펠링 종류와 개수를 구한다.
// after의 스펠링 종류와 개수를 구한다.
// before과 after과의 스펠링 종류와 개수가 같으면 1 아니면 0

// sort()


function solution(before, after) {
    let sorted_before = [...before].sort().join('')
    let sorted_after = [...after].sort().join('')

    return sorted_before == sorted_after ? 1 : 0
    
}
