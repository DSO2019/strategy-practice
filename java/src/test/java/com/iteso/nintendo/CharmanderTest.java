package com.iteso.nintendo;
import com.iteso.nintendo.Charmander;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by AlfredoRodriguez on 2/24/18.
 */
public class CharmanderTest {
    Charmander charmander;

    @Before
    public void setUp(){
        charmander = new Charmander();
    }

    /** First attack */
    @Test
    public void firstAttack(){
        assertEquals("Attacking opponent with Flamethrower causing a damage of 25", charmander.mainAttack());
    }

    /** Second attack */
    @Test
    public void secondAttack(){
        assertEquals("Attacking opponent with FireSpin causing a damage of 7", charmander.secondAttack());
    }

    /** Defense test */
    @Test
    public void defend(){
        assertEquals("Defending attack, damage caused is 0 new HP is 77",charmander.defend(0));
    }

}
