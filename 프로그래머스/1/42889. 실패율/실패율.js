function solution(N, stages) {
    let result = [];
    for(let i=1; i<=N; i++){
        let denominator = stages.filter((x) => x >= i).length; // 분모
        let numerator = stages.filter((x) => x === i).length; // 분자
        result.push([i, numerator / denominator]);
    }
    result.sort( (a, b) => b[1] - a[1] );
    return result.map( (x) => x[0] );
}