package ZadachaChata;

import java.util.Scanner;

public class Authorization {
    static final Scanner scanner = new Scanner(System.in);
    private static String fullName;

    private static String id;

    public static void authorization() throws Exception {
        System.out.println("Введите имя и фамилию через пробел (кириллица, без точек и других символов)");
        fullName = scanner.nextLine().trim().toUpperCase(); // переводим в верхний регистр и убираем пробелы в начале и конце строки
        if (!fullName.matches("^[А-ЯЁ]{4,15} [А-ЯЁ]{4,20}$")) {
            throw new Exception("Неправильный формат имени и фамилии");
        }

        // Проверяем ID паспорта
        System.out.println("Введите ID паспорта (цифры, длина от 6 до 12)");
        id = scanner.nextLine().trim().toUpperCase(); // переводим в верхний регистр и убираем пробелы в начале и конце строки
        if (!id.matches("^\\d{6,12}$")) {
            throw new Exception("Неправильный формат ID паспорта");
        }
    }
}


