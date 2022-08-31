package kg.company.model;

import kg.company.interfaceAnimal.Flying;
import kg.company.interfaceAnimal.GetVoice;
import kg.company.interfaceAnimal.Swimmer;

public class Duck extends Animal implements Swimmer, GetVoice, Flying {
    private int numberOfPaws;

    public int getNumberOfPaws() {
        return numberOfPaws;
    }

    public void setNumberOfPaws(int numberOfPaws) {
        this.numberOfPaws = numberOfPaws;
    }

    public Duck(String nickName, int age, String typeOfAnimal, int numberOfPaws) {
        super(nickName, age, typeOfAnimal);
        this.numberOfPaws = numberOfPaws;
    }

    public Duck() {
    }

    @Override
    public void swim() {
        System.out.println("Уточка " + getNickName() + ", плыви, плыви, плыви!");
    }


    @Override
    public void voice() {
        System.out.println("Уточка "+ getNickName() +", кряк - кряк!");
    }
    @Override
    public void fly() {
        System.out.println("Лети " + getNickName() + ", лети!");
    }

    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("Количество лапок: " + numberOfPaws  + "\n");
    }


}
