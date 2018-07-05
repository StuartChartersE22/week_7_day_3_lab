package Characters.ClassTypes;
import Characters.ICharacter;
import Items.ItemType.Weapon;

import java.util.ArrayList;

public interface IMelee extends ICharacter {

    void draw(Weapon weapon);
    void sheath();
    int getStrength();
    void attack(ICharacter character);
    void pickUpWeapon(Weapon weapon);
    ArrayList<Weapon> getWeapons();
    Weapon getActiveWeapon();
    Weapon dropActiveWeapon();
    int totalWeightCarried();

}
