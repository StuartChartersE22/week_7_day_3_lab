package Items;

import Items.Instances.Spells.Thunder;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class ThunderTest {

    private Thunder thunder;
    private HashMap<String, Integer> properties = new HashMap<>();

    @Before
    public void before(){
        properties.put("Damage", 7);
        properties.put("Magic Used", 5);
        thunder= new Thunder("Thunder", 7, 5);
    }

    @Test
    public void canGetName(){
        assertEquals("Thunder", thunder.getName());
    }

    @Test
    public void canGetDamage(){
        assertEquals(7, thunder.getDamage());
    }

    @Test
    public void canGetMagicUsed(){
        assertEquals(5,  thunder.getMagicUsed());
    }

    @Test
    public void canInspect(){
        assertEquals(properties,  thunder.inspect());
    }


}
