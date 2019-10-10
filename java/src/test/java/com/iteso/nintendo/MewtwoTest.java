package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class MewtwoTest {
    Mewtwo mewtwo;

    @Before
    public void setUp() {
        mewtwo = new Mewtwo();
    }

    @Test
    public void testEvolve() {
        assertEquals(mewtwo.evolve(), null);
    }

    @Test
    public void testDefend() {
        mewtwo.setDefenseMultiplier(.5);
        mewtwo.setHitPoints(20);
        mewtwo.defend(5);
        assertEquals(mewtwo.getHitPoints(), 18, 0);
    }

    @Test
    public void testMainAttack() {
        mewtwo.setHitPoints(20);
        String attack = "Attacking opponent with Ataque Psychic causing a damage of 17";
        assertEquals(attack, mewtwo.mainAttack());
    }

    @Test
    public void testSecondAttack() {
        mewtwo.setHitPoints(20);
        String attack = "Attacking opponent with Ataque VoltTackle causing a damage of 23";
        assertEquals(attack, mewtwo.secondAttack());
    }

}
