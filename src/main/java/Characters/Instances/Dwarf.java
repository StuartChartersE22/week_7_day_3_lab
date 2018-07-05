package Characters.Instances;

import Characters.ClassTypes.IMelee;
import Items.ItemType.Weapon;
import Characters.ICharacter;

import java.util.ArrayList;

public class Dwarf extends Characters.Character implements IMelee {

    private Weapon activeWeapon;

    private int carryingCapacity;

    private ArrayList<Weapon> weapons;


    public Dwarf(String name, int health, boolean enemy, int wallet){
        super(name, health, enemy, wallet);
        this.activeWeapon = null;
        this.carryingCapacity = 200;
        this.weapons = new ArrayList<>();
    }

    @Override
    public void draw(Weapon weapon) {
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
        this.weapons.add(weapon);

    }

    @Override
    public ArrayList<Weapon> getWeapons() {
        return weapons;
    }

    @Override
    public Weapon getActiveWeapon() {
        return this.activeWeapon;
    }






}
