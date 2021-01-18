package lesson1;


//Задание №1. Написать метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа);
public class Lesson1Task1 {
    public static <T> void changeArrElement(T[] arr, int a, int b){
        int c;
        System.out.println("Исходный массив: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
        T temp;
        temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        System.out.println("Массив после преобразования: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Integer arr[] = {1,2,3,4,5,6,7};
        String arr2[] = {"a","b","c"};
        changeArrElement(arr, 0, 6);
        changeArrElement(arr2,0,2);

    }
}
