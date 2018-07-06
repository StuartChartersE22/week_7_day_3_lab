package Environment;

import Characters.Party;

public class Room {

    private Party allysParty;
    private Party enemysParty;
    private boolean playersTurn;
    private Chest chest;

    public Room(Chest chest, Party allysParty, Party enemysParty){
        this.allysParty = allysParty;
        this.enemysParty = enemysParty;
        playersTurn = true;
        this.chest = chest;
    }


    public Party getAllies() {
        return allysParty;
    }
}
