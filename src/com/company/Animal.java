package com.company;

abstract class Animal {
    private String nameArnold55322;
    private int ageArnold55322;
    private int weightArnold55322;

    public Animal(){
        ageArnold55322 = weightArnold55322 = 0;
        nameArnold55322 = "NN";
    }

    public Animal(String nameArnold55322, int ageArnold55322, int weightArnold55322){
        this.nameArnold55322 = nameArnold55322;
        this.ageArnold55322 = ageArnold55322;
        this.weightArnold55322 = weightArnold55322;
    }

    public Animal(int ageArnold55322){this.ageArnold55322 = ageArnold55322;}

    public abstract void eat(String food);

    public abstract void getVoice();

    public String getNameArnold55322() {return nameArnold55322;}
    public void setNameArnold55322(String nameArnold55322) {this.nameArnold55322 = nameArnold55322;}

    public int getAgeArnold55322() {return ageArnold55322;}
    public void setAgeArnold55322(int ageArnold55322) {this.ageArnold55322 = ageArnold55322;}

    public int getWeightArnold55322() {return weightArnold55322;}
    public void setWeightArnold55322(int weightArnold55322) {this.weightArnold55322 = weightArnold55322;}

}
