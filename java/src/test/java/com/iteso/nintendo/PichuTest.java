package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by el diablo on 2/24/18.
 */
public class PichuTest {
    Pichu pichu;

    @Before
    public void setUp() {
        pichu = new Pichu();
    }

    @Test
    public void testEvolve() {
        assertEquals(pichu.evolve(), null);
    }

    @Test
    public void testDefend() {
        pichu.setDefenseMultiplier(.5);
        pichu.setHitPoints(20);
        pichu.defend(5);
        assertEquals(pichu.getHitPoints(), 18, 0);
    }

    @Test
    public void testSecondAttack() {
        pichu.setHitPoints(20);
        String attack = "Attacking opponent with Thunderbolt causing a damage of 13";
        assertEquals(attack, pichu.secondAttack());
    }

    @Test
    public void testMainAttack() {
        pichu.setHitPoints(20);
        String attack = "Attacking opponent with Tackle causing a damage of 4";
        assertEquals(attack, pichu.mainAttack());
    }

}
