package Items;

import Items.Instances.HealingItems.Potion;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class PotionTest {

    private Potion potion;
    private HashMap<String, Integer> properties = new HashMap<>();

    @Before
    public void before(){
        potion = new Potion("Potion", 8, 6);
        properties.put("Healing power" , 8);
        properties.put("Cost" , 6);
    }

    @Test
    public void canGetName(){
        assertEquals("Potion", potion.getName());
    }

    @Test
    public void canGetHealingPower(){
        assertEquals(8, potion.getHealingPower());
    }

    @Test
    public void canGetCost(){
        assertEquals(6, potion.getCost());
    }

    @Test
    public void canInspect() {
        assertEquals(properties, potion.inspect());
    }

}
