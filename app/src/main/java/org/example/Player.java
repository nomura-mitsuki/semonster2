import java.util.ArrayList;
import java.util.Random;

/**
 * プレイヤーはモンスターデッキを持つ
 *
 * Deck：MonsterのArrayList
 */
public class Player {
  String name;
  ArrayList<Monster> deck = new ArrayList<>();
  
  player() {
    this.name = "user";
    drawMonsters();
  }

  player(String name){
    this.name = name;
    drawMonsters();
  }
  
  public void drawMonsters() {
    for (int i = 0; i < 8; i++) {
      int r = rand.nextInt(5);
      int r2 = rand.nextInt(5);
      this.deck.add(new Monster(r, r2));
    }
  }

  public String toString() {
    String info = "";
    info += "Deck:" + this.name + "\n";
    for (int i = 0; i < 5; i++) {
      info += this.deck.get(i).toString();
    }
    return info;
  }

}
