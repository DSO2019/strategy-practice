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
        assertEquals("Pikachu dale unos latigasos,castigalo", pikachu.mainAttack());
    }

    @Test
    public void secondAttack() {
        assertEquals("Pikachu confundelo >.<", pikachu.secondAttack());
    }
}


