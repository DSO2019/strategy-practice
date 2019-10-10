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
    public void setUp(){
        pikachu = new Pikachu();
    }

    /** First attack */
    @Test
    public void firstAttack(){
        assertEquals("Attacking opponent with Thunderblot causing a damage of 24", pikachu.mainAttack());
    }

    /** Second attack */
    @Test
    public void secondAttack(){
        assertEquals("Attacking opponent with earthquake causing a damage of 25", pikachu.secondAttack());
    }

    /** Defense test */
    @Test
    public void defend(){
        assertEquals("Defending attack, damage caused is 0 new HP is 100", pikachu.defend(0));
    }

    /** Name test */
    @Test
    public void test_name(){
        assertEquals("Pikachu", pikachu.getName());
    }

    /** Evolve test */
    @Test
    public void test_evolve(){
        assertEquals(null, pikachu.evolve());
    }

    /** Type test */
    @Test
    public void test_type(){
        assertEquals("electric", pikachu.getType());
    }

    /** Evolvution test */
    @Test
    public void test_evolution(){
        assertEquals(false, pikachu.isHasEvolution());
    }

    /** Main Power test */
    @Test
    public void test_getMain(){
        assertEquals("Thunderblot", pikachu.getMainAttack());
    }

    /** Second Power test */
    @Test
    public void test_getSecondary(){
        assertEquals("Earthquake", pikachu.getSecondAttack());
    }

    /** Main Damage test */
    @Test
    public void test_getMainDamage(){
        assertEquals(24, pikachu.getMainAttackDamage());
    }

    /** Second Damage test */
    @Test
    public void test_getSecondDamage(){
        assertEquals(25, pikachu.getSecondAttackDamage());
    }

    /** HP test */
    @Test
    public void test_getPoints(){
        assertEquals(100, pikachu.getHitPoints());
    }

}