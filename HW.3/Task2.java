import java.util.ArrayList;

//Пусть дан произвольный список целых чисел, удалить из него четные числа
public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(23);
        numbers.add(14);
        numbers.add(57);
        numbers.add(44);
        numbers.add(13);
        numbers.add(1);
        numbers.add(15);

        System.out.println("Список: " + numbers);

        numbers.removeIf(n -> n % 2 == 0);

        System.out.println("Список без четных чисел: " + numbers);

    }
}