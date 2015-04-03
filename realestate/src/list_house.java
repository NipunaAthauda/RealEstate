import java.util.*;

public class list_house {
	
	private String lotnumber ;
	private String f_name;
	private String l_name;
	private double price;
	private double square_feet;
	private double num_of_bedrooms;
	
	
	
	public list_house(String lotnumber, String f_name, String l_name,
			double price, double square_feet, double num_of_bedrooms) {
		super();
		this.lotnumber = lotnumber;
		this.f_name = f_name;
		this.l_name = l_name;
		this.price = price;
		this.square_feet = square_feet;
		this.num_of_bedrooms = num_of_bedrooms;
		
		
	}
	public newlist copy() {
		String lotnumber;
        String f_name;
		String l_name;
		double price;
		double square_feet;
		double num_of_bedrooms;
		
		list_house obj = new list_house(lotnumber, f_name, l_name, price, square_feet, num_of_bedrooms);
        return obj;
    }
	
	public String compareTo(list_house newHouse) {
        list_house other = (list_house) newHouse;
        return (this.lotnumber-other.lotnumber);
    }
	
	public String getLotnumber() {
		return lotnumber;
	}
	public void setLotnumber(String lotnumber) {
		this.lotnumber = lotnumber;
	}
	public String getF_name() {
		return f_name;
	}
	public void setF_name(String f_name) {
		this.f_name = f_name;
	}
	public String getL_name() {
		return l_name;
	}
	public void setL_name(String l_name) {
		this.l_name = l_name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getSquare_feet() {
		return square_feet;
	}
	public void setSquare_feet(double square_feet) {
		this.square_feet = square_feet;
	}
	public double getNum_of_bedrooms() {
		return num_of_bedrooms;
	}
	public void setNum_of_bedrooms(int num_of_bedrooms) {
		this.num_of_bedrooms = num_of_bedrooms;
	}
	
}
