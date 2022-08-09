package sageAssessmentCenter;

class Main1 {
    public static void main(String[] args){
        Applicant alena_Krasheninnikova = new Applicant("Alena_Krasheninnikova");
        System.out.println("Hello everyone!");
        System.out.println("My name is " + alena_Krasheninnikova.name);
    }
}
public class Applicant {
    String name;


    public Applicant(String name) {
        this.name = name;

    }
}