package GUI;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import Inheritence.*;
import SysAndMain.*;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.SwingConstants;

public class FictionalCharFrame extends JFrame {

	private JPanel contentPane;
	AddFrame cs = new AddFrame(this);
	KombatAreaFrame kf = new KombatAreaFrame(this);
	private JLabel lblNewLabel_1;
	private JTextField txtSearch;
	private JTextField txtDelete;
	private JButton btnNewButton;
	private JLabel lblNewLabel;
	private JLabel lblError;
	private JTextArea txtArea;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FictionalCharFrame frame = new FictionalCharFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FictionalCharFrame() {
		
		
		setTitle("Fictional Character Kombat");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 876, 684);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setBackground(new Color(204, 204, 255));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cs.setVisible(true);
				dispose();
			}
		});
		btnAdd.setBounds(524, 106, 122, 20);
		contentPane.add(btnAdd);
		
		
		
		lblNewLabel_1 = new JLabel("Character NameTo Search: ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(165, 180, 171, 14);
		contentPane.add(lblNewLabel_1);
		
		txtSearch = new JTextField();
		txtSearch.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					if(txtSearch.getText().equals(""))
						txtArea.setText("Enter A name to search.");
					else {
						FictionalChar a = FictionalCharSys.search(txtSearch.getText());
						if(a == null) {
							txtArea.setText("No Such Character.");
							txtSearch.setText("");
						}
							
						else {
							txtArea.setText(a.toString());
							txtSearch.setText("");
						}
							
					}
				}
			}
		});
		txtSearch.setBounds(377, 177, 113, 20);
		contentPane.add(txtSearch);
		txtSearch.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Search");
		btnNewButton_1.setBackground(new Color(204, 204, 255));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtSearch.getText().equals("")) {
					txtArea.setText("Enter A name to search.");
				}
					
				else {
					FictionalChar a = FictionalCharSys.search(txtSearch.getText());
					if(a == null) {
						txtArea.setText("No Such Character.");
						txtSearch.setText("");
					}
						
					
					else {
						txtArea.setText(a.toString());
						txtSearch.setText("");
					}
						
				}	
			}
		});
		btnNewButton_1.setBounds(524, 177, 122, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Character NameTo Delete:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setBounds(165, 209, 171, 14);
		contentPane.add(lblNewLabel_1_1);
		
		txtDelete = new JTextField();
		txtDelete.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					if(txtDelete.getText().equals(""))
						txtArea.setText("Enter A name to delete.");
					else {
						if(FictionalCharSys.delete(txtDelete.getText())) {
							txtArea.setText("DELETED.");
							txtDelete.setText("");
						}
							
						else {
							txtArea.setText("No such Character");
							txtDelete.setText("");
						}
							
					}
				}
			}
		});
		txtDelete.setColumns(10);
		txtDelete.setBounds(377, 206, 113, 20);
		contentPane.add(txtDelete);
		
		JButton btnNewButton_1_1 = new JButton("Delete");
		btnNewButton_1_1.setBackground(new Color(204, 204, 255));
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtDelete.getText().equals(""))
					txtArea.setText("Enter A name to delete.");
				else {
					if(FictionalCharSys.delete(txtDelete.getText())) {
						txtArea.setText("DELETED.");
						txtDelete.setText("");
					}
						
					else {
						txtArea.setText("No such Character");
						txtDelete.setText("");
					}
						
				}
			}
		});
		btnNewButton_1_1.setBounds(524, 206, 122, 23);
		contentPane.add(btnNewButton_1_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(160, 398, 561, 219);
		contentPane.add(scrollPane);
		
		txtArea = new JTextArea();
		txtArea.setForeground(Color.WHITE);
		txtArea.setBackground(new Color(0, 0, 102));
		scrollPane.setViewportView(txtArea);
		
		JButton btnRead = new JButton("Read From Txt");
		btnRead.setBackground(new Color(204, 204, 255));
		btnRead.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(FictionalCharSys.readFromFile()) {
					String res = "";
					res += "File is Read.\n";
					res += "Number of Animation Chars: " + Animation.getNumOfChar() + "\n";
					res += "Number of SuperHero Chars: " + SuperHero.getNumOfChar() + "\n";
					res += "Number of Wizard Chars: " + Wizard.getNumOfChar() + "\n";
					res += "Number of Eternal Chars: " + Eternal.getNumOfChar() + "\n";
					res += "Number of Villain Chars: " + Villain.getNumOfChar() + "\n";
					txtArea.setText(res);
					btnNewButton.setEnabled(true);
					lblError.setText("");
				}else {
					txtArea.setText("File is Missing!!!");
				}
				btnRead.setEnabled(false);
			}
		});
		btnRead.setBounds(524, 82, 122, 20);
		contentPane.add(btnRead);
		
		btnNewButton = new JButton("KOMBAT AREA");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				kf.setVisible(true);
				dispose();
			}
		});
		
		btnNewButton.setEnabled(false);
		btnNewButton.setBackground(new Color(204, 204, 255));
		btnNewButton.setBounds(372, 294, 122, 45);
		contentPane.add(btnNewButton);
		
		JComboBox cmbD = new JComboBox();
		cmbD.setBackground(new Color(204, 204, 255));
		cmbD.setModel(new DefaultComboBoxModel(new String[] {"All by Name", "All by Power", "Fixed by Name", "Fixed by Power", "Custom by Name", "Custom by Power"}));
		cmbD.setBounds(241, 82, 122, 22);
		contentPane.add(cmbD);
		
		JLabel lblNewLabel_2 = new JLabel("Display: ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(165, 85, 66, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton_4 = new JButton("Display");
		btnNewButton_4.setBackground(new Color(204, 204, 255));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(FictionalCharSys.getFc().isEmpty() && FictionalCharSys.getFixedList().isEmpty())
					txtArea.setText("The List is Empty");
				else {
					switch(cmbD.getSelectedItem().toString()) {
					case "All by Power": txtArea.setText(FictionalCharSys.displayByPower()); break;
					case "All by Name": txtArea.setText(FictionalCharSys.displayByName()); break;
					case "Fixed by Power": if(FictionalCharSys.getFixedList().isEmpty()) {
						txtArea.setText("You Have To Read The File");
					}
												
					else
						txtArea.setText(FictionalCharSys.displayFixedByPower()); break;
					case "Fixed by Name": if(FictionalCharSys.getFixedList().isEmpty()) {
						txtArea.setText("You Have To Read The File");
					}
												
					else
						txtArea.setText(FictionalCharSys.displayFixedByName()); break;
					case "Custom by Power":if(FictionalCharSys.getFc().isEmpty()) {
						txtArea.setText("You Don't Have Any Created Char.");
					}				
					else
						txtArea.setText(FictionalCharSys.displayCustomByPower()); break;
					case "Custom by Name":if(FictionalCharSys.getFc().isEmpty()) {
						txtArea.setText("You Don't Have Any Created Char.");
					}				
					else
						txtArea.setText(FictionalCharSys.displayCustomByName()); break;
					}
				}
			}
		});
		btnNewButton_4.setBounds(241, 106, 122, 23);
		contentPane.add(btnNewButton_4);
		
		lblError = new JLabel("Read The File Before Kombat");
		lblError.setForeground(Color.WHITE);
		lblError.setBounds(348, 350, 169, 14);
		contentPane.add(lblError);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 102));
		panel.setForeground(Color.WHITE);
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Display", TitledBorder.LEADING, TitledBorder.TOP, null, Color.WHITE));
		panel.setBounds(147, 57, 278, 97);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 102));
		panel_1.setForeground(Color.WHITE);
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Character Add", TitledBorder.LEADING, TitledBorder.TOP, null, Color.WHITE));
		panel_1.setBounds(443, 57, 278, 97);
		contentPane.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 0, 102));
		panel_2.setBorder(new TitledBorder(null, "Search And Delete", TitledBorder.LEADING, TitledBorder.TOP, null, Color.WHITE));
		panel_2.setBounds(147, 165, 573, 97);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("You Can Press Enter To Search Or Delete");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(10, 72, 553, 14);
		panel_2.add(lblNewLabel_3);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 860, 645);
		contentPane.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("kombat.jpg"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
