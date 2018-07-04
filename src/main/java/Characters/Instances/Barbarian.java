package Characters.Instances;

import Items.ITreasure;

import java.util.ArrayList;

public class Barbarian {

    private int health;
    private ArrayList<ITreasure> inventory;
    double wallet;


    public Barbarian(int health, ArrayList inventory, double wallet){
        this.health = health;
        this.inventory = inventory;
        this.wallet = wallet;
    }
}


