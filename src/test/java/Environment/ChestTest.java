package Environment;

import Items.Instances.HealingItems.Herb;
import Items.Instances.MoneyBag;
import Items.Instances.Spells.Fire;
import Items.Instances.Weapons.Axe;
import Items.ItemType.HealingItem;
import Items.ItemType.Spell;
import Items.ItemType.Weapon;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class ChestTest {

    private Chest chest;
    private Axe axe;
    private Fire fire;
    private Herb herb;
    private MoneyBag moneyBag;
    private ArrayList<Weapon> weapons = new ArrayList<>();
    private ArrayList<HealingItem> healingItems = new ArrayList<>();
    private ArrayList<Spell> spells = new ArrayList<>();
    private HashMap<String, Integer> axeProperties = new HashMap<>();


    @Before
    public void setUp() {
        axe = new Axe("Choppy", 20, 10);
        fire = new Fire("Fire", 7, 5);
        herb = new Herb("Herb", 8, 6);
        moneyBag = new MoneyBag(300);
        weapons.add(axe);
        spells.add(fire);
        healingItems.add(herb);
        chest = new Chest();
        axeProperties.put("Weight" , 20);
        axeProperties.put("Damage" , 10);
        axeProperties.put("Number of hands used" , 2);
    }

    @Test
    public void setHealingItems() {
        chest.setHealingItems(healingItems);
        assertEquals(1, chest.showContents().size());
    }

    @Test
    public void removeHealingItems() {
        chest.setHealingItems(healingItems);
        assertEquals(1, chest.removeHealingItems().size());
        assertEquals(0, chest.showContents().size());
    }

    @Test
    public void setSpells() {
        chest.setSpells(spells);
        assertEquals(1, chest.showContents().size());
    }

    @Test
    public void removeSpells() {
        chest.setSpells(spells);
        assertEquals(1, chest.removeSpells().size());
        assertEquals(0, chest.showContents().size());
    }

    @Test
    public void setWeapons() {
        chest.setWeapons(weapons);
        assertEquals(1, chest.showContents().size());
    }

    @Test
    public void removeWeapons() {
        chest.setWeapons(weapons);
        assertEquals(1, chest.removeWeapons().size());
        assertEquals(0, chest.showContents().size());
    }

    @Test
    public void showContents() {
        chest.setWeapons(weapons);
        chest.setSpells(spells);
        chest.setHealingItems(healingItems);
        assertEquals(3, chest.showContents().size());
    }

    @Test
    public void canInspectItem(){
        chest.setWeapons(weapons);
        assertEquals(axeProperties, chest.inspectItem(axe));
    }

    @Test
    public void canRemoveSpecificItem(){
        chest.setWeapons(weapons);
        Axe removedItem = chest.removeItem(axe);
        assertEquals(axe, removedItem);
        assertEquals(0, chest.showContents().size());
    }
}
