package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by el diablo on 2/24/18.
 */
public class RaichuTest {
    Raichu raichu;

    @Before
    public void setUp() {
        raichu = new Raichu();
    }

    @Test
    public void testEvolve() {
        assertEquals(raichu.evolve(), null);
    }

    @Test
    public void testDefend() {
        raichu.setDefenseMultiplier(.5);
        raichu.setHitPoints(20);
        raichu.defend(5);
        assertEquals(raichu.getHitPoints(), 18, 0);
    }

    @Test
    public void testSecondAttack() {
        raichu.setHitPoints(20);
        String attack = "Attacking opponent with Thunderbolt causing a damage of 20";
        assertEquals(attack, raichu.secondAttack());
    }

    @Test
    public void testMainAttack() {
        raichu.setHitPoints(20);
        String attack = "Attacking opponent with Tackle causing a damage of 8";
        assertEquals(attack, raichu.mainAttack());
    }

}
