import java.util.ArrayList;

/**
 * プレイヤーはモンスターデッキを持つ
 *
 * Deck：MonsterのArrayList
 */
public class Player {
  ArrayList<Monster> deck = new ArrayList<>();

  public void drawMonsters() {
    for (int i = 0; i < 5; i++) {
      Random r = new Random()　% 5;
      Random r2 = new Random() % 5;
      this.deck.add(new Monster(r, r2));
    }
  }

  public void showDeck() {
    for (Monster m : this.deck) {
      System.out.println(m);
    }
  }

}
