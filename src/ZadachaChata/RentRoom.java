package ZadachaChata;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import static ZadachaChata.TypeRoom.*;
import static ZadachaChata.TypeRoom.PRESIDENT;

public class RentRoom {

    public static void rentRoom() throws IllegalArgumentException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите один из вариантов комнат");
        System.out.println(STANDART + " " + STANDART.getStandardRoomBonus());
        System.out.println(COMFORT + " " + COMFORT.getComfortRoomBonus());
        System.out.println(LUX + " " + LUX.getDeluxeRoomBonus());
        System.out.println(PRESIDENT + " " + PRESIDENT.getPresidentRoomBonus());
        int i = scanner.nextInt();
        if (i < 0 || i > 4) {
            throw new IllegalArgumentException("Комнаты под данным номер не сущетсвует");
        }
        System.out.println("Сколько у вас денег на счету?");
        Date checkInDate;
        Calendar checkIn;
        int payment = scanner.nextInt();

        switch (i) {
            case 1 -> {
                if (payment >= 70) {
                    Hotel standardRoom = new Hotel(5, 1, 2, STANDART);
                    System.out.println("Вам выдан номер " + STANDART + " +Вам выдан бонус " + STANDART.getStandardRoomBonus() + standardRoom.toString());
                    checkInDate = new Date();
                    checkIn = Calendar.getInstance();
                    checkIn.setTime(checkInDate);
                    int rentTime = payment / 70;
                    System.out.println("Дата заселения " + checkIn.getTime());
                    System.out.printf("Вам выдан номер на данное количество дней %d :\n", rentTime);
                    checkIn.add(Calendar.DAY_OF_WEEK, rentTime);
                    System.out.println("Вы будете выселены " + checkIn.getTime());
                    if (payment > 70) {
                        double change = payment % 70;
                        System.out.println("Ваша сдача " + change);

                    } else {
                        System.out.println("Вам не хватает денег, Досвидания");
                    }
                }
            }
            case 2 -> {
                if (payment >= 120) {
                    Hotel comfortRoom = new Hotel(23, 2, 3, COMFORT);
                    System.out.println("Вам выдан номер " + COMFORT + " +Вам выдан бонус " + COMFORT.getComfortRoomBonus() + comfortRoom.toString());
                    int rentTime = payment / 120;
                    checkInDate = new Date();
                    checkIn = Calendar.getInstance();
                    checkIn.setTime(checkInDate);
                    System.out.println("Дата заселения " + checkIn.getTime());
                    System.out.printf("Вам выдан номер на данное количество дней: %d \n", rentTime);
                    checkIn.add(Calendar.DAY_OF_WEEK, rentTime);
                    System.out.println("Вы будете выселены " + checkIn.getTime());
                    if (payment > 120) {
                        double change = payment % 200;
                        System.out.println("Ваша сдача " + change);
                    }

                } else {
                    System.out.println("Вам не хватает денег, вы можете выбрать другой номер");
                }
            }
            case 3 -> {

                if (payment >= 200) {
                    Hotel luxRoom = new Hotel(56, 3, 4, LUX);
                    System.out.println("Вам выдан номер " + LUX + " +Вам выдан бонус " + LUX.getDeluxeRoomBonus() + luxRoom.toString());
                    int rentTime = payment / 200;
                    checkInDate = new Date();
                    checkIn = Calendar.getInstance();
                    checkIn.setTime(checkInDate);
                    System.out.println("Дата заселения " + checkIn.getTime());
                    System.out.printf("Вам выдан номер на данное количество дней: %d \n", rentTime);
                    checkIn.add(Calendar.DAY_OF_WEEK, rentTime);
                    System.out.println("Вы будете выселены " + checkIn.getTime());
                    if (payment > 200) {
                        double change = payment % 200;
                        System.out.println("Ваша сдача " + change);
                    }

                } else {
                    System.out.println("Вам не хватает денег, вы можете выбрать другой номер");
                }
            }
            case 4 -> {
                if (payment >= 800) {
                    Hotel presidentRoom = new Hotel(72, 4, 5, PRESIDENT);
                    System.out.println("Вам выдан номер " + PRESIDENT + " +Вам выдан бонус " + PRESIDENT.getPresidentRoomBonus() + presidentRoom.toString());
                    int rentTime = payment / 800;
                    checkInDate = new Date();
                    checkIn = Calendar.getInstance();
                    checkIn.setTime(checkInDate);
                    System.out.println("Дата заселения " + checkIn.getTime());
                    System.out.printf("Вам выдан номер на данное количество дней: %d \n", rentTime);
                    checkIn.add(Calendar.DAY_OF_WEEK, rentTime);
                    System.out.println("Вы будете выселены " + checkIn.getTime());
                    if (payment > 800) {
                        double change = payment % 800;
                        System.out.println("Ваша сдача " + change);
                    }
                } else {
                    System.out.println("Вам не хватает денег, вы можете выбрать другой номер");
                }
            }
            default -> System.out.println("Такого номера нет");
        }
    }

}
