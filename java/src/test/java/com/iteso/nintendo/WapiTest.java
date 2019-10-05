package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WapiTest {
    Wapi wapi;

    @Before
    public void setUp() {
        wapi = new Wapi();
    }

    @Test
    public void mainAttack() {
        assertEquals("Wapi usa autodestrucción! El pokemon ha muerto...", wapi.mainAttack());
    }

    @Test
    public void secondAttack() {
        assertEquals("Wapi usa llanto! No pasa absolutamente nada bueno...", wapi.secondAttack());
    }
}