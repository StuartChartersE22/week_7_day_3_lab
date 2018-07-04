package Environment;

import Characters.Instances.Cleric;
import Characters.Instances.Dwarf;
import Characters.Instances.Wizard;
import org.junit.Before;
import org.junit.Test;

public class RoomTest {

    private Room room;
    private Cleric cleric;
    private Wizard wizard;
    private Dwarf dwarf;
    private Chest chest;


    @Before
    public void before(){
        cleric = new Cleric("John", 10, false, 300);
        dwarf = new Dwarf("Dopey", 10, true, 20);
        wizard = new Wizard("Merlin", 20, 30, false, 40);
        chest = new Chest();
        room = new Room(chest);
    }

}
