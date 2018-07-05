package Items.SpellTests;

import Items.Instances.Spells.Poison;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class PoisonTest {

    private Poison poison;
    private HashMap<String, Integer> properties = new HashMap<>();

    @Before
    public void before(){
        properties.put("Damage", 5);
        properties.put("Magic Used", 5);
        poison = new Poison("Poison", 5, 5);
    }

    @Test
    public void canGetName(){
        assertEquals("Poison", poison.getName());
    }

    @Test
    public void canGetDamage(){
        assertEquals(5, poison.getDamage());
    }

    @Test
    public void canGetMagicUsed(){
        assertEquals(5,  poison.getMagicUsed());
    }

    @Test
    public void canInspect(){
        assertEquals(properties,  poison.inspect());
    }


}
