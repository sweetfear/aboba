package ZadachaChata;

public enum TypeRoom implements Bonus {
    STANDART("\"Стандарт\" в него входит две кровати", 70),
    COMFORT("\"Комфорт\" в него входит входит все из Стандартного + телевизор", 120),
    LUX("\"Люкс \" в него входит все из Комфорта + шикарный вид", 200),
    PRESIDENT("\"Президент\" в него входит все из Люкса + шведский стол", 800);

    private final String description;
    private final int price;


    @Override
    public String toString() {
        return
                "description='" + description + '\'' +
                        ", price=" + price;
    }

    TypeRoom(String description, int price) {
        this.description = description;
        this.price = price;
    }


    @Override
    public String getStandardRoomBonus() {
        return "Бонус : баночка пива";
    }

    @Override
    public String getComfortRoomBonus() {
        return "Бонус : бутылка виски";
    }

    @Override
    public String getDeluxeRoomBonus() {
        return "Бонус : детское шампансоке";
    }

    @Override
    public String getPresidentRoomBonus() {
        return "Бонус : бутылка Грузинского Вина";
    }
}

