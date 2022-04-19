package com.company;

public class  Dog extends Mammal implements AnimalBehavior,AnimalMove{
    private String breedArnold55322;

    Dog(){
        super();
        breedArnold55322 = "AA";
    }

    public Dog(String nameArnold55322, int ageArnold55322, String orderArnold55322, int weightArnold55322, String breedArnold55322){
        super(nameArnold55322, ageArnold55322,weightArnold55322, orderArnold55322);
        this.breedArnold55322 = breedArnold55322;
    }

    public void aport() {System.out.println("The is retrieving ");}

    @Override
    public void drinkWater(){System.out.println("The dog is drinking Water");}

    @Override
    public void getVoice(){System.out.println("The dog is barking");}

    @Override
    public void eat(String foodName) {System.out.println("The dog is eating" + foodName);}

    public String getBreedArnold55322() {return breedArnold55322;}

    public void setBreedArnold55322(String breedArnold55322){this.breedArnold55322 = breedArnold55322;}

    @Override
    public String toString(){
        return "Dog(" +
                "breed" + breedArnold55322 + '\'' +
                '}';
    }

    @Override
    public void sleep() {

    }
}
