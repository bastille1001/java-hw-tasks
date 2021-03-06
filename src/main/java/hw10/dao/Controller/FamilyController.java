package hw10.dao.Controller;

import hw10.dao.Services.FamilyService;
import hw10.family.Family;
import hw10.family.Human;
import hw10.pets.Pet;

import java.text.ParseException;
import java.util.ArrayList;

public class FamilyController {

    private FamilyService familyService = new FamilyService();

    public ArrayList<Family> getAllFamilies(){ return (ArrayList<Family>) familyService.getAllFamilies(); }

    public void displayAllFamilies(){ familyService.displayAllFamilies(); }

    public ArrayList<Family> getFamiliesBiggerThan(int familySize){ return familyService.getFamiliesBiggerThan(familySize); }

    public ArrayList<Family> getFamiliesLessThan(int familySize){ return familyService.getFamiliesLessThan(familySize); }

    public int countFamiliesWithMemberNumber(int familySize){
        return familyService.countFamiliesWithMemberNumber(familySize);
    }

    public void createNewFamily(Human father, Human mother) {
        familyService.createNewFamily(father, mother);
    }

    public void deleteFamilyByIndex(int index) {
        familyService.deleteFamilyByIndex(index);
    }

    public Family bornChild(Family family, String manName, String womanName) throws ParseException {
        return familyService.bornChild(family, manName, womanName);
    }

    public Family adoptChild(Family family, Human child) {
        return familyService.adoptChild(family, child);
    }

    public void deleteAllChildrenOlderThen(int age) {
        familyService.deleteAllChildrenOlderThen(age);
    }

    public int count() {
        return familyService.count();
    }

    public Family getFamilyById(int index) {
        return familyService.getFamilyById(index);
    }

    public ArrayList<Pet> getPets(int index) {
        return familyService.getPets(index);
    }

    public void addFamily(Family family) {
        familyService.addFamily(family);
    }
}
