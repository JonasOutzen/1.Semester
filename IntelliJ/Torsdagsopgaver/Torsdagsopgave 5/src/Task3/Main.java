package Task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Room room1 = new Room(4, 8);
        Room room2 = new Room(5, 10);
        Room room3 = new Room(6, 12);
        Room room4 = new Room(7, 13);

        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);
        rooms.add(room4);

        Building building1 = new Building(1, rooms);

        System.out.println("Number of Lamps: " + countLampsInBuilding(rooms));
        System.out.println("Number of Windows: " + countWindowsInBuilding(rooms));
        System.out.println("Number of Rooms: " + countRoomsInBuilding(rooms));
        System.out.println("The building is normal: " + isNormal(building1));
        System.out.println("So there is " + building1.getNumberOfFloors() + " floor(s). This amount of floors has " + countRoomsInBuilding(rooms) + " rooms. In these rooms the combined number of lamps is " + countLampsInBuilding(rooms) + ", and the combined number of windows is " + countWindowsInBuilding(rooms) + ".");
    }


    public static int countLampsInBuilding(ArrayList<Room> rooms) {
        int numberOfLamps = 0;
        for (Room r : rooms) {
            numberOfLamps += r.getNumberOfLamps();
        }
        return numberOfLamps;
    }

    public static int countWindowsInBuilding(ArrayList<Room> rooms) {
        int numberOfWindows = 0;
        for (Room r : rooms) {
            numberOfWindows += r.getNumberOfWindows();
        }
        return numberOfWindows;
    }

    public static int countRoomsInBuilding(ArrayList<Room> rooms) {
        int numberOfRooms = 0;
        for (Room r : rooms) {
            numberOfRooms++;
        }
        return numberOfRooms;
    }

    public static boolean isNormal(Building building) {
        if (building.getRooms().size() >= building.getNumberOfFloors()) {
            return true;
        }
        else {
            return false;
        }
    }
}


