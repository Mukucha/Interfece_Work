package com.company;

public class Mammal extends Animal {
    private  String orderArnold55322;

    public Mammal(){
        super();
        orderArnold55322 = "NN";
    }

    public Mammal(String nameArnold55322, int ageArnold55322, int weightArnold55322, String order){
        super (nameArnold55322,ageArnold55322,weightArnold55322);
        this.orderArnold55322 = orderArnold55322;
    }

    public void drinkWater(){System.out.println("Sip Sip");}

    @Override
    public void getVoice() {System.out.println("Mammal is making soung");}

    @Override
    public void eat(String foodName) {System.out.println("Mammal is eating:" + foodName);}

    public String getOrderArnold55322(){return orderArnold55322;}
    public String setOrderArnold55322( String orderArnold55322){return orderArnold55322;}

    @Override
    public String toString (){
        return "Mammal{" +
                "order" + orderArnold55322 + '\'' +
                '}';
    }




}
