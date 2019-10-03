package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class MewTest {
    Mew mew;

    @Before
    public void setUp() {
        mew = new Mew();
    }

    @Test
    public void mainAttack() {
        assertEquals("Attacking opponent with Psychic causing a damage of 80", mew.mainAttack());
    }

    @Test
    public void secondAttack() {
        assertEquals("Attacking opponent with Surf causing a damage of 80", mew.secondAttack());
    }
}