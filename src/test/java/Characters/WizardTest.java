package Characters;

import Characters.Instances.Wizard;
import Items.Instances.Fire;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WizardTest {

    private Wizard wizard;
    private Wizard wizard2;
    private Fire fire;

    @Before
    public void setUp() {
        wizard = new Wizard("Merlin", 20, 30, false, 40);
        wizard2 = new Wizard("Merlin", 20, 30, true, 40);
        fire = new Fire("Fire", 7, 5);
    }

//    @Test
//    public void cast() {
//    }

    @Test
    public void remainingMagic() {
        assertEquals(30, wizard.remainingMagic());
    }

    @Test
    public void replenishMagic() {
        wizard.replenishMagic(10);
        assertEquals(40, wizard.remainingMagic());
    }

    @Test
    public void getHealth() {
        assertEquals(20, wizard.getHealth());
    }

    @Test
    public void reduceHealth() {
        wizard.reduceHealth(5);
        assertEquals(15, wizard.getHealth());
    }

    @Test
    public void increaseHealth() {
        wizard.increaseHealth(5);
        assertEquals(25, wizard.getHealth());
    }

    @Test
    public void isEnemy() {
        assertFalse(wizard.isEnemy());
    }

    @Test
    public void getWallet() {
        assertEquals(40, wizard.getWallet());
    }

    @Test
    public void pay() {
        wizard.pay(10);
        assertEquals(30, wizard.getWallet());
    }

    @Test
    public void receiveMoney() {
        wizard.receiveMoney(10);
        assertEquals(50, wizard.getWallet());
    }

    @Test
    public void getName() {
        assertEquals("Merlin", wizard.getName());
    }
}