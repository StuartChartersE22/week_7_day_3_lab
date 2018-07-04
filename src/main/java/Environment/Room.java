package Environment;

import Characters.ClassTypes.ICaster;
import Characters.ClassTypes.IHealer;
import Characters.ClassTypes.IMelee;

import java.util.ArrayList;

public class Room {

    private ArrayList<IMelee> melees;
    private ArrayList<ICaster> casters;
    private ArrayList<IHealer> healers;
    private boolean playersTurn;
    private Chest chest;

    public Room(Chest chest){
        this.melees = new ArrayList<>();
        this.casters = new ArrayList<>();
        this.healers = new ArrayList<>();
        playersTurn = true;
        this.chest = chest;
    }
}
