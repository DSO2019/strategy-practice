package com.iteso.nintendo.behaviors.attack;

import com.iteso.nintendo.behaviors.attack.ImpactTruenoAttack;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ImpactTruenoAttackTest {

    private ImpactTruenoAttack impactTrueno;

    @Before
    public void setUp() {
        impactTrueno =  new ImpactTruenoAttack();
    }

    @Test
    public void attackTest() {
        assertEquals("Attacking opponent with Impactrueno causing a damage of 13",
                     impactTrueno.attack());
    }

        @Test
    public void getAttackNameTest() {
        assertEquals("Impactrueno", impactTrueno.getAttackName());
    }

        @Test
    public void getAttackDamageTest() {
        assertEquals(13, impactTrueno.getAttackDamage());
    }
}