package kg.company.model;

import kg.company.interfaceAnimal.AbleToRun;
import kg.company.interfaceAnimal.GetVoice;

public class Horse extends Animal implements AbleToRun, GetVoice {
    private int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Horse(String nickName, int age, String typeOfAnimal, int height) {
        super(nickName, age, typeOfAnimal);
        this.height = height;
    }

    public Horse() {
    }

    @Override
    public void run() {
        System.out.println("Скакун " + getNickName() + ", скачи в дальнюю дорогу");
    }

    @Override
    public void voice() {
        System.out.println("Слышни звуки ржание Лошади");
    }

    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("Высота: " + height  + "\n");
    }

}
