package GUI;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSlider;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;

import Inheritence.*;
import SysAndMain.*;
import HasA.Buddy;
import java.awt.Color;
import java.awt.Font;

public class AddFrame extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtAge;
	private JTextField txtSpeed;
	private JTextField txtIntelligence;
	private JTextField txtRange;

	FictionalCharFrame cf = null;
	private JLabel lblSlider;
	private JTextArea txtArea;
	private JComboBox cmbC;
	private JComboBox cmbElement;
	private JComboBox cmbCharm;
	private JComboBox cmbBuddy;
	private JComboBox cmbEvilness;
	private JLabel txtEx;
	private JLabel txtBuddy;
	private JLabel txtInfo;
	private JLabel txtEvilness;
	private JLabel txtCharm;
	
	ImageIcon bg = new ImageIcon("addframe.jpeg");
	
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public AddFrame(JFrame fr) {
		setTitle("Add New Character");
		cf = (FictionalCharFrame)fr;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 691, 639);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name: ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(46, 88, 95, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAge.setForeground(Color.WHITE);
		lblAge.setBounds(46, 125, 95, 14);
		contentPane.add(lblAge);
		
		JLabel lblSpeed = new JLabel("Speed(0-10):");
		lblSpeed.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSpeed.setForeground(Color.WHITE);
		lblSpeed.setBounds(46, 157, 95, 14);
		contentPane.add(lblSpeed);
		
		JLabel lblHealthBar = new JLabel("Health Bar(0-100):");
		lblHealthBar.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblHealthBar.setForeground(Color.WHITE);
		lblHealthBar.setBounds(46, 193, 120, 14);
		contentPane.add(lblHealthBar);
		
		JLabel lblIntelligence = new JLabel("Intelligence(0-10):");
		lblIntelligence.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblIntelligence.setForeground(Color.WHITE);
		lblIntelligence.setBounds(46, 231, 120, 14);
		contentPane.add(lblIntelligence);
		
		JLabel lblRange = new JLabel("Range(0-100):");
		lblRange.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblRange.setForeground(Color.WHITE);
		lblRange.setBounds(46, 271, 95, 14);
		contentPane.add(lblRange);
		
		JLabel lblWeapon = new JLabel("Weapon:");
		lblWeapon.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblWeapon.setForeground(Color.WHITE);
		lblWeapon.setBounds(46, 309, 95, 14);
		contentPane.add(lblWeapon);
		
		txtName = new JTextField();
		txtName.setBounds(176, 92, 86, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		txtAge = new JTextField();
		txtAge.setBounds(176, 129, 86, 20);
		contentPane.add(txtAge);
		txtAge.setColumns(10);
		
		txtSpeed = new JTextField();
		txtSpeed.setBounds(176, 161, 86, 20);
		contentPane.add(txtSpeed);
		txtSpeed.setColumns(10);
		
		JSlider slider = new JSlider();
		slider.setBackground(new Color(0, 0, 102));
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblSlider.setText(Integer.toString(slider.getValue()));
			}
		});
		slider.setBounds(176, 192, 86, 26);
		contentPane.add(slider);
		
		txtIntelligence = new JTextField();
		txtIntelligence.setColumns(10);
		txtIntelligence.setBounds(176, 232, 86, 20);
		contentPane.add(txtIntelligence);
		
		txtRange = new JTextField();
		txtRange.setColumns(10);
		txtRange.setBounds(176, 272, 86, 20);
		contentPane.add(txtRange);
		
		JComboBox cmbW = new JComboBox();
		cmbW.setModel(new DefaultComboBoxModel(new String[] {"None", "Portal Gun", "Blue Flame", "Spatula", "Revolver", "Hypnotization", "Pistol", "LightSaber", "Web", "BatMobile", "Katana", "Stick", "Wand", "Magical Cape", "Mjolnir", "Dagger", "Baton", "The Trident"}));
		cmbW.setBounds(176, 309, 86, 22);
		contentPane.add(cmbW);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtName.getText().equals("") || txtAge.getText().equals("") || txtSpeed.getText().equals("") || txtIntelligence.getText().equals("") ||
						txtRange.getText().equals("") || cmbC.getSelectedItem().equals(""))
					txtArea.setText("Please Fill All Fields.");
				else {
					FictionalChar a;
					Buddy b;
					if(cmbBuddy.getSelectedItem().toString().equals("Morty"))
						b = new Buddy("Morty", 5);
					else if(cmbBuddy.getSelectedItem().toString().equals("Hiccup"))
						b = new Buddy("Hiccup", 9);
					else if(cmbBuddy.getSelectedItem().toString().equals("James"))
						b = new Buddy("James", 7);
					else
						b = new Buddy("Patrick", 3);
					b.calcLoyalty();
					
					switch(cmbC.getSelectedItem().toString()) {
					case "Wizard": a = new Wizard(txtName.getText(), Integer.parseInt(txtAge.getText()), Double.parseDouble(txtSpeed.getText()),
													slider.getValue(), Integer.parseInt(txtIntelligence.getText()), Integer.parseInt(txtRange.getText()),
													cmbW.getSelectedItem().toString(), cmbElement.getSelectedItem().toString()); break;
					case "Animation" : a = new Animation(txtName.getText(), Integer.parseInt(txtAge.getText()), Double.parseDouble(txtSpeed.getText()),
													slider.getValue(), Integer.parseInt(txtIntelligence.getText()), Integer.parseInt(txtRange.getText()),
													cmbW.getSelectedItem().toString(), cmbCharm.getSelectedItem().toString(), b);break;
					case "SuperHero": a = new SuperHero(txtName.getText(), Integer.parseInt(txtAge.getText()), Double.parseDouble(txtSpeed.getText()),
													slider.getValue(), Integer.parseInt(txtIntelligence.getText()), Integer.parseInt(txtRange.getText()),
													cmbW.getSelectedItem().toString()); break;
					case "Villain" : a = new Villain(txtName.getText(), Integer.parseInt(txtAge.getText()), Double.parseDouble(txtSpeed.getText()),
													slider.getValue(), Integer.parseInt(txtIntelligence.getText()), Integer.parseInt(txtRange.getText()),
													cmbW.getSelectedItem().toString(), cmbEvilness.getSelectedItem().toString()); break;
					case "Eternal" : a = new Eternal(txtName.getText(), Integer.parseInt(txtAge.getText()), Double.parseDouble(txtSpeed.getText()),
													slider.getValue(), Integer.parseInt(txtIntelligence.getText()), Integer.parseInt(txtRange.getText()),
													cmbW.getSelectedItem().toString()); break;
					default : a = null;
					}
					a.calcPower();
					FictionalCharSys.addChar(a, "Custom");
					txtArea.setText("Character Added.");
					cmbC.setSelectedIndex(0);
					txtName.setText("");
					txtAge.setText("");
					txtSpeed.setText("");
					slider.setValue(50);
					lblSlider.setText("50");
					txtIntelligence.setText("");
					txtRange.setText("");
					cmbW.setSelectedIndex(0);
				}
			}
		});
		
		btnNewButton.setBounds(46, 351, 191, 23);
		contentPane.add(btnNewButton);
		
		lblSlider = new JLabel("50");
		lblSlider.setForeground(Color.WHITE);
		lblSlider.setBounds(275, 197, 46, 14);
		contentPane.add(lblSlider);
		
		JButton btnNewButton_1 = new JButton("<- Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cf.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(46, 385, 191, 23);
		contentPane.add(btnNewButton_1);
		
		cmbC = new JComboBox();
		cmbC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cmbC.getSelectedItem().equals("Wizard")) {
					cmbElement.setEnabled(true);
					cmbCharm.setEnabled(false);
					cmbEvilness.setEnabled(false);
					cmbBuddy.setEnabled(false);
					txtInfo.setVisible(false);
				}else if(cmbC.getSelectedItem().equals("")) {
					cmbElement.setEnabled(false);
					cmbCharm.setEnabled(false);
					cmbEvilness.setEnabled(false);
					cmbBuddy.setEnabled(false);
					txtInfo.setVisible(false);
				}else if(cmbC.getSelectedItem().equals("Animation")) {
					cmbElement.setEnabled(false);
					cmbCharm.setEnabled(true);
					cmbEvilness.setEnabled(false);
					cmbBuddy.setEnabled(true);
					txtInfo.setVisible(false);
				}else if(cmbC.getSelectedItem().equals("SuperHero")) {
					cmbElement.setEnabled(false);
					cmbCharm.setEnabled(false);
					cmbEvilness.setEnabled(false);
					cmbBuddy.setEnabled(false);
					txtInfo.setVisible(true);
					txtInfo.setText("Super Hero Power will be calculated automatically.");
				}else if(cmbC.getSelectedItem().equals("Villain")) {
					cmbElement.setEnabled(false);
					cmbCharm.setEnabled(false);
					cmbEvilness.setEnabled(true);
					cmbBuddy.setEnabled(false);
					txtInfo.setVisible(false);
				}else if(cmbC.getSelectedItem().equals("Eternal")) {
					cmbElement.setEnabled(false);
					cmbCharm.setEnabled(false);
					cmbEvilness.setEnabled(false);
					cmbBuddy.setEnabled(false);
					txtInfo.setVisible(true);
					txtInfo.setText("God Mode will be calculated automatically.");
				}
			}
		});
		cmbC.setModel(new DefaultComboBoxModel(new String[] {"", "Wizard", "Animation", "SuperHero", "Villain", "Eternal"}));
		cmbC.setBounds(176, 40, 86, 22);
		contentPane.add(cmbC);
		
		JLabel lblNewLabel_1 = new JLabel("Class:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(46, 40, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		txtArea = new JTextArea();
		txtArea.setBounds(46, 420, 191, 138);
		contentPane.add(txtArea);
		
		txtEx = new JLabel("Element:\r\n");
		txtEx.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtEx.setForeground(Color.WHITE);
		txtEx.setBounds(331, 40, 116, 14);
		contentPane.add(txtEx);
		
		txtInfo = new JLabel("");
		txtInfo.setForeground(Color.WHITE);
		txtInfo.setBounds(331, 193, 314, 14);
		contentPane.add(txtInfo);
		
		cmbCharm = new JComboBox();
		cmbCharm.setModel(new DefaultComboBoxModel(new String[] {"Midi", "Cutie", "Illegal"}));
		cmbCharm.setBounds(468, 84, 177, 22);
		contentPane.add(cmbCharm);
		
		cmbBuddy = new JComboBox();
		cmbBuddy.setModel(new DefaultComboBoxModel(new String[] {"Morty", "Hiccup", "James", "Patrick"}));
		cmbBuddy.setBounds(468, 121, 177, 22);
		contentPane.add(cmbBuddy);
		
		cmbEvilness = new JComboBox();
		cmbEvilness.setModel(new DefaultComboBoxModel(new String[] {"Weak Evil", "Evil", "Pure Evil"}));
		cmbEvilness.setBounds(468, 160, 177, 22);
		contentPane.add(cmbEvilness);
		
		cmbElement = new JComboBox();
		cmbElement.setModel(new DefaultComboBoxModel(new String[] {"Fire", "Water", "Earth", "Air"}));
		cmbElement.setBounds(468, 36, 177, 22);
		contentPane.add(cmbElement);
		
		txtBuddy = new JLabel("Buddy:");
		txtBuddy.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtBuddy.setForeground(Color.WHITE);
		txtBuddy.setBounds(331, 125, 95, 14);
		contentPane.add(txtBuddy);
		
		txtEvilness = new JLabel("Evilness:");
		txtEvilness.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtEvilness.setForeground(Color.WHITE);
		txtEvilness.setBounds(331, 164, 95, 14);
		contentPane.add(txtEvilness);
		
		txtCharm = new JLabel("Charm: ");
		txtCharm.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtCharm.setForeground(Color.WHITE);
		txtCharm.setBounds(331, 88, 95, 14);
		contentPane.add(txtCharm);
		cmbElement.setEnabled(false);
		cmbCharm.setEnabled(false);
		cmbEvilness.setEnabled(false);
		cmbBuddy.setEnabled(false);
		
		JLabel lblBg = new JLabel("");
		lblBg.setBounds(0, 0, 675, 600);
		contentPane.add(lblBg);
		lblBg.setIcon(new ImageIcon("addframe.jpeg"));
		
	}
}
