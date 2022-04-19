package com.company;

public class Blowfish extends Fish implements AnimalBehavior, AnimalMove{
    private String TypeArnold55322;
    public Blowfish(){
        super();
        TypeArnold55322="Tetenaamount ";
    }
    public Blowfish(String nameArnold55322,int ageArnold55322 , int weightArnold55322 , String orderArnold55322, String TypeArnold55322){
        super(nameArnold55322,ageArnold55322,weightArnold55322,orderArnold55322);
        this.TypeArnold55322 = TypeArnold55322;
    }
    public Blowfish(int age , String order, String Type){
        super(age,order);
        this.TypeArnold55322=Type;
    }
    public void travel(){System.out.println("Im going  _");}

    @Override
    public void Search_For_Food() {
        System.out.println("The Blowfish is looking for something to eat ");
    }

    @Override
    public void getVoice() {
        System.out.println("GRRRRRR");
    }

    @Override
    public void eat(String meal) {
        System.out.println("I am Eating "+meal);
    }
    public String getType(){return this.TypeArnold55322;};
    public void setType(String w){this.TypeArnold55322=w;};
    public String ToString(){
        return "BlowFish :\n "+"Type : "+TypeArnold55322;
    }

    @Override
    public void sleep() {

    }
}


