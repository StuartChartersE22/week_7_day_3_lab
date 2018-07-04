package Characters;

import Characters.Instances.Dwarf;
import Items.Instances.Axe;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DwarfTest {

    private Dwarf dwarf;
    private Dwarf dwarf2;
    private Axe axe;

    @Before
    public void setUp() {
        dwarf = new Dwarf("Dopey", 10, false, 20);
        dwarf2 = new Dwarf("Happy", 10, true, 20);
        axe = new Axe("Choppy", 20, 10);
    }

    @Test
    public void canPickUpWeapon() {
        dwarf.pickUpWeapon(axe);
        assertEquals(1, dwarf.getWeapons().size());
    }

    @Test
    public void draw() {
        dwarf.pickUpWeapon(axe);
        dwarf.draw(axe);
        assertEquals(axe, dwarf.getActiveWeapon());
    }

        @Test
    public void sheath() {
        dwarf.pickUpWeapon(axe);
        dwarf.draw(axe);
        dwarf.sheath();
        assertNull(dwarf.getActiveWeapon());
    }

    @Test
    public void getStrength() {
        assertEquals(200, dwarf.getStrength());
    }

    @Test
    public void attack() {
        dwarf.pickUpWeapon(axe);
        dwarf.draw(axe);
        dwarf.attack(dwarf2);
        assertEquals(0, dwarf2.getHealth());
    }

    @Test
    public void getHealth() {
        assertEquals(10, dwarf.getHealth());
    }

    @Test
    public void reduceHealth() {
        dwarf.reduceHealth(5);
        assertEquals(5, dwarf.getHealth());

    }

    @Test
    public void increaseHealth() {
        dwarf.increaseHealth(5);
        assertEquals(15, dwarf.getHealth());
    }

    @Test
    public void isEnemy() {
        assertFalse(dwarf.isEnemy());
    }

    @Test
    public void getWallet() {
        assertEquals(20, dwarf.getWallet());
    }

    @Test
    public void pay() {
        dwarf.pay(5);
        assertEquals(15, dwarf.getWallet());
    }

    @Test
    public void receiveMoney() {
        dwarf.receiveMoney(5);
        assertEquals(25, dwarf.getWallet());
    }

    @Test
    public void getName() {
        assertEquals("Dopey", dwarf.getName());
    }
}