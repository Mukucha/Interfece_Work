package com.company;

class Fish extends Animal{
    private String GhostArnold55322;
    public Fish(){
        super();
        GhostArnold55322=" ";
    }
    public Fish(String name,int age , int weight , String GhostArnold55322){
        super(name,age,weight);
        this.GhostArnold55322 = GhostArnold55322;
    }
    public Fish(int age , String General_type){
        super(age);
        this.GhostArnold55322 = GhostArnold55322;
    }

    public void Search_For_Food(){System.out.println("im looking for food ");}

    @Override
    public void getVoice() {
        System.out.println("Blu Blu BLu");
    }
    @Override
    public void eat(String foodNameArnold55322) {
        System.out.println("Fish is eating a "+ foodNameArnold55322);
    }
    public String getGhostArnold55322(){return this.GhostArnold55322;};
    public void setGhostArnold55322(String w){this.GhostArnold55322=w;};
    public String ToString(){
        return "Fish :\n "+"General Type of Fish : "+GhostArnold55322;
    }
}