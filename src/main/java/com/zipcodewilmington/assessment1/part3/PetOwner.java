package com.zipcodewilmington.assessment1.part3;
import java.util.Arrays;
/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {
    private String name;
    private Pet[] petList;
    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public PetOwner(String name, Pet... pets) {
        this.name = name;
        if (pets == null){
            this.petList = new Pet[0];
        }
        else {
            this.petList = new Pet[pets.length];
            for (int i = 0; i < pets.length; i++) {
                this.petList[i] = pets[i];
            }
        }
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        this.petList = Arrays.copyOf(this.petList, this.petList.length+1);
        this.petList[this.petList.length-1] = pet;
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        Pet [] temp = new Pet[this.petList.length];
        for(Pet p : this.petList){
            if (!p.equals(pet)){
                temp[temp.length-1] = p;
            }
        }
        this.petList = temp;
    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        for(Pet p : this.petList){
            if(pet.equals(p)){
                return true;
            }
        }
        return false;
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        Integer lastAge = Integer.MAX_VALUE;
        for (Pet p : this.petList){
            if(p.getAge()<lastAge){
                lastAge = p.getAge();
            }
        }
        return lastAge;
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        Integer lastAge = 0;
        for (Pet p : this.petList){
            if(p.getAge()>lastAge){
                lastAge = p.getAge();
            }
        }
        return lastAge;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        float sum = 0f;
        for(Pet p : this.petList){
            sum += p.getAge();
        }
        return sum/this.petList.length;
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        return this.petList.length;
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        return this.petList;
    }
}
