package com.company;

public class Main {

    public static void main(String[] args) {
	Animal animal[] = new Animal [6];

    animal[0] = new Mammal("brown",6,5, "bird");

    animal[1] = new Dog("Ghost",45,"black",3,"pitbull");

    animal[2] = new Bird("Pop",6,34,"black");


    animal[3]= new Fish("Flying fish",40,9,"jaw");

    animal[4]= new Blowfish("Blow Fish",7,11,"GRECCE","Blow");

    animal[5]= new Pegion("MyPigeon",6,30,"Atlantic",351);


        // Bird
        animal[0].getVoice();
        animal[1].getVoice();
        animal[2].getVoice();
        animal[3].getVoice();
        animal[4].getVoice();
        animal[5].getVoice();

        AnimalBehavior animalBehavior[] = new AnimalBehavior[3];
        animalBehavior[0]= new Dog("Tim",3,"Great",5,"Bulldog");
        animalBehavior[1]= new Pegion("Kevin",5,1,"pink",5);
        animalBehavior[2]= new Blowfish("BlowFish",4,1,"yellow","Great");


        animalBehavior[0].sleep();
        animalBehavior[1].sleep();
        animalBehavior[2].sleep();


        for (Animal a: animal){
            a.moveArnold55322();
        }

        for (Animal z: animal) {
            AnimalName.name(z.getNameArnold55322());

        }
    }
}


