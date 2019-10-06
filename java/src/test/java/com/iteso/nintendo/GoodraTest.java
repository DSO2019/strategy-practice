package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import org.mockito.Mockito.*;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.eq;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class GoodraTest {
    
    Goodra goodra;
    Attack mockedSecondAttack;
    Attack mockedMainAttack;

    @Before
    public void setUp(){
        goodra = new Goodra();
        mockedSecondAttack = mock(Attack.class);
        mockedMainAttack = mock(Attack.class);
        goodra.setSecondAttack(mockedSecondAttack);
        goodra.setMainAttack(mockedMainAttack);

    }

    @Test
    public void test_evolve(){
        assertEquals(null,goodra.evolve());

    }

    @Test
    public void test_defend(){
        assertEquals("Defending attack, damage caused is 4 new HP is 96",goodra.defend(10));
    }

    @Test
    public void test_secondAttack(){
        when(mockedSecondAttack.performAttack()).thenReturn("attack");
        when(mockedSecondAttack.getDamage()).thenReturn(100);
        assertEquals("Attacking opponent with attack causing a damage of 100",goodra.secondAttack());
    }

    @Test
    public void test_mainAttack(){
        when(mockedMainAttack.performAttack()).thenReturn("attack");
        when(mockedMainAttack.getDamage()).thenReturn(100);
        assertEquals("Attacking opponent with attack causing a damage of 100",goodra.mainAttack());
    }
}