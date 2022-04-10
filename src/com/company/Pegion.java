package com.company;

public class Pegion extends Bird{
    private int NOSpecies;
    Pegion(){
        super();
        NOSpecies = 888;
    }
    public Pegion(String name,int age , int weight , String order, int NO_Species){
        super(name,age,weight,order);
        this.NOSpecies=NO_Species;
    }
    public Pegion(int age , String order, int NO_Species){
        super(age,order);
        this.NOSpecies=NO_Species;
    }
    public void dance(){System.out.println("Im dancing  _");}

    @Override
    public void Fly(){System.out.println("The Pigeon is flying ");}

    @Override
    public void getVoice() {
        System.out.println("piiiiiii");
    }

    @Override
    public void eat(String meal) {
        System.out.println("I am Eating "+meal);
    }
    public int getNoSpecies(){return this.NOSpecies;};
    public void setNoSpecies(int w){this.NOSpecies=w;};
    public String ToString(){
        return "Pigeon :\n "+"Number of Species : "+NOSpecies;
    }
}

