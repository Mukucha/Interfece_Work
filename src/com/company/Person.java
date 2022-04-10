package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Person {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String surnameArnold55322;
    String firstnameArnold55322;
    String streetArnold55322;
    int zipCodeArnold55322;
    String cityArnold55322;

    void initialize() throws IOException {
        System.out.println("Surname:");
        surnameArnold55322 = br.readLine();
        System.out.println("Firstname:");
        firstnameArnold55322 = br.readLine();
        System.out.println("Street:");
        streetArnold55322 = br.readLine();
        System.out.println("zipCode:");
        zipCodeArnold55322 = Integer.parseInt(br.readLine());
        System.out.println("City:");
        cityArnold55322 = (br.readLine());

    }

    void PrintData() {
        System.out.println("Surname:" + surnameArnold55322);
        System.out.println("Firstname:" + firstnameArnold55322);
        System.out.println("Street:" + streetArnold55322);
        System.out.println("zipCode:" + zipCodeArnold55322);
        System.out.println("City:" + cityArnold55322);
    }
}
class staff extends Person {
    String education;
    String position;

    public void initialize1() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        initialize();
        System.out.println("Enter your education");
        education = br.readLine();
        System.out.println("Enter your position");
        position = br.readLine();
    }

    public void print1() {
        PrintData();
        System.out.println("Education:" + education);
        System.out.println("Position:" + position);


    }


    public static void main(String[] args) throws IOException {
        staff employee = new staff();

        employee.initialize1();
        employee.print1();
    }
}