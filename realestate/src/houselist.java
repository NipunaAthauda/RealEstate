import java.io.*;
import java.util.*;

public class houselist {
	
	private static Formatter writer;
    private static Scanner scanner;
    
    boolean scannerOn = false;
    boolean writerOn = false;

    
    public void addHouses(SortedList list) {
        try {
            if (scannerOn) {
                scanner.close();
                scannerOn = false;
            }
//            writer = new Formatter(new FileWriter("houses.txt", true));
//            SortedList l = new SortedList();
//            File file = new File("houses.txt");
            writer = new Formatter("houses.txt");

            for (int i = 0; i < list.getSize(); i++) {
                list_house house = list.getItem(i);
                if (i == list.getSize()-1) {
                    writer.format("%d %s %s %d %d %d", house.getLotnumber(), house.getF_name(), house.getL_name(), house.getPrice(), house.getSquare_feet(), house.getNum_of_bedrooms());
                } else {
                    writer.format("%d %s %s %d %d %d%n", house.getLotnumber(), house.getF_name(), house.getL_name(), house.getPrice(), house.getSquare_feet(), house.getNum_of_bedrooms());
                }
            }

//            if (file.length() > 0) {
//                writer.format("%n%d %s %s %d %d %d", lotNumber, firstName, lastName, price, squareFeet, bedRooms);
//            } else {
//                writer.format("%d %s %s %d %d %d", lotNumber, firstName, lastName, price, squareFeet, bedRooms);
//            }
            writer.close();
        } catch (Exception e) {

        }
    }

    public void resetToRead() {
        try {
            if (scannerOn) {
                scanner.close();
                scannerOn = false;
            }
            scanner = new Scanner(new FileReader("houses.txt"));
            scannerOn = true;
        } catch (Exception e) {

        }
    }

    public boolean hasNextHouse() {
        if (scannerOn && scanner.hasNextLine()) {
            return true;
        } else {
            return false;
        }
    }

    public list_house getNextHouse() {
        System.out.println("Scanner status "+scannerOn);
        
        String lotNumber = scanner.next();
        String firstName = scanner.next();
        String lastName = scanner.next();
        double price = Double.parseDouble(scanner.next());
        Double squareFeet = Double.parseDouble(scanner.next());
        Double bedRooms = Double.parseDouble(scanner.next());

        System.out.printf("%d %s %s %d %d %d%n", lotNumber, firstName, lastName, price, squareFeet, bedRooms);

        list_house house = new list_house(lotNumber, firstName, lastName, price, squareFeet, bedRooms);
        return house;
    }
}
