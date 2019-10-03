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
    public void mainAttack() {
        assertEquals("Attacking opponent with Thunderbolt causing a damage of 90", pikachu.mainAttack());
    }

    @Test
    public void secondAttack() {
        assertEquals("Attacking opponent with Surf causing a damage of 80", pikachu.secondAttack());
    }
}