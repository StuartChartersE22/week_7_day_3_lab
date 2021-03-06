package Characters.Instances;

import Characters.ClassTypes.IMelee;
import Items.ItemType.Weapon;
import Characters.ICharacter;

import java.util.ArrayList;

public class Dwarf extends Characters.Character implements IMelee {

    private Weapon activeWeapon;
    private int carryingCapacity;
    private ArrayList<Weapon> weapons;


    public Dwarf(String name, int health, int wallet){
        super(name, health, wallet);
        this.activeWeapon = null;
        this.carryingCapacity = 200;
        this.weapons = new ArrayList<>();
    }

    @Override
    public void draw(Weapon weapon) {
        if(activeWeapon != null){
            sheath();
        }
        this.activeWeapon = weapon;
    }

    @Override
    public void sheath() {
        this.activeWeapon = null;

    }

    @Override
    public int getStrength() {
        return this.carryingCapacity;
    }

    @Override
    public void attack(ICharacter character) {
        character.reduceHealth(activeWeapon.getDamage());

    }

    @Override
    public void pickUpWeapon(Weapon weapon) {
        if(totalWeightCarried() + weapon.getWeight() <= this.carryingCapacity){
            this.weapons.add(weapon);
            sheath();
            activeWeapon = weapon;
        }
    }

    @Override
    public Weapon dropActiveWeapon(){
        Weapon droppedWeapon = activeWeapon;
        weapons.remove(activeWeapon);
        activeWeapon = null;
        return droppedWeapon;
    }

    @Override
    public ArrayList<Weapon> getWeapons() {
        return weapons;
    }

    @Override
    public int totalWeightCarried(){
        int totalWeight = 0;
        for(Weapon weapon : weapons){
            totalWeight += weapon.getWeight();
        }
        return totalWeight;
    }

    @Override
    public Weapon getActiveWeapon() {
        return this.activeWeapon;
    }






}
