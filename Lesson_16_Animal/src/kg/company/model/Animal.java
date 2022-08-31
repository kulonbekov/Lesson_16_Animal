package kg.company.model;

public abstract class Animal {
    private String nickName;
    private int age;
    private String typeOfAnimal;

    public String getNickName() {
        return nickName;
    }


    public void setNickName(String name) {
        this.nickName = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTypeOfAnimal() {
        return typeOfAnimal;
    }

    public void setTypeOfAnimal(String typeOfAnimal) {
        this.typeOfAnimal = typeOfAnimal;
    }

    public Animal(String name, int age, String typeOfAnimal) {
        this.nickName = name;
        this.age = age;
        this.typeOfAnimal = typeOfAnimal;
    }

    public Animal() {
    }


    public  void getInfo() {
        System.out.println("Вид животных: " + typeOfAnimal);
        System.out.println("Прозвище: " + nickName);
        System.out.println("Возраст: " + age);

    }
}
