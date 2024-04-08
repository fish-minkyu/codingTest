class Solution {
  public int solution(String[] order) {
    int price = 0;

    for (String menu : order) {
      if (menu.equals("anything")) price += 4500;
      if (menu.contains("americano")) price += 4500;
      if (menu.contains("cafelatte")) price += 5000;
    }

    return price;
  }
}