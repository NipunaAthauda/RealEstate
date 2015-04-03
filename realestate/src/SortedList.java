import java.util.*;

public class SortedList {
	
	public static List<list_house> sortedlist = new ArrayList<list_house>();
	
	public void insertItem(list_house house) {

	        int insertPosition = 0;
	        for (int i = 0; i < sortedlist.size(); i++) {
	            if (sortedlist.get(i).compareTo(house) < 0) {
	                insertPosition ++;
	            } 
	            System.out.println(sortedlist.get(i).getLotnumber() + " - " + house.getLotnumber() + " = " + sortedlist.get(i).compareTo(house) + " inserted position : "+insertPosition);

	        }
	        sortedlist.add(insertPosition ,house);
	    }

	 public int getSize() {
	        return sortedlist.size();
	    }
	 public list_house getItem(int i) {
	        return sortedlist.get(i);
	    }
	 public list_house getItem(list_house house) {
	        int itemPosition = sortedlist.size();
	        for (int i = 0; i < sortedlist.size(); i++) {
	            if (sortedlist.get(i).getLotnumber() == house.getLotnumber()) {
	                itemPosition = i;
	            }
	        }
	        return sortedlist.get(itemPosition);
	    }

	    public boolean findItem(list_house newHouse) {
	        boolean itemFound = false;
	        for (int i = 0; i < sortedlist.size(); i++) {
	            if (sortedlist.get(i).compareTo(newHouse) == 0) {
	                itemFound = true;
	            }
	        }
	        System.out.println(itemFound);
	        return itemFound;
	    }

	    public void removeItem(list_house house) {
	        int itemPosition = sortedlist.size();
	        for (int i = 0; i < sortedlist.size(); i++) {
	            if (sortedlist.get(i).getLotnumber() == house.getLotnumber()) {
	                itemPosition = i;
	            }
	        }
	        sortedlist.remove(itemPosition);
	        System.out.println("Item at " + itemPosition + " position is removed!");
	    }
}


