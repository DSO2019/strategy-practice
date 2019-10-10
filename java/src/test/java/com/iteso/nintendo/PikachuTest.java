package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class PikachuTest {
    Pikachu pikachu;

    @Before
    public void setUp() {
        pikachu = new Pikachu();
    }

    @Test
    public void testEvolve() {
        assertEquals(pikachu.evolve(), null);
    }

    @Test
    public void testDefend() {
        pikachu.setDefenseMultiplier(.5);
        pikachu.setHitPoints(20);
        pikachu.defend(5);
        assertEquals(pikachu.getHitPoints(), 18, 0);
    }

    @Test
    public void testMainAttack() {
        pikachu.setHitPoints(20);
        String attack = "Attacking opponent with Ataque Psychic causing a damage of 17";
        assertEquals(attack, pikachu.mainAttack());
    }

    @Test
    public void testSecondAttack() {
        pikachu.setHitPoints(20);
        String attack = "Attacking opponent with Ataque VoltTackle causing a damage of 23";
        assertEquals(attack, pikachu.secondAttack());
    }

}
