package com.iteso.nintendo;

import com.iteso.nintendo.Raichu;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by AlfredoRodriguez on 2/24/18.
 */
public class RaichuTest {
    Raichu raichu;

    @Before
    public void setUp() {
        raichu = new Raichu();
    }

    /** First attack */
    @Test
    public void firstAttack() {
        assertEquals("Attacking opponent with Impacthunder causing a damage of 25", raichu.mainAttack());
    }

    /** Second attack */
    @Test
    public void secondAttack() {
        assertEquals("Attacking opponent with Slam causing a damage of 15", raichu.secondAttack());
    }

    /** Defense test */
    @Test
    public void defend() {
        assertEquals("Defending attack, damage caused is 0 new HP is 100", raichu.defend(0));
    }

    /** Name test */
    @Test
    public void test_name() {
        assertEquals("Raichu", raichu.getName());
    }

    /** Evolve test */
    @Test
    public void test_evolve() {
        assertEquals(null, raichu.evolve());
    }

    /** Type test */
    @Test
    public void test_type() {
        assertEquals("electric", raichu.getType());
    }

    /** Evolvution test */
    @Test
    public void test_evolution() {
        assertEquals(false, raichu.isHasEvolution());
    }

    /** Main Power test */
    @Test
    public void test_getMain() {
        assertEquals("Impacthunder", raichu.getMainAttack());
    }

    /** Second Power test */
    @Test
    public void test_getSecondary() {
        assertEquals("Slam", raichu.getSecondAttack());
    }

    /** Main Damage test */
    @Test
    public void test_getMainDamage() {
        assertEquals(25, raichu.getMainAttackDamage());
    }

    /** Second Damage test */
    @Test
    public void test_getSecondDamage() {
        assertEquals(15, raichu.getSecondAttackDamage());
    }

    /** HP test */
    @Test
    public void test_getPoints() {
        assertEquals(100, raichu.getHitPoints());
    }

}
