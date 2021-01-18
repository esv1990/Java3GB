package lesson1;

import lesson1.Apple;

public class Lesson1Task3 {
    public static void main(String[] args) {
        Orange o = new Orange("Апельсин", 1.5f);
        Apple a = new Apple("Яблоко", 1.0f);
        Box<Apple> appleBox = new Box<>();
        Box<Apple> appleBox2 = new Box<>();
        Box<Orange> orangeBox = new Box<>();
        appleBox.putBox(a, 5);
        orangeBox.putBox(o,7);
        System.out.println( appleBox.getWeight());
        System.out.println( orangeBox.getWeight());
        System.out.println(appleBox.compare(orangeBox));
        appleBox.shiftFruit(appleBox2,5);
        System.out.println( appleBox.getWeight());
        System.out.println( appleBox2.getWeight());
        appleBox2.shiftFruit(appleBox,1);
        System.out.println( appleBox.getWeight());
        System.out.println( appleBox2.getWeight());
    }
}
