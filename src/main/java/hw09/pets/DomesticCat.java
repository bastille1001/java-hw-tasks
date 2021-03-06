package hw09.pets;

import hw09.Foulible;

import java.util.Set;

public class DomesticCat extends Pet implements Foulible {

    public DomesticCat() {
        super.setSpecies(Species.DOMESTICCAT);
    }

    public DomesticCat(String nickname) {
        super(nickname);
        super.setSpecies(Species.DOMESTICCAT);
    }

    public DomesticCat(String nickname, int age, int trickLevel, Set<String> habits) {
        super(nickname, age, trickLevel, habits);
        super.setSpecies(Species.DOMESTICCAT);
    }

    void respond() {
        System.out.printf("Hello, owner. I am - %s. I miss you!\n", getNickname());
    }


    @Override
    public void foul() {
        System.out.println("I need to cover it up\n");
    }
}
