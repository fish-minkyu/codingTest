// 3중 for문

function solution(number) {
    let cnt = 0

    for (let x = 0; x < number.length - 2; x++) {
        for (var y = x + 1; y < number.length - 1; y++) {
            for (let z = y + 1; z < number.length; z++) {
                if (number[x] + number[y] + number[z] == 0) { // 1, 3, -4
                    cnt++ // 
                }
            }
            
        }
        
    }
    return cnt
}
