package com.iteso.nintendo;

import com.iteso.nintendo.Pikachu;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by AlfredoRodriguez on 2/24/18.
 */
public class PikachuTest {
    Pikachu pikachu;

    @Before
    public void setUp() {
        pikachu = new Pikachu();
    }

    /** First attack */
    @Test
    public void firstAttack() {
        assertEquals("Attacking opponent with Impacthunder causing a damage of 25", pikachu.mainAttack());
    }

    /** Second attack */
    @Test
    public void secondAttack() {
        assertEquals("Attacking opponent with Slam causing a damage of 15", pikachu.secondAttack());
    }

    /** Defense test */
    @Test
    public void defend() {
        assertEquals("Defending attack, damage caused is 0 new HP is 90", pikachu.defend(0));
    }

    /** Name test */
    @Test
    public void test_name() {
        assertEquals("Pikachu", pikachu.getName());
    }

    /** Evolve test */
    @Test
    public void test_evolve() {
        assertEquals(null, pikachu.evolve());
    }

    /** Type test */
    @Test
    public void test_type() {
        assertEquals("electric", pikachu.getType());
    }

    /** Evolvution test */
    @Test
    public void test_evolution() {
        assertEquals(true, pikachu.isHasEvolution());
    }

    /** Main Power test */
    @Test
    public void test_getMain() {
        assertEquals("Impacthunder", pikachu.getMainAttack());
    }

    /** Second Power test */
    @Test
    public void test_getSecondary() {
        assertEquals("Slam", pikachu.getSecondAttack());
    }

    /** Main Damage test */
    @Test
    public void test_getMainDamage() {
        assertEquals(25, pikachu.getMainAttackDamage());
    }

    /** Second Damage test */
    @Test
    public void test_getSecondDamage() {
        assertEquals(15, pikachu.getSecondAttackDamage());
    }

    /** HP test */
    @Test
    public void test_getPoints() {
        assertEquals(90, pikachu.getHitPoints());
    }

}
