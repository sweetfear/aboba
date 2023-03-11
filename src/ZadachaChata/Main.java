package ZadachaChata;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import static ZadachaChata.TypeRoom.*;

public class Main {
    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        Authorization.authorization();
        RentRoom.rentRoom();
    }


}
