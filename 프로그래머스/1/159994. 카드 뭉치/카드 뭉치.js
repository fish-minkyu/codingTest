function solution(cards1, cards2, goal) {
  /*
  1. 찾을 단어와 카드 뭉치의 제일 앞에 있는 것과 비교해서 찾은 단어라면 소멸
  2. 두 뭉치를 전부 썼으면 조합 가능
  3. goal 외의 글자를 카드 뭉치들이 가졌을 경우가 있으므로 Count를 통해 goal 길이만큼 삭제했는지 확인
  */

  let count = 0;

  for(let i = 0 ; i < goal.length ; i += 1){
    const findWord = goal[i];
    
    if (cards1[0] === findWord) {
      cards1.shift();
      count++;
    }else if(cards2[0] === findWord){
      cards2.shift();
      count++;
    }else {
      return "No"
    }
  }

  return goal.length === count ? "Yes" : "No"
}