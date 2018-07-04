package Items;

import Items.Instances.Fire;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class FireTest {

    private Fire fire;
    private HashMap<String, Integer> properties = new HashMap<>();

    @Before
    public void before(){
        properties.put("Damage", 7);
        properties.put("Magic Used", 5);
        fire = new Fire("Fire", 7, 5);
    }

    @Test
    public void canGetName(){
        assertEquals("Fire", fire.getName());
    }

    @Test
    public void canGetDamage(){
        assertEquals(7, fire.getDamage());
    }

    @Test
    public void canGetMagicUsed(){
        assertEquals(5,  fire.getMagicUsed());
    }

    @Test
    public void canInspect(){
        assertEquals(properties,  fire.inspect());
    }


}
