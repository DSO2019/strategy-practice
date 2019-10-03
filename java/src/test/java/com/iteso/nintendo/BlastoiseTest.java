package com.iteso.nintendo;
import com.iteso.nintendo.Blastoise;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by AlfredoRodriguez on 2/24/18.
 */
public class BlastoiseTest {
    Blastoise blastoise;

    @Before
    public void setUp(){
        blastoise = new Blastoise();
    }

    /** First attack */
    @Test
    public void firstAttack(){
        assertEquals("Attacking opponent with Shower causing a damage of 20", blastoise.mainAttack());
    }

    /** Second attack */
    @Test
    public void secondAttack(){
        assertEquals("Attacking opponent with Slam causing a damage of 15", blastoise.secondAttack());
    }

    /** Defense test */
    @Test
    public void defend(){
        assertEquals("Defending attack, damage caused is 0 new HP is 100",blastoise.defend(0));
    }

}
