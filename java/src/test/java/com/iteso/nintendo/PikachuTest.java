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

    /** Pikachu main attack */
    @Test
    public void firstAttack(){
        assertEquals("Attacking opponent with Metalclaw causing a damage of 12", pikachu.mainAttack());
    }

    /** Pikachu secundary attack */
    @Test
    public void secondAttack(){
        assertEquals("Attacking opponent with Tunderpunch causing a damage of 15", pikachu.secondAttack());
    }

    /** Pikachu Main Power test */
    @Test
    public void test_getMain(){
        assertEquals("Metalclaw", pikachu.getMainAttack());
    }

    /** Pikachu Second Power test */
    @Test
    public void test_getSecondary(){
        assertEquals("Tunderpunch", pikachu.getMainAttack());
    }

    /** Pikachu Main Damage test */
    @Test
    public void test_getMainDamage(){
        assertEquals(12, pikachu.getMainAttackDamage());
    }

    /** Pikachu Second Damage test */
    @Test
    public void test_getSecondDamage(){
        assertEquals(15, pikachu.getSecondAttackDamage());
    }


}