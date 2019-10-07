package com.iteso.nintendo.behaviors.attack;

import com.iteso.nintendo.behaviors.attack.BigFireAttack;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BigFireAttackTest {

    private BigFireAttack bigFire;

    @Before
    public void setUp() {
        bigFire =  new BigFireAttack();
    }

    @Test
    public void attackTest() {
        assertEquals("Attacking opponent with Big Fire causing a damage of 13",
                     bigFire.attack());
    }

        @Test
    public void getAttackNameTest() {
        assertEquals("Big Fire", bigFire.getAttackName());
    }

        @Test
    public void getAttackDamageTest() {
        assertEquals(13, bigFire.getAttackDamage());
    }
}
