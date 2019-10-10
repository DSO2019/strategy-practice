package com.iteso.nintendo;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by rvillalobos on 2/24/18.
 */
public class BulbasaurTest {
        Bulbasaur bulbasaur;
        @Before
        public void setUp() {
            bulbasaur = new Bulbasaur();
        }

        @Test
        public void mainAttack() {
            assertEquals("Bulbasaur dale unos latigasos,castigalo", bulbasaur.mainAttack());
        }

        @Test
        public void secondAttack() {
            assertEquals("Bulbasaur contraataca,doble poder...", bulbasaur.secondAttack());
        }
    }

