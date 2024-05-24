class Solution {
  public int solution(int hp) {
    int g = 0;
    int s = 0;
    int w = 0;

    if (hp < 3) return hp;

    if (hp >= 5) {
      g = hp / 5;
      hp %= 5;
    }
    
    if (hp >= 3) {
      s = hp / 3;
      hp %= 3;
    }
    
    if (hp >= 1) {
      w = hp;
    }

    return s + g + w;
  }
}