package com.iteso.nintendo;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class VenusaurTest {
    Venusaur venusaur;
    @Before
    public void setUp() {
        venusaur = new Venusaur();
    }

    @Test
    public void mainAttack() {
        assertEquals("Venusaur dale unos latigasos,castigalo", venusaur.mainAttack());
    }

    @Test
    public void secondAttack() {
        assertEquals("Venusaur confundelo >.<", venusaur.secondAttack());
    }
}
