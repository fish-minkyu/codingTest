// 배열을 정렬
// for문 i를 통해 각각 배열을 비교한다.
// 배열이 일치하지 않으면 그 요소가 통과하지 못한 요소다.
// if문 - (p[i] !== c[i]) 조건
// true일 시, 해당 요소값 반환

function solution(p, c) {
    p.sort(); // [ 'ana', 'mislav', 'mislav', 'stanko' ]
    c.sort(); // [ 'ana', 'mislav', 'stanko' ]


    for(var i=0;i<p.length;i++){
        if(p[i] !== c[i]){
            return p[i];
        }
    }
}
