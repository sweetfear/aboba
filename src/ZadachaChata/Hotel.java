package ZadachaChata;

public class Hotel {
    private final int roomNumber;
    private final int floor;
    private final int rooms;
    private final TypeRoom typeRoom;

    public Hotel(int roomNumber, int floor, int rooms, TypeRoom typeRoom) {
        this.roomNumber = roomNumber;
        this.floor = floor;
        this.rooms = rooms;
        this.typeRoom = typeRoom;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    @Override
    public String toString() {
        return " : Номер комнаты = " + roomNumber +
                ", Этаж = " + floor +
                ", Количетсов комнат = " + rooms;
    }

    public int getFloor() {
        return floor;
    }

    public int getRooms() {
        return rooms;
    }

    public TypeRoom getTypeRoom() {
        return typeRoom;
    }


}