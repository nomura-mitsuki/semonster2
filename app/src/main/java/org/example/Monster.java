package org.example;

public class Monster {
  private String name;
  private int rare; // 戦うとレア度が高いほうが勝つ．同じ場合は引き分け

  Monster(int nameNum, int rareNum) {
    this.name = this.summonMonster(nameNum);
    this.rare = rareNum;
  }

  String summonMonster(int mnumber) {
    String monsters[] = { "スライム", "サハギン", "ドラゴン", "デュラハン", "シーサーペント" };
    String monstersEvol[] = { "メタルスライム", "スーパーサハギン", "ホワイトドラゴン", "ダークデュラハン", "ブラックシーサーペント" };
    if (this.rare >= 3) {
      return monstersEvol[mnumber];
    } else {
      return monsters[mnumber];
    }
  }

  @Override
  public String toString() {

    return this.name + ":レア度[" + this.rare + "]\n";
  }
}
