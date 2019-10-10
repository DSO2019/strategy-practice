package com.iteso.nintendo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class CharmeleonTest {
    Charmeleon charmeleon;
    @Before
    public void setUp() {
        charmeleon = new Charmeleon();
    }

    @Test
    public void mainAttack() {
        Assert.assertEquals("Charmeleon usa giga Impact y entierralo", charmeleon.mainAttack());
    }

    @Test
    public void secondAttack() {
        Assert.assertEquals("Charmeleon sopla! y marealo con tu horrible aliento", charmeleon.secondAttack());
    }
}
