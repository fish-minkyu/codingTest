function solution(n) {
    let str = n.toString()

    let arr = [...str].sort(function(a, b){
        return b - a
    }).join('')
    
    let int = parseInt(arr)

    return int
}
