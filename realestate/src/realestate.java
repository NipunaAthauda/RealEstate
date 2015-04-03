import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.*;
import java.awt.Color;


 

public class realestate {

	private JFrame realestateform;
	private JTextField lot_txt;
	private JLabel lblFirstName;
	private JLabel lblLastName;
	private JLabel lblPrice;
	private JLabel lblSqureFeet;
	private JLabel lblNumberOfBedrooms;
	private JTextField fname_txt;
	private JTextField lname_txt;
	private JTextField price_txt;
	private JTextField sq_txt;
	private JTextField bedrooms_txt;
	private JButton btnClear;
	private JButton nxt_btn;
	private JButton dlt_btn;

	
	int listindex; 

	ArrayList<list_house> realvalues;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					realestate window = new realestate();
					window.realestateform.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public realestate() {
	
		initialize();
		realvalues = new ArrayList<list_house>();// making arraylist
		listindex = -1; // initialization

		//listindex = 1;

	//listindex = 0;

		/*Default Values
		 * 
		 * list_house e1 = new list_house("1", "Aruna", "Athukorala", 125000, 230, 2); // make a instance as e1 from estateList
		realvalues.add(e1);
		
		list_house e2 = new list_house("2", "Nipuna", "Athauda", 250000, 500, 4); 
		realvalues.add(e2);	
		list_house e3 = new list_house("3"," Chinthaka"," madampage", 135000, 300, 3); 
		realvalues.add(e3);	*/
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		realestateform = new JFrame();
		realestateform.setTitle("Real Estate");
		realestateform.setBounds(100, 100, 635, 467);
		realestateform.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		realestateform.getContentPane().setLayout(null);
		
		JLabel lblLotNumber = new JLabel("Lot Number");
		lblLotNumber.setBounds(24, 85, 89, 16);
		realestateform.getContentPane().add(lblLotNumber);
		
		lot_txt = new JTextField();
		lot_txt.setBounds(190, 82, 116, 22);
		realestateform.getContentPane().add(lot_txt);
		lot_txt.setColumns(10);
		
		JButton add_btn = new JButton("Add");
		add_btn.setBackground(Color.GRAY);
		add_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				double price = Double.parseDouble(price_txt.getText());
				double sq_feet = Double.parseDouble(sq_txt.getText());
				int n_of_bed = Integer.parseInt(bedrooms_txt.getText());
				
				list_house newlist = new list_house(lot_txt.getText(), fname_txt.getText(), lname_txt.getText(), price, sq_feet, n_of_bed);
				realvalues.add(newlist);
				
				
			}
		});
		add_btn.setBounds(90, 344, 97, 25);
		realestateform.getContentPane().add(add_btn);
		
		lblFirstName = new JLabel("First Name");
		lblFirstName.setBounds(24, 121, 89, 16);
		realestateform.getContentPane().add(lblFirstName);
		
		lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(24, 150, 89, 16);
		realestateform.getContentPane().add(lblLastName);
		
		lblPrice = new JLabel("Price");
		lblPrice.setBounds(24, 184, 56, 16);
		realestateform.getContentPane().add(lblPrice);
		
		lblSqureFeet = new JLabel("Squre feet");
		lblSqureFeet.setBounds(24, 213, 77, 16);
		realestateform.getContentPane().add(lblSqureFeet);
		
		lblNumberOfBedrooms = new JLabel("Number of Bedrooms");
		lblNumberOfBedrooms.setBounds(24, 249, 121, 16);
		realestateform.getContentPane().add(lblNumberOfBedrooms);
		
		fname_txt = new JTextField();
		fname_txt.setBounds(190, 117, 116, 22);
		realestateform.getContentPane().add(fname_txt);
		fname_txt.setColumns(10);
		
		lname_txt = new JTextField();
		lname_txt.setBounds(190, 147, 116, 22);
		realestateform.getContentPane().add(lname_txt);
		lname_txt.setColumns(10);
		
		price_txt = new JTextField();
		price_txt.setBounds(190, 181, 116, 22);
		realestateform.getContentPane().add(price_txt);
		price_txt.setColumns(10);
		
		sq_txt = new JTextField();
		sq_txt.setBounds(190, 210, 116, 22);
		realestateform.getContentPane().add(sq_txt);
		sq_txt.setColumns(10);
		
		bedrooms_txt = new JTextField();
		bedrooms_txt.setBounds(190, 246, 116, 22);
		realestateform.getContentPane().add(bedrooms_txt);
		bedrooms_txt.setColumns(10);
		
		btnClear = new JButton("Clear");
		btnClear.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lot_txt.setText("");
				fname_txt.setText("");
				lname_txt.setText("");
				price_txt.setText("");
				sq_txt.setText("");
				bedrooms_txt.setText("");
			}
		});
		btnClear.setBounds(90, 382, 97, 25);
		realestateform.getContentPane().add(btnClear);
		
		nxt_btn = new JButton("Next");
		nxt_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(!realvalues.isEmpty()){
					if(realvalues.size()-1!=listindex){
						listindex++;
						lot_txt.setText(realvalues.get(listindex).getLotnumber());
						fname_txt.setText(realvalues.get(listindex).getF_name());
						lname_txt.setText(realvalues.get(listindex).getL_name());
						price_txt.setText(String.valueOf(realvalues.get(listindex).getPrice()));
						sq_txt.setText(String.valueOf(realvalues.get(listindex).getSquare_feet()));
						bedrooms_txt.setText(String.valueOf(realvalues.get(listindex).getNum_of_bedrooms()));
						
						
						
					}
				}
			}
		});
		nxt_btn.setBounds(209, 344, 97, 25);
		realestateform.getContentPane().add(nxt_btn);
		
		dlt_btn = new JButton("Delete");
		dlt_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(!realvalues.isEmpty()){
					if(listindex==realvalues.size()-1){
						realvalues.remove(listindex);
						lot_txt.setText("");
						fname_txt.setText("");
						lname_txt.setText("");
						price_txt.setText("");
						sq_txt.setText("");
						bedrooms_txt.setText("");
						
						
						
					}else{
						realvalues.remove(listindex);
						lot_txt.setText(realvalues.get(listindex).getLotnumber());
						fname_txt.setText(realvalues.get(listindex).getF_name());
						lname_txt.setText(realvalues.get(listindex).getL_name());
						price_txt.setText(String.valueOf(realvalues.get(listindex).getPrice()));
						sq_txt.setText(String.valueOf(realvalues.get(listindex).getSquare_feet()));
						bedrooms_txt.setText(String.valueOf(realvalues.get(listindex).getNum_of_bedrooms()));
						
						
						
					}
					
				}else{
					lot_txt.setText("");
					fname_txt.setText("");
					lname_txt.setText("");
					price_txt.setText("");
					sq_txt.setText("");
					bedrooms_txt.setText("");
					
				}
			}
		});
		dlt_btn.setBounds(209, 382, 97, 25);
		realestateform.getContentPane().add(dlt_btn);
		
		reset_btn = new JButton("Reset");
		reset_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				listindex=-1;
			}
		});
		reset_btn.setBounds(335, 344, 97, 25);
		realestateform.getContentPane().add(reset_btn);
		
		find_btn = new JButton("Find");
		find_btn.setBounds(335, 382, 97, 25);
		realestateform.getContentPane().add(find_btn);
	}
}
