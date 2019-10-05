package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PikachuTest {
    Pikachu pikachu;

    @Before
    public void setUp() {
        pikachu = new Pikachu();
    }

    @Test
    public void mainAttack() {
        assertEquals("Pikachu usa Splash! No pasa absolutamente nada...", pikachu.mainAttack());
    }

    @Test
    public void secondAttack() {
        assertEquals("Pikachu usa Harden! No pasa absolutamente nada...", pikachu.secondAttack());
    }
}