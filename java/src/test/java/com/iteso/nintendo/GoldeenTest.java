package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class GoldeenTest {
    Goldeen goldeen;

    @Before
    public void setUp() {
        goldeen = new Goldeen();
    }

    @Test
    public void testEvolve() {
        assertEquals(goldeen.evolve(), null);
    }

    @Test
    public void testDefend() {
        goldeen.setDefenseMultiplier(.5);
        goldeen.setHitPoints(20);
        goldeen.defend(5);
        assertEquals(goldeen.getHitPoints(), 18, 0);
    }

    @Test
    public void testMainAttack() {
        goldeen.setHitPoints(20);
        String attack = "Attacking opponent with Ataque Psychic causing a damage of 17";
        assertEquals(attack, goldeen.mainAttack());
    }

    @Test
    public void testSecondAttack() {
        goldeen.setHitPoints(20);
        String attack = "Attacking opponent with Ataque Surf causing a damage of 10";
        assertEquals(attack, goldeen.secondAttack());
    }

}
