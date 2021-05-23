import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Dimension;

import javax.swing.JTextField;
import java.io.IOException;
public class GUI implements ActionListener {

	private JFrame frmKalkulatorOnp;
	
	private static JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frmKalkulatorOnp.setVisible(true);
				}	
				catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmKalkulatorOnp = new JFrame();
		frmKalkulatorOnp.setTitle("Kalkulator ONP");
		frmKalkulatorOnp.setBounds(100, 100, 420, 500);
		frmKalkulatorOnp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmKalkulatorOnp.setMinimumSize(new Dimension(360,440));
		frmKalkulatorOnp.getContentPane().setLayout(null);
		
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton.addActionListener(this); 
		btnNewButton.setBounds(41, 333, 75, 46);
		frmKalkulatorOnp.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_1.addActionListener(this);
		btnNewButton_1.setBounds(122, 333, 75, 46);
		frmKalkulatorOnp.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("3");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_2.addActionListener(this);
		btnNewButton_2.setBounds(207, 333, 75, 46);
		frmKalkulatorOnp.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("4");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_3.addActionListener(this);
		btnNewButton_3.setBounds(41, 279, 75, 46);
		frmKalkulatorOnp.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("5");
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_4.addActionListener(this);
		btnNewButton_4.setBounds(122, 279, 75, 46);
		frmKalkulatorOnp.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("6");
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_5.addActionListener(this);
		btnNewButton_5.setBounds(207, 279, 75, 46);
		frmKalkulatorOnp.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("7");
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_6.addActionListener(this);
		btnNewButton_6.setBounds(41, 222, 75, 46);
		frmKalkulatorOnp.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("8");
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_7.addActionListener(this);
		btnNewButton_7.setBounds(122, 222, 75, 46);
		frmKalkulatorOnp.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("9");
		btnNewButton_8.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_8.addActionListener(this);
		btnNewButton_8.setBounds(207, 222, 75, 46);
		frmKalkulatorOnp.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("0");
		btnNewButton_9.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_9.addActionListener(this);
		btnNewButton_9.setBounds(122, 385, 75, 46);
		frmKalkulatorOnp.getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton(".");
		btnNewButton_10.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_10.addActionListener(this);
		btnNewButton_10.setBounds(207, 385, 75, 46);
		frmKalkulatorOnp.getContentPane().add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("=");
		btnNewButton_11.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_11.addActionListener(this);
		btnNewButton_11.setBounds(292, 385, 75, 46);
		frmKalkulatorOnp.getContentPane().add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("+");
		btnNewButton_12.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_12.addActionListener(this);
		btnNewButton_12.setBounds(292, 333, 75, 46);
		frmKalkulatorOnp.getContentPane().add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("-");
		btnNewButton_13.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_13.addActionListener(this);
		btnNewButton_13.setBounds(292, 279, 75, 46);
		frmKalkulatorOnp.getContentPane().add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("x");
		btnNewButton_14.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_14.addActionListener(this);
		btnNewButton_14.setBounds(292, 222, 75, 46);
		frmKalkulatorOnp.getContentPane().add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("/");
		btnNewButton_15.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_15.addActionListener(this);
		btnNewButton_15.setBounds(292, 171, 75, 46);
		frmKalkulatorOnp.getContentPane().add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("^");
		btnNewButton_16.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_16.addActionListener(this);
		btnNewButton_16.setBounds(207, 171, 75, 46);
		frmKalkulatorOnp.getContentPane().add(btnNewButton_16);
		
		JButton btnNewButton_17 = new JButton("%");
		btnNewButton_17.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_17.addActionListener(this);
		btnNewButton_17.setBounds(41, 171, 75, 46);
		frmKalkulatorOnp.getContentPane().add(btnNewButton_17);
		
		JButton btnNewButton_18 = new JButton("\u221A");
		btnNewButton_18.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_18.addActionListener(this);
		btnNewButton_18.setBounds(122, 171, 75, 46);
		frmKalkulatorOnp.getContentPane().add(btnNewButton_18);
		
		JButton btnNewButton_19 = new JButton("!");
		btnNewButton_19.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_19.addActionListener(this);
		btnNewButton_19.setBounds(41, 385, 75, 46);
		frmKalkulatorOnp.getContentPane().add(btnNewButton_19);
		
		JButton btnNewButton_20 = new JButton("\u2190");
		btnNewButton_20.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_20.addActionListener(this);
		btnNewButton_20.setBounds(292, 116, 75, 46);
		frmKalkulatorOnp.getContentPane().add(btnNewButton_20);
		
		JButton btnNewButton_21 = new JButton("C");
		btnNewButton_21.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_21.addActionListener(this);
		btnNewButton_21.setBounds(207, 116, 75, 46);
		frmKalkulatorOnp.getContentPane().add(btnNewButton_21);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 17));
		textField.setBounds(41, 42, 324, 51);
		frmKalkulatorOnp.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_22 = new JButton(")");
		btnNewButton_22.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_22.addActionListener(this);
		btnNewButton_22.setBounds(122, 116, 75, 46);
		frmKalkulatorOnp.getContentPane().add(btnNewButton_22);
		
		JButton btnNewButton_23 = new JButton("(");
		btnNewButton_23.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_23.addActionListener(this);
		btnNewButton_23.setBounds(41, 116, 75, 46);
		frmKalkulatorOnp.getContentPane().add(btnNewButton_23);
		frmKalkulatorOnp.setVisible(true);
		frmKalkulatorOnp.getContentPane().addHierarchyBoundsListener(
	            new ResizeComponentsListener(420, 500, true));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String znak = e.getActionCommand();
		String rownanie = textField.getText();
		
		switch(znak) {
		 case ("C"): {
			 rownanie = "";
			 textField.setText(rownanie);
			 break;
		 }
		 case ("\u2190"): {
			 rownanie = rownanie.substring(0,textField.getText().length() - 1) ;
			 textField.setText(rownanie);
			 break;
		 }
		 case ("=") :{
			 rownanie += "=";
			 try {	 
			 ONP onp = new ONP();
			 onp.czyPoprawneRownanie(rownanie);
			 String rownanieONP = onp.przeksztalcNaOnp(rownanie);
			 String wynik = onp.obliczOnp(rownanieONP);
			 rownanie += " " + rownanieONP + " " + wynik;
			 textField.setText(rownanie);
			 onp.zapisDoPliku(rownanie);
			 }
			 catch (WrongRootArguments x) {
				    rownanie="Nie poprawne argumenty pierwiastkowania!";
					textField.setText(rownanie);
					x.printStackTrace();
				}
			 catch (ArithmeticException x) {
				    rownanie="Nie mozna dzielic przez 0!";
					textField.setText(rownanie);
					x.printStackTrace();
				}
			 catch (IllegalArgumentException x) {
				    rownanie="Niepoprawne uzycie nawiasow!";
					textField.setText(rownanie);
					x.printStackTrace();
				}
			 catch (IOException x) {
				    rownanie="Problem z plikiem historiaOperacji.txt!";
					textField.setText(rownanie);
					x.printStackTrace();
				}
				catch (RuntimeException x) {
					rownanie="Bledne rownanie!";
					textField.setText(rownanie);
					x.printStackTrace();
				}	 
		 }		  
		 default : {
			 rownanie += znak ;
			 textField.setText(rownanie);
			 break;
		 } 					
		}		
	}
}
