package Characters;

import Characters.Instances.Cleric;
import Items.Instances.Herb;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClericTest {

    private Cleric cleric;
    private Cleric cleric2;
    private Herb herb;

    @Before
    public void setUp() {
        cleric = new Cleric("John", 10, false, 300);
        cleric2 = new Cleric("Andrew", 10, false, 300);
        herb = new Herb("Herb", 8, 6);
    }

    @Test
    public void heal() {
        cleric.pickUpHealingItem(herb);
        cleric.heal(herb, cleric2);
        assertEquals(18, cleric2.getHealth());
        assertEquals(0, cleric.getItems().size());
    }

    @Test
    public void pickUpHealingItem() {
        cleric.pickUpHealingItem(herb);
        assertEquals(1, cleric.getItems().size());
    }

    @Test
    public void getHealth() {
        assertEquals(10, cleric.getHealth());
    }

    @Test
    public void reduceHealth() {
        cleric.reduceHealth(5);
        assertEquals(5, cleric.getHealth());
    }

    @Test
    public void increaseHealth() {
        cleric.increaseHealth(5);
        assertEquals(15, cleric.getHealth());
    }

    @Test
    public void isEnemy() {
        assertFalse(cleric.isEnemy());
    }

    @Test
    public void getWallet() {
        assertEquals(300, cleric.getWallet());
    }

    @Test
    public void pay() {
        cleric.pay(10);
        assertEquals(290, cleric.getWallet());
    }

    @Test
    public void receiveMoney() {
        cleric.receiveMoney(10);
        assertEquals(310, cleric.getWallet());
    }

    @Test
    public void getName() {
        assertEquals("John", cleric.getName());
    }
}