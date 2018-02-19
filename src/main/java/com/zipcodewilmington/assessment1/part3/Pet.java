package com.zipcodewilmington.assessment1.part3;

/**
 * Created by leon on 2/16/18.
 */
public abstract class Pet implements Animal {
    protected String name;
    protected Integer age;

    /**
     * nullary constructor
     * by default, pet has age of 0; name of "";
     */
    public Pet() {
        this.age = 0;
        this.name = "";
    }

    /**
     * @param name name of this pet
     */
    public Pet(String name) {
        this.name = name;
    }


    /**
     * @param age age of this pet
     */
    public Pet(Integer age) {
        this.age = age;
    }

    /**
     * @param name name of this pet
     * @param age age of this pet
     */
    public Pet(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    /**
     * @return name of this pet
     */
    protected String getName() {
        return this.name;
    }

    /**
     * @return age of this pet
     */
    protected Integer getAge() {
        return this.age;
    }

    /**
     * @param newPetOwner the new owner of this pet
     * ensure this instance of `Pet` is added to the owner's composite `pets` list
     */
    public void setOwner(PetOwner newPetOwner) {
        newPetOwner.addPet(this);
    }

    /**
     * @return PetOwner object whose composite `pets` collection contains this Pet instance
     */
    public PetOwner getOwner() {


        return null;
    }
}
