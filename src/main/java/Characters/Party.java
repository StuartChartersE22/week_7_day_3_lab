package Characters;

import Characters.ClassTypes.ICaster;
import Characters.ClassTypes.IHealer;
import Characters.ClassTypes.IMelee;

import java.util.ArrayList;

public class Party {

    private ArrayList<IMelee> melees;
    private ArrayList<ICaster> casters;
    private ArrayList<IHealer> healers;

    public Party(){
        melees = new ArrayList<>();
        casters = new ArrayList<>();
        healers = new ArrayList<>();
    }

    public void setCasters(ArrayList<ICaster> casters) {
        this.casters = casters;
    }

    public void setMelees(ArrayList<IMelee> melees) {
        this.melees = melees;
    }

    public void setHealers(ArrayList<IHealer> healers) {
        this.healers = healers;
    }

    private <I extends ICharacter> void removeDeadCharacters(ArrayList<I> characters){
        for(I character : characters){
            if(character.getHealth() == 0){
                characters.remove(character);
            }
        }
    }

    public void removeAllDeadCharacters(){
        removeDeadCharacters(melees);
        removeDeadCharacters(casters);
        removeDeadCharacters(healers);
    }

    public ArrayList<ICharacter> getCharacterList(){
        ArrayList<ICharacter> characters = new ArrayList<>();
        characters.addAll(melees);
        characters.addAll(casters);
        characters.addAll(healers);
        return characters;
    }
}
