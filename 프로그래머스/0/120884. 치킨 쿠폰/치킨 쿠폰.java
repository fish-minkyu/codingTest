class Solution {
  public int solution(int chicken) {
    // 몫의 합이 곧 서비스의 치킨 수
    int service = 0;
    int share = 0;
    int rest = 0;
    
    while ( chicken >= 10) {
      share = chicken / 10;
      rest = chicken % 10;
      service += share;
      chicken = share + rest;
    }
    
    return service;
  }
}