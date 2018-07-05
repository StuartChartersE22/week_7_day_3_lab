package Characters;

import Characters.ClassTypes.ICaster;
import Characters.ClassTypes.IHealer;
import Characters.ClassTypes.IMelee;
import Characters.Instances.Cleric;
import Characters.Instances.Dwarf;
import Characters.Instances.Wizard;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class PartyTest {

    private Cleric cleric;
    private Wizard wizard;
    private Dwarf dwarf;
    private Party party = new Party();
    private ArrayList<IMelee> melees = new ArrayList<>();
    private ArrayList<IHealer> healers = new ArrayList<>();
    private ArrayList<ICaster> casters = new ArrayList<>();

    @Before
    public void setUp() {
        cleric = new Cleric("John", 10,300);
        dwarf = new Dwarf("Dopey", 10, 20);
        wizard = new Wizard("Merlin", 20, 30, 40);
        melees.add(dwarf);
        healers.add(cleric);
        casters.add(wizard);
    }

    @Test
    public void setCasters() {
        party.setCasters(casters);
        assertEquals(1, party.getCharacterList().size());
    }

    @Test
    public void setMelees() {
        party.setMelees(melees);
        assertEquals(1, party.getCharacterList().size());
    }

    @Test
    public void setHealers() {
        party.setHealers(healers);
        assertEquals(1, party.getCharacterList().size());
    }

    @Test
    public void getCharacterList() {
        party.setCasters(casters);
        party.setMelees(melees);
        party.setHealers(healers);
        assertEquals(3, party.getCharacterList().size());

    }
}