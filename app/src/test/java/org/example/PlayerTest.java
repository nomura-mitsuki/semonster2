package org.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class PlayerTest {

    @Test
    public void testDefaultConstructor() {
        Player player = new Player();
        assertEquals("user", player.name);
        assertEquals(8, player.deck.size());

        for (Monster m : player.deck) {
            assertNotNull(m);
            assertTrue(m.toString().matches(".+レア度\\[\\d+\\]\\n"));
        }
    }

    @Test
    public void testParameterizedConstructor() {
        Player player = new Player("testPlayer");
        assertEquals("testPlayer", player.name);
        assertEquals(8, player.deck.size());

        for (Monster m : player.deck) {
            assertNotNull(m);
            assertTrue(m.toString().matches(".+レア度\\[\\d+\\]\\n"));
        }
    }

    @Test
    public void testToString() {
        Player player = new Player("testPlayer");
        String playerInfo = player.toString();

        assertTrue(playerInfo.contains("Deck:testPlayer\n"));
        assertEquals(8, player.deck.size());

        for (Monster m : player.deck) {
            assertTrue(playerInfo.contains(m.toString()));
        }
    }
}
