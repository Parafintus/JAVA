import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // Создаем список ноутбуков
        ArrayList<Laptop> laptops = new ArrayList<>();
        laptops.add(new Laptop("HP", 15.6, 8, 512, "black"));
        laptops.add(new Laptop("Lenovo", 14.0, 16, 512, "white"));
        laptops.add(new Laptop("Dell", 14.0, 8, 256, "white"));
        laptops.add(new Laptop("Asus", 15.6, 8, 512, "black"));
        laptops.add(new Laptop("Acer", 14.0, 16, 1024, "white"));
        laptops.add(new Laptop("MSI", 17.3, 32, 1024, "black"));
        laptops.add(new Laptop("Apple", 13.3, 8, 256, "white"));
        laptops.add(new Laptop("Asus", 10.1, 4, 256, "black"));

        // Запрос параметров у пользователя
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер оперативной памяти 4/ 8 / 16 /32 (в ГБ ): ");
        int ramSize = scanner.nextInt();
        System.out.print("Введите размер SSD 256 / 512 / 1024 (в ГБ ): ");
        int ssdSize = scanner.nextInt();
        System.out.print("Введите цвет  черный / white: ");
        scanner.nextLine(); // читаем лишний перенос строки после ввода чисел
        String color = scanner.nextLine();

        // Фильтрация ноутбуков
        ArrayList<Laptop> filteredLaptops = new ArrayList<>();
        for (Laptop laptop : laptops) {
            if (laptop.getRamSize() == ramSize && laptop.getSsdSize() == ssdSize
                    && Objects.equals(laptop.getColor(), color)) {
                filteredLaptops.add(laptop);
            }
        }

        // Вывод результатов
        if (filteredLaptops.size() == 0) {
            System.out.println("Ноутбуки с заданными параметрами не найдены.");
        } else {
            System.out.println("Найдены следующие ноутбуки:");
            for (Laptop laptop : filteredLaptops) {
                System.out.println(laptop.getInfo());
            }
        }
    }
}