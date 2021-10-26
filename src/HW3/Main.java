package HW3;

public class Main {

    public static void main(String[] args) {

        Box<Apple> boxApple = new Box<>();      /* Создание типизированной коробки с яблоками */
        Box<Orange> boxOrange = new Box<>();    /* Создание типизированной коробки с апельсинами */
        Box<Orange> boxOrange1 = new Box<>();   /* Создание пустой типизированной коробки с апельсинами для пересыпания*/


        Apple apple1 = new Apple();      /* Создание объекта яблоко */
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();       /* Создание объекта апельсин */

        boxApple.addFruitToBox(apple1);     /* добавление в коробку с яблоками, яблока */
        boxApple.addFruitToBox(apple2);
        boxApple.addFruitToBox(apple3);

        boxOrange.addFruitToBox(orange1);    /* добавление в коробку с апельсинами, апельсина */
        boxOrange.addFruitToBox(orange2);

        System.out.println("Вес коробки с яблоками " + boxApple.getWeight());   /* Вывод веса наполненных коробок */
        System.out.println("Вес коробки с апельсинами " + boxOrange.getWeight());

        System.out.println("Результат сравнения " + boxApple.compare(boxOrange));    /* Сравнение коробок */
        // boxOrange.clearFruitBox(); /* Отчистка ящика */

        boxOrange.shiftFruitToBox(boxOrange1); /* Пересыпание из заполненной коробки в пустую коробку */
        System.out.println("Вес коробки в которую пересыпали " + boxOrange1.getWeight());/* Вес коробки в которую пересыпали, после пересыпания */
        System.out.println("Вес коробки из которой  пересыпали " + boxOrange.getWeight());/* Вес коробки из которой пересыпали, после пересыпания */


    }

}
