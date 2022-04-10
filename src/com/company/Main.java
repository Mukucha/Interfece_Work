package com.company;

public class Main {

    public static void main(String[] args) {
	Animal animal[] = new Animal [6];

    animal[0] = new Mammal("brown",6,5, "bird");

    animal[1] = new Dog("Ghost",45,"black",3,"pitbull");

    animal[2] = new Bird("Pop",6,34,"black");


    animal[3]= new Fish("Flying fish",40,9,"jaw");

    animal[4]= new Blowfish("Blow Fish",7,11,"GRECCE","Blow");

    animal[5]= new Pegion("MyPigeon",60,30,"Atlantic",351);


        // Bird
        animal[1].getVoice();
        animal[2].getVoice();
    }
}
