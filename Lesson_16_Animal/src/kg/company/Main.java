package kg.company;

import kg.company.model.*;



public class Main {
    public static void main(String[] args) {



        Fish[] fish = new Fish[2];
        fish[0] = new Fish("Рио", 2, "Водные животные", 50);
        fish[1] = new Fish("Сакура", 3, "Водные животные", 55);

        Duck[] ducks = new Duck[2];
        ducks[0] = new Duck("Кроша", 1, "Водоплавающие птицы", 2);
        ducks[1] = new Duck("Нокс", 2, "Водоплавающие птицы", 2);

        Horse[] horses = new Horse[2];
        horses[0] = new Horse("Рубин", 3, "Семейства лошадиных", 2);
        horses[1] = new Horse("Гром", 5, "Семейства лошадиных", 2);

        Dog[] dogs = new Dog[3];
        dogs[0] = new Dog("Рыжий", 1, "Семейства псовых", 1);
        dogs[1] = new Dog("Гринго", 2, "Семейства псовых", 2);
        dogs[2] = new Dog("Динго", 3, "Семейства псовых", 3);

        System.out.println("<Класс наследник Fish>");
        for (int i = 0; i < fish.length; i++) {
            fish[i].getInfo();
        }
        System.out.println("<Класс наследник Duck>");
        for (int i = 0; i < ducks.length; i++) {
            ducks[i].getInfo();
        }
        System.out.println("<Класс наследник Horse>");
        for (int i = 0; i < horses.length; i++) {
            horses[i].getInfo();
        }
        System.out.println("<Класс наследник Dog>");
        for (int i = 0; i < dogs.length; i++) {
            dogs[i].getInfo();
        }

        System.out.println("<Интерфейсы для рыб>" );
        fish[0].swim();
        System.out.println();

        System.out.println("<Интерфейсы для уток>" );
        ducks[0].swim();
        ducks[1].voice();
        ducks[0].fly();
        System.out.println();

        System.out.println("<Интерфейсы для лошадей>" );
        horses[1].run();
        horses[0].voice();
        System.out.println();

        System.out.println("<Интерфейсы для собак>" );
        dogs[0].run();
        dogs[1].voice();
        dogs[2].bite();
        System.out.println();


        /*Animal[] animals = new Animal[8];
        animals[0] = new Fish("Рио", 2, "Водные животные", 50);
        animals[1] = new Fish("Сакура", 3, "Водные животные", 55);
        animals[2] = new Duck("Кроша", 1, "Водоплавающие птицы", 2);
        animals[3] = new Duck("Нокс", 2, "Водоплавающие птицы", 2);
        animals[4] = new Horse("Рубин", 3, "Семейства лошадиных", 2);
        animals[5] = new Horse("Гром", 5, "Семейства лошадиных", 2);
        animals[6] = new Dog("Рыжий", 1, "Семейства псовых", 1);
        animals[7] = new Dog("Гринго", 2, "Семейства псовых", 2);

        System.out.println("Класс наследник Fish"  + "\n");
        for (int i = 0; i < animals.length; i++) {
            animals[i].getInfo();
        }
        System.out.println("Класс наследник Duck"  + "\n");
        for (int i = 0; i < animals.length; i++) {
           animals[i].getInfo();
        }
        System.out.println("Класс наследник Horse"  + "\n");
        for (int i = 0; i < animals.length; i++) {
            animals[i].getInfo();
        }
        System.out.println("Класс наследник Dog"  + "\n");
        for (int i = 0; i < animals.length; i++) {
            animals[i].getInfo();
        }*/

    }
}