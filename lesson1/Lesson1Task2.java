package lesson1;

import java.util.ArrayList;

// Задание №2. Написать метод, который преобразует массив в ArrayList;
public class Lesson1Task2 {
    public static <T> T arrList(T arr[]) {
        ArrayList<T> aList = new ArrayList();
        for (int i = 0; i < arr.length; i++) {
            aList.add(arr[i]);
        }
        return (T) aList;

    }

    public static void main(String[] args) {
        Integer a[] = {1,2,3,4,5,6};
        System.out.println(arrList(a));
    }
}
