package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BaculaoTest {
    Baculao baculao;

    @Before
    public void setUp() {
        baculao = new Baculao();
    }

    @Test
    public void mainAttack() {
        assertEquals("Baculao usa Ember!", baculao.mainAttack());
    }

    @Test
    public void secondAttack() {
        assertEquals("Baculao usa Harden! No pasa absolutamente nada...", baculao.secondAttack());
    }
}