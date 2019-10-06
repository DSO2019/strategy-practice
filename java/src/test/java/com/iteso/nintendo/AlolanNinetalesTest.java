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
public class AlolanNinetalesTest {
    
    AlolanNinetales alolanNinetales;
    Attack mockedSecondAttack;
    Attack mockedMainAttack;

    @Before
    public void setUp(){
        alolanNinetales = new AlolanNinetales();
        mockedSecondAttack = mock(Attack.class);
        mockedMainAttack = mock(Attack.class);
        alolanNinetales.setSecondAttack(mockedSecondAttack);
        alolanNinetales.setMainAttack(mockedMainAttack);

    }

    @Test
    public void test_evolve(){
        assertEquals(null,alolanNinetales.evolve());

    }

    @Test
    public void test_defend(){
        assertEquals("Defending attack, damage caused is 3 new HP is 74",alolanNinetales.defend(10));
    }

    @Test
    public void test_secondAttack(){
        when(mockedSecondAttack.performAttack()).thenReturn("attack");
        when(mockedSecondAttack.getDamage()).thenReturn(100);
        assertEquals("Attacking opponent with attack causing a damage of 100",alolanNinetales.secondAttack());
    }

    @Test
    public void test_mainAttack(){
        when(mockedMainAttack.performAttack()).thenReturn("attack");
        when(mockedMainAttack.getDamage()).thenReturn(100);
        assertEquals("Attacking opponent with attack causing a damage of 100",alolanNinetales.mainAttack());
    }
}
