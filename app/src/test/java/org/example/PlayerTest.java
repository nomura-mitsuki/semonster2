package org.example;

import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class PlayerTest {

    private Player player;

    @BeforeEach
    public void setUp() {
        player = new Player("TestPlayer");
    }

    @Test
    public void testPlayerInitialization() {
        Assertions.assertEquals("TestPlayer", player.name);
        Assertions.assertEquals(5, player.HP);
        Assertions.assertEquals(8, player.deck.size()); // 初期デッキが8枚であることを確認
    }

    @Test
    public void testDrawMonsters() {
        player.drawMonsters();
        Assertions.assertEquals(16, player.deck.size()); // drawMonsters() が呼ばれた後、デッキが16枚になることを確認
    }

    @Test
    public void testToString() {
        String expectedString = "Deck:TestPlayer\n" +
                                "HP:5\n";
        for (int i = 0; i < 5; i++) {
            expectedString += player.deck.get(i).toString();
        }
        Assertions.assertEquals(expectedString, player.toString());
    }

}
