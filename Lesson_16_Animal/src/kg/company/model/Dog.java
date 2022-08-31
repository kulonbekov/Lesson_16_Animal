package kg.company.model;


import kg.company.interfaceAnimal.AbleToRun;
import kg.company.interfaceAnimal.Biting;
import kg.company.interfaceAnimal.GetVoice;

public class Dog extends Animal implements AbleToRun, Biting, GetVoice {
    private int dangerLevel;

    public int getDangerLevel() {
        return dangerLevel;
    }

    public void setDangerLevel(int dangerLevel) {
        this.dangerLevel = dangerLevel;
    }

    public Dog(String nickName, int age, String typeOfAnimal, int dangerLevel) {
        super(nickName, age, typeOfAnimal);
        this.dangerLevel = dangerLevel;
    }

    public Dog() {

    }

    @Override
    public void run() {
        System.out.println(getNickName() + ", беги!");
    }

    @Override
    public void bite() {
        System.out.println(getNickName() + ", укуси!");
    }

    @Override
    public void voice() {
        System.out.println("Слышни лаи собак (Гав - Гав)");
    }

    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("Уровень опасности: " + dangerLevel  + "\n");
    }
}
