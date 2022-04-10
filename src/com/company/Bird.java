package com.company;

class Bird extends Animal {
    private String TypeArnold55322;
    public Bird(){
        super();
        TypeArnold55322="mm";
    }
    public Bird(String nameArnold5532,int ageArnold55322 , int weightArnold55322 , String TypeArnold55322){
        super(nameArnold5532,ageArnold55322,weightArnold55322);
        this.TypeArnold55322 = TypeArnold55322;
    }
    public Bird(int ageArnold55322 , String TypeArnold55322){
        super(ageArnold55322);
        this.TypeArnold55322 = TypeArnold55322;
    }

    public void Fly(){System.out.println("im flying ");}

    @Override
    public void getVoice() {
        System.out.println("Quack Quack Quack");
    }
    @Override
    public void eat(String meal) {
        System.out.println("Bird is eating a "+ meal);
    }
    public String getTypeArnold55322(){return this.TypeArnold55322;};
    public void setTypeArnold55322(String w){this.TypeArnold55322=w;};
    public String ToString(){
        return "Bird :\n "+"Type of Bird : "+TypeArnold55322;
    }
}
