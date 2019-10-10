package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class CharmanderTest {
    Charmander charmander;

    @Before
    public void setUp() {
        charmander = new Charmander();
    }

    @Test
    public void testEvolve() {
        assertEquals(charmander.evolve(), null);
    }

    @Test
    public void testDefend() {
        charmander.setDefenseMultiplier(.5);
        charmander.setHitPoints(20);
        charmander.defend(5);
        assertEquals(charmander.getHitPoints(), 18, 0);
    }

    @Test
    public void testMainAttack() {
        charmander.setHitPoints(20);
        String attack = "Attacking opponent with Ataque Scratch causing a damage of 18";
        assertEquals(attack, charmander.mainAttack());
    }

    @Test
    public void testSecondAttack() {
        charmander.setHitPoints(20);
        String attack = "Attacking opponent with Ataque Future Sight causing a damage of 22";
        assertEquals(attack, charmander.secondAttack());
    }

}