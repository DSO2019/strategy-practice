package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class ZapdosTest {
    Zapdos zapdos;

    @Before
    public void setUp(){
        zapdos = new Zapdos();
    }

    /** First attack */
    @Test
    public void firstAttack(){
        assertEquals("Attacking opponent with Thunderblot causing a damage of 24", zapdos.mainAttack());
    }

    /** Second attack */
    @Test
    public void secondAttack(){
        assertEquals("Attacking opponent with Ice Beam causing a damage of 18", zapdos.secondAttack());
    }

    /** Defense test */
    @Test
    public void defend(){
        assertEquals("Defending attack, damage caused is 0 new HP is 77", zapdos.defend(0));
    }

    /** Name test */
    @Test
    public void test_name(){
        assertEquals("Zapdos", zapdos.getName());
    }

    /** Evolve test */
    @Test
    public void test_evolve(){
        assertEquals(null, zapdos.evolve());
    }

    /** Type test */
    @Test
    public void test_type(){
        assertEquals("Electric", zapdos.getType());
    }

    /** Evolvution test */
    @Test
    public void test_evolution(){
        assertEquals(false, zapdos.isHasEvolution());
    }

    /** Main Power test */
    @Test
    public void test_getMain(){
        assertEquals("Thunderblot", zapdos.getMainAttack());
    }

    /** Second Power test */
    @Test
    public void test_getSecondary(){
        assertEquals("Ice Beam", zapdos.getSecondAttack());
    }

    /** Main Damage test */
    @Test
    public void test_getMainDamage(){
        assertEquals(24, zapdos.getMainAttackDamage());
    }

    /** Second Damage test */
    @Test
    public void test_getSecondDamage(){
        assertEquals(18, zapdos.getSecondAttackDamage());
    }

    /** HP test */
    @Test
    public void test_getPoints(){
        assertEquals(77, zapdos.getHitPoints());
    }

}