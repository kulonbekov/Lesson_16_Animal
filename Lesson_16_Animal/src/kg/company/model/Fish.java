package kg.company.model;

import kg.company.interfaceAnimal.Swimmer;

public class Fish extends Animal implements Swimmer {

    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Fish(String nickName, int age, String typeOfAnimal, int length) {
        super(nickName, age, typeOfAnimal);
        this.length = length;
    }

    public Fish() {

    }

    @Override
    public void swim() {
        System.out.println("Рыбка по прозвище " + getNickName() + ", плыви!");
    }

    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("Длина: " + length + "\n");
    }

}
