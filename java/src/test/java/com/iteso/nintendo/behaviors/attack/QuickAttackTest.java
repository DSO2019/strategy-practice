package com.iteso.nintendo.behaviors.attack;

import com.iteso.nintendo.behaviors.attack.QuickAttack;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class QuickAttackTest {

    private QuickAttack quickAttack;

    @Before
    public void setUp() {
        quickAttack =  new QuickAttack();
    }

    @Test
    public void attackTest() {
        assertEquals("Attacking opponent with Quick Attack causing a damage of 6",
                     quickAttack.attack());
    }

        @Test
    public void getAttackNameTest() {
        assertEquals("Quick Attack", quickAttack.getAttackName());
    }

        @Test
    public void getAttackDamageTest() {
        assertEquals(6, quickAttack.getAttackDamage());
    }
}