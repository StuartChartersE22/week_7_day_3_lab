package Environment;

import Characters.ClassTypes.ICaster;
import Characters.ClassTypes.IHealer;
import Characters.ClassTypes.IMelee;
import Characters.Instances.Cleric;
import Characters.Instances.Dwarf;
import Characters.Instances.Wizard;
import Characters.Party;
import Items.Instances.Weapons.Axe;
import Items.ItemType.Weapon;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    private Room room;
    private Cleric cleric;
    private Wizard wizard;
    private Dwarf dwarf;
    private Chest chest;
    private Axe axe;
    private ArrayList<Weapon> weapons = new ArrayList<>();
    private Party allysParty = new Party();
    private Party enemysParty = new Party();
    private ArrayList<IMelee> melees = new ArrayList<>();
    private ArrayList<IHealer> healers = new ArrayList<>();
    private ArrayList<ICaster> casters = new ArrayList<>();

    @Before
    public void before(){
        cleric = new Cleric("John", 10,300);
        dwarf = new Dwarf("Dopey", 10, 20);
        wizard = new Wizard("Merlin", 20, 30, 40);
        melees.add(dwarf);
        healers.add(cleric);
        casters.add(wizard);
        allysParty.setCasters(casters);
        allysParty.setHealers(healers);
        enemysParty.setMelees(melees);

        axe = new Axe("Choppy", 20, 10);
        weapons.add(axe);
        chest = new Chest();
        chest.setWeapons(weapons);

        room = new Room(chest, allysParty, enemysParty);
    }

    @Test
    public void canGetAllysParty(){
        assertEquals(allysParty, room.getAllies());
    }

    @Test
    public void canGetEnemysParty(){
        assertEquals(enemysParty, room.getEnemies());
    }

    @Test
    public void canGetChest(){
        assertEquals(chest, room.getChest());
    }
}
