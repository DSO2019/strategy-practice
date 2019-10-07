package com.iteso.nintendo;

import com.iteso.nintendo.pokemon.Pikachu;
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
    /**
     * Evolve
     */
    @Test
    public void test_evolve(){
        assertEquals(null, pikachu.evolve());
    }

    /**
     * Defend
     */
    @Test
    public void test_defend(){
        assertEquals("Defending attack, damage caused is 4 new HP is 96"
                , pikachu.defend(10));
    }

    /**
     * secondAttack
     */
    @Test
    public void test_secondAttack(){
        assertEquals("Attacking opponent with Tackle causing a damage of 6"
                , pikachu.secondAttack());
    }

    /**
     * mainAttack
     */
    @Test
    public void test_mainAttack(){
        assertEquals("Attacking opponent with Thunderbolt causing a damage of 6"
                , pikachu.mainAttack());
    }

    /**
     * Name
     */
    @Test
    public void test_name(){
        assertEquals("Pikachu"
                , pikachu.getName());
    }

    /**
     * Type
     */
    @Test
    public void test_type(){
        assertEquals("electric"
                , pikachu.getType());
    }

    /**
     * HasEcolution
     */
    @Test
    public void test_hasEvolution(){
        assertEquals(true
                , pikachu.isHasEvolution());
    }

    /**
     * Name MainAttack
     */
    @Test
    public void test_name_mainAttack(){
        assertEquals("Thunderbolt"
                , pikachu.getMainAttack());
    }

    /**
     * Name SecondAttack
     */
    @Test
    public void test_name_secondAttack(){
        assertEquals("Tackle"
                , pikachu.getSecondAttack());
    }

    /**
     * Hit Points
     */
    @Test
    public void test_hitPoitns(){
        assertEquals(100
                , pikachu.getHitPoints());
    }
}
