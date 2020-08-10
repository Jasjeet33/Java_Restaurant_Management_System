import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JTextField;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import javax.swing.JCheckBox;

public class Restraunts {

	private JFrame frame;
	private JTextField jtxtChicBurger;
	private JTextField jtxtChicBurgerMeal;
	private JTextField jtxtBCBurger;
	private JTextField textField_10;
	private JTextField jtxtReceipts;
	private JTextField jtxtQty;
	private JTextField jtxtConvert;
	private JLabel jlblConvert;
	private JLabel lblTotal;
	
	double[] i = new double[5];
	
	double US_Dollar = 0.013;
	double British_Pound = 0.012;
	double Canadian_Dollar = 0.018;
	double Indonesian_Rupiah = 196.54;
	double Indian_Rupee = 1.04;
	double Algeria_Dinar = 1.71;
	double SriLanka_slrupee = 2.47;
	double Brazilian_Real = 0.072;
	private JTextField jtxtConversion;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Restraunts window = new Restraunts();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Restraunts() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 902, 520);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel.setBounds(10, 40, 359, 221);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblChickenBurger = new JLabel("Chicken Burger");
		lblChickenBurger.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblChickenBurger.setBounds(21, 11, 134, 25);
		panel.add(lblChickenBurger);
		
		JLabel lblChickenBurgerMeal = new JLabel("Chicken Burger Meal");
		lblChickenBurgerMeal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblChickenBurgerMeal.setBounds(21, 47, 182, 33);
		panel.add(lblChickenBurgerMeal);
		
		JLabel lblCheeseBurger = new JLabel("Cheese Burger");
		lblCheeseBurger.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCheeseBurger.setBounds(21, 91, 134, 25);
		panel.add(lblCheeseBurger);
		
		jtxtChicBurger = new JTextField();
		jtxtChicBurger.setBounds(212, 17, 134, 20);
		panel.add(jtxtChicBurger);
		jtxtChicBurger.setColumns(10);
		
		jtxtChicBurgerMeal = new JTextField();
		jtxtChicBurgerMeal.setColumns(10);
		jtxtChicBurgerMeal.setBounds(212, 57, 134, 20);
		panel.add(jtxtChicBurgerMeal);
		
		jtxtBCBurger = new JTextField();
		jtxtBCBurger.setColumns(10);
		jtxtBCBurger.setBounds(212, 97, 134, 20);
		panel.add(jtxtBCBurger);
		
		JLabel lblNewLabel_2 = new JLabel("Drinks");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(21, 134, 73, 21);
		panel.add(lblNewLabel_2);
		
		JComboBox jcmbDrink = new JComboBox();
		jcmbDrink.setModel(new DefaultComboBoxModel(new String[] {"Select a drink", "Apple Juice", "Tea", "Cola", "Coke", "Coffee", "Ice Tea", "Ice Coffee", "Orange"}));
		jcmbDrink.setBounds(21, 162, 110, 22);
		panel.add(jcmbDrink);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(167, 128, -8, 8);
		panel.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(21, 127, 325, 2);
		panel.add(separator_1);
		
		JCheckBox jCDelivery = new JCheckBox("Home Delivery");
		jCDelivery.setBounds(21, 191, 110, 23);
		panel.add(jCDelivery);
		
		JCheckBox jCTax = new JCheckBox("Tax");
		jCTax.setBounds(163, 191, 97, 23);
		panel.add(jCTax);
		
		JLabel lblNewLabel_3 = new JLabel("Quantity");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_3.setBounds(212, 131, 76, 26);
		panel.add(lblNewLabel_3);
		
		jtxtQty = new JTextField();
		jtxtQty.setColumns(10);
		jtxtQty.setBounds(212, 163, 134, 20);
		panel.add(jtxtQty);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_1.setBounds(372, 40, 230, 221);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JComboBox jcmbCurrency = new JComboBox();
		jcmbCurrency.setModel(new DefaultComboBoxModel(new String[] {"Choose One...", "USA", "Uk", "India", "Algeria","Sri Lanka", "Brazil", "Indonesia", "Canada"}));
		jcmbCurrency.setBounds(45, 72, 134, 22);
		panel_1.add(jcmbCurrency);
		
		
		jtxtConvert = new JTextField();
		jtxtConvert.setColumns(10);
		jtxtConvert.setBounds(45, 105, 134, 22);
		panel_1.add(jtxtConvert);
		
		JButton jbtnConvert = new JButton("Convert");
		jbtnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double Indian_Rupee = Double.parseDouble(jtxtConvert.getText());
				if (jcmbCurrency.getSelectedItem().equals("USA"))
				{
					String cConvert1 = String.format("$ %.2f",Indian_Rupee*US_Dollar);
					jtxtConversion.setText(cConvert1);
				}
				if (jcmbCurrency.getSelectedItem().equals("Uk"))
				{
					String cConvert1 = String.format("£ %.2f",Indian_Rupee*British_Pound);
					jtxtConversion.setText(cConvert1);
				}
				if (jcmbCurrency.getSelectedItem().equals("Indonesia"))
				{
					String cConvert1 = String.format("Rp %.2f",Indian_Rupee*Indonesian_Rupiah);
					jtxtConversion.setText(cConvert1);
				}
				if (jcmbCurrency.getSelectedItem().equals("Algeria"))
				{
					String cConvert1 = String.format("DA %.2f",Indian_Rupee*Algeria_Dinar);
					jtxtConversion.setText(cConvert1);
				}
				if (jcmbCurrency.getSelectedItem().equals("Canada"))
				{
					String cConvert1 = String.format("CAD %.2f",Indian_Rupee*Canadian_Dollar);
					jtxtConversion.setText(cConvert1);
				}
				if (jcmbCurrency.getSelectedItem().equals("Sri Lanka"))
				{
					String cConvert1 = String.format("Rs %.2f",Indian_Rupee*SriLanka_slrupee);
					jtxtConversion.setText(cConvert1);
				}
				if (jcmbCurrency.getSelectedItem().equals("Brazil"))
				{
					String cConvert1 = String.format("R$ %.2f",Indian_Rupee*Brazilian_Real);
					jtxtConversion.setText(cConvert1);
				}
				 
				 
			}
		});
		jbtnConvert.setFont(new Font("Tahoma", Font.PLAIN, 12));
		jbtnConvert.setBounds(21, 174, 80, 23);
		panel_1.add(jbtnConvert);
		
		JButton jbtnClose = new JButton("Close");
		jbtnClose.setFont(new Font("Tahoma", Font.PLAIN, 12));
		jbtnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jtxtConversion.setText(null);
				jtxtConvert.setText(null);
				jcmbCurrency.setSelectedItem("Choose One...");
			}
		});
		jbtnClose.setBounds(126, 174, 80, 23);
		panel_1.add(jbtnClose);
		
		JLabel lblNewLabel_1 = new JLabel("Currency Converter");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(21, 11, 185, 22);
		panel_1.add(lblNewLabel_1);
		
		jtxtConversion = new JTextField();
		jtxtConversion.setColumns(10);
		jtxtConversion.setBounds(45, 138, 134, 20);
		panel_1.add(jtxtConversion);
		
		JLabel lblNewLabel_4 = new JLabel("Default Currency: Rs");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(21, 40, 185, 21);
		panel_1.add(lblNewLabel_4);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_2.setBounds(10, 265, 359, 142);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblCostOfDrinks = new JLabel("Cost Of Drinks");
		lblCostOfDrinks.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCostOfDrinks.setBounds(10, 11, 134, 25);
		panel_2.add(lblCostOfDrinks);
		
		JLabel lblCostOfMeal = new JLabel("Cost Of Meal");
		lblCostOfMeal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCostOfMeal.setBounds(10, 47, 182, 33);
		panel_2.add(lblCostOfMeal);
		
		JLabel lblCostOfDelivery = new JLabel("Cost Of Delivery");
		lblCostOfDelivery.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCostOfDelivery.setBounds(10, 91, 151, 25);
		panel_2.add(lblCostOfDelivery);
		
		JLabel jlblCostOfDrinks = new JLabel("");
		jlblCostOfDrinks.setBounds(215, 11, 114, 25);
		jlblCostOfDrinks.setBorder(new LineBorder(new Color(0,0,0),2));
		panel_2.add(jlblCostOfDrinks);
		
		JLabel jlblCostOfMeal = new JLabel("");
		jlblCostOfMeal.setBorder(new LineBorder(new Color(0,0,0),2));
		jlblCostOfMeal.setBounds(215, 51, 114, 25);
		panel_2.add(jlblCostOfMeal);
		
		JLabel jlblCostOfDelivery = new JLabel("");
		jlblCostOfDelivery.setBorder(new LineBorder(new Color(0,0,0),2));
		jlblCostOfDelivery.setBounds(215, 91, 114, 25);
		panel_2.add(jlblCostOfDelivery);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_3.setBounds(372, 265, 230, 142);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTax.setBounds(10, 19, 49, 25);
		panel_3.add(lblTax);
		
		JLabel lblsubTotal = new JLabel("Sub Total");
		lblsubTotal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblsubTotal.setBounds(10, 55, 96, 30);
		panel_3.add(lblsubTotal);
		
		lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTotal.setBounds(10, 96, 68, 25);
		panel_3.add(lblTotal);
		
		JLabel jlblTax = new JLabel("");
		jlblTax.setBorder(new LineBorder(new Color(0,0,0),2));
		jlblTax.setBounds(107, 19, 96, 25);
		panel_3.add(jlblTax);
		
		JLabel jlblsubTotal = new JLabel("");
		jlblsubTotal.setBorder(new LineBorder(new Color(0,0,0),2));
		jlblsubTotal.setBounds(107, 55, 96, 25);
		panel_3.add(jlblsubTotal);
		
		JLabel jlblTotal = new JLabel("");
		jlblTotal.setBorder(new LineBorder(new Color(0,0,0),2));
		jlblTotal.setBounds(107, 96, 96, 25);
		panel_3.add(jlblTotal);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_4.setBounds(604, 40, 272, 367);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(71, 59, 5, 5);
		panel_4.add(tabbedPane);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(10, 11, 252, 345);
		panel_4.add(tabbedPane_1);
		
		JPanel panel_6 = new JPanel();
		tabbedPane_1.addTab("Receipt", null, panel_6, null);
		panel_6.setLayout(null);
		
		textField_10 = new JTextField();
		textField_10.setBounds(0, 0, 237, 3);
		
		panel_6.add(textField_10);
		textField_10.setColumns(10);
		
		jtxtReceipts = new JTextField();
		jtxtReceipts.setBounds(0, 0, 247, 317);
		panel_6.add(jtxtReceipts);
		jtxtReceipts.setColumns(10);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_5.setBounds(10, 413, 866, 68);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JButton jbtnExit = new JButton("Exit");
		jbtnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		jbtnExit.setBounds(504, 22, 89, 23);
		panel_5.add(jbtnExit);
		
		JButton jbtnReset = new JButton("Reset");
		jbtnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				jlblCostOfDelivery.setText(null);
				jlblsubTotal.setText(null);
				jlblTotal.setText(null);
				jlblTax.setText(null);
				jbtnConvert.setText(null);
				jlblCostOfDelivery.setText(null);
				jlblCostOfDrinks.setText(null);
				jlblCostOfMeal.setText(null);
				jlblsubTotal.setText(null);
				jlblTax.setText(null);
				jlblTotal.setText(null);
				jtxtChicBurger.setText(null);
				jtxtChicBurgerMeal.setText(null);
				jtxtBCBurger.setText(null);
				jtxtQty.setText(null);
				jtxtConvert.setText(null);
				jcmbDrink.setSelectedItem("Select a drink");
				jcmbCurrency.setSelectedItem("Choose One...");
				
			}
		});
		jbtnReset.setBounds(380, 22, 89, 23);
		panel_5.add(jbtnReset);
		
		JButton jbtnReceipt = new JButton("Receipt");
		jbtnReceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double Qty1 = Double.parseDouble(jtxtChicBurger.getText());
				double Qty2 = Double.parseDouble(jtxtChicBurgerMeal.getText());
				double Qty3 = Double.parseDouble(jtxtBCBurger.getText());
				
				jtxtReceipts.setText("\n\nRestaurant Management System:\n\n" + "\r\n" +
				"\n\nChicken Burger:\t\t"+ "\r\n" +  Qty1 + "\r\n"+
				"\n\nChicken Burger Meal:\t\t"+ Qty2 +"\r\n"+
				"\n\nCheese Burger:\t\t" + Qty3 + "\r\n"+
				"\n\nThanks for using my Management System");
			}
		});
		jbtnReceipt.setBounds(259, 22, 89, 23);
		panel_5.add(jbtnReceipt);
		JButton jbtnTotal = new JButton("Total");
		jbtnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ChicBurger = Double.parseDouble(jtxtChicBurger.getText());
				double iChicBurger = 79.80;
				double Burger;
				Burger = (ChicBurger*iChicBurger);
				String pMeal = String.format("%.2f",Burger);
				jlblCostOfMeal.setText(pMeal);
				
				double ChicBurgerMeal = Double.parseDouble(jtxtChicBurgerMeal.getText());
				double iChicBurgerMeal = 119.28;
				double BurgerMeal;
				BurgerMeal = (ChicBurgerMeal*iChicBurgerMeal);
				String cMeal = String.format("%.2f",BurgerMeal + Burger);
				jlblCostOfMeal.setText(cMeal);
				
				double CheeseBurger = Double.parseDouble(jtxtBCBurger.getText());
				double CheeseBurgerPrice = 89.28;
				double CheeseBurgerMeal;
				CheeseBurgerMeal = (CheeseBurger*CheeseBurgerPrice);
				String cheese = String.format("%.2f",CheeseBurgerMeal+ BurgerMeal + Burger);
				jlblCostOfMeal.setText(cheese);
				
				double iDelivery = 40.04;
				if(jCDelivery.isSelected())
				{
					String pDelivery = String.format("%.2f",iDelivery);
					jlblCostOfDelivery.setText(pDelivery);
				}
				
				else
				{
					jlblCostOfDelivery.setText("0");
				}
				double Drinks = Double.parseDouble(jtxtQty.getText());
				double Tea = 7.05 * Drinks;
				double Ice_Tea = 20.05 * Drinks;
				double Coffee = 15.05 * Drinks;
				double Ice_Coffee = 25.05* Drinks;
				double Cola = 25.60 * Drinks;
				double Coke = 34.40 * Drinks;
				double Orange = 38.80 * Drinks;
				double Apple_juice = 40.05 * Drinks;
				
				if (jcmbDrink.getSelectedItem().equals("Apple Juice"))
				{
					String cApple_Juice = String.format("%.2f",Apple_juice);
					jlblCostOfDrinks.setText(cApple_Juice);
				}
				if (jcmbDrink.getSelectedItem().equals("Tea"))
				{
					String cTea = String.format("%.2f",Tea);
					jlblCostOfDrinks.setText(cTea);
				}
				 if (jcmbDrink.getSelectedItem().equals("Ice Tea"))
				{
					String cIce_Tea = String.format("%.2f",Ice_Tea);
					jlblCostOfDrinks.setText(cIce_Tea);
				}
				  if (jcmbDrink.getSelectedItem().equals("Cola"))
				{
					String cCola = String.format("%.2f",Cola);
					jlblCostOfDrinks.setText(cCola);
				}
				   if (jcmbDrink.getSelectedItem().equals("Orange"))
				{
					String cOrange = String.format("%.2f",Orange);
					jlblCostOfDrinks.setText(cOrange);
				}
				    if (jcmbDrink.getSelectedItem().equals("Coffee"))
				{
					String cCoffee = String.format("%.2f",Coffee);
					jlblCostOfDrinks.setText(cCoffee);
				}
				     if (jcmbDrink.getSelectedItem().equals("Ice Coffee"))
				{
					String cIce_Coffee = String.format("%.2f",Ice_Coffee);
					jlblCostOfDrinks.setText(cIce_Coffee);
				}
				      if (jcmbDrink.getSelectedItem().equals("Coke"))
				{
					String cCoke = String.format("%.2f",Coke);
					jlblCostOfDrinks.setText(cCoke);
				}
				       if (jcmbDrink.getSelectedItem().equals("Select a drink"))
				    
				{
				    	  jlblCostOfDrinks.setText("0");
				}
				      
				      double cTotal1 = Double.parseDouble(jlblCostOfDrinks.getText());
				      double cTotal2 = Double.parseDouble(jlblCostOfMeal.getText());
				      double cTotal3 = Double.parseDouble(jlblCostOfDelivery.getText());
				      double AllTotal = (cTotal1 + cTotal2 + cTotal3)/100;
				       if (jCTax.isSelected())
				       {
				    	   String iTotal = String.format("%.2f", AllTotal);
				    	   jlblTax.setText(iTotal);
				       }
				       double cTotal4 = Double.parseDouble(jlblTax.getText());
				       double subTotal = (cTotal1 + cTotal2 + cTotal3);
				       String isubTotal = String.format("₹ %.2f", subTotal);
				       jlblsubTotal.setText(isubTotal);
				       
				       double allTotal = (cTotal1 + cTotal2 + cTotal3 + cTotal4);
				       String iTotal = String.format("₹ %.2f", allTotal);
				       jlblTotal.setText(iTotal);
				       
				       String iTaxTotal = String.format("₹ %.2f", cTotal4);
				       jlblTax.setText(iTaxTotal);				       
			}
		});
		jbtnTotal.setBounds(133, 22, 89, 23);
		panel_5.add(jbtnTotal);
		
		JLabel lblNewLabel = new JLabel("Restaurant Management System");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(317, 0, 285, 37);
		frame.getContentPane().add(lblNewLabel);
	}

	private void createUI(JFrame frame2) {
		// TODO Auto-generated method stub
		
	}

	
}
