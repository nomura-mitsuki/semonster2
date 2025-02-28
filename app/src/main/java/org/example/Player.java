package org.example;

import java.util.ArrayList;
import java.util.Random;

/**
 * プレイヤーはモンスターデッキを持つ
 *
 * Deck：MonsterのArrayList
 */
public class Player {
  String name;
  int HP = 5;
  ArrayList<Monster> deck = new ArrayList<>();
  
  public Player() {
    this.name = "user";
    drawMonsters();
  }

  public Player(String name){
    this.name = name;
    drawMonsters();
  }
  
  public void drawMonsters() {
    Random rand = new Random();
    for (int i = 0; i < 8; i++) {
      int r = rand.nextInt(5);
      int r2 = rand.nextInt(5);
      this.deck.add(new Monster(r, r2));
    }
  }

  public String toString() {
    StringBuilder info = new StringBuilder();
    info += "Deck:" + this.name + "\n";
    info += "HP:" + this.HP + "\n";
    for (int i = 0; i < 8; i++) {
      info += this.deck.get(i).toString();
    }
    return info.toString();
  }

}
