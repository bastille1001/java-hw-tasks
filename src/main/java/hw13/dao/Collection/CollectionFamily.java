package hw13.dao.Collection;

import hw13.dao.İnterfaces.FamilyDAO;
import hw13.family.Family;

import java.util.ArrayList;
import java.util.List;

public class CollectionFamily implements FamilyDAO<Family> {

    private List<Family> familyList = new ArrayList<>();

    @Override
    public List<Family> getAllFamilies() { return familyList; }

    @Override
    public Family getFamilyByIndex(int index) {
        try {
            return familyList.get(index);
        }catch (IndexOutOfBoundsException ex){
            System.out.println("Wrong index");
            return null;
        }
    }

    @Override
    public boolean deleteFamilyByIndex(int index) {
        try {
            familyList.remove(index);
            return true;
        }catch (IndexOutOfBoundsException ex){
            System.out.println("Wrong idnex");
            return false;
        }
    }

    @Override
    public boolean deleteFamily(Family family) { return familyList.remove(family); }

    @Override
    public Family save(Family family) {
        if (familyList.contains(family)){
            familyList.set(familyList.indexOf(family),family);
        }else {
            familyList.add(family);
        }
        return family;
    }

    @Override
    public void loadData(List<Family> families) {
        familyList.addAll(families);
    }
}
