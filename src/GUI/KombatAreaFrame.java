package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Inheritence.FictionalChar;
import SysAndMain.FictionalCharSys;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;

public class KombatAreaFrame extends JFrame {

	private JPanel contentPane;
	FictionalCharFrame fr = null;
	private JTextField txtFirst;
	private JTextField txtSecond;
	private JLabel Icon1;
	Credits cr = new Credits(this);
	
	ImageIcon AgentSmith = new ImageIcon("icons\\agentsmith.jpeg");
	ImageIcon Athena = new ImageIcon("icons\\athena.jpeg");
	ImageIcon Batman = new ImageIcon("icons\\batman.jpeg");
	ImageIcon Boo = new ImageIcon("icons\\boo.jpeg");
	ImageIcon DareDevil = new ImageIcon("icons\\daredevil.jpeg");
	ImageIcon DarthVader = new ImageIcon("icons\\darthvader.jpeg");
	ImageIcon DeadPool = new ImageIcon("icons\\deadpool.jpeg");
	ImageIcon DrStrange = new ImageIcon("icons\\drstrange.jpeg");
	ImageIcon Gandalf = new ImageIcon("icons\\gandalf.jpeg");
	ImageIcon HarryPotter = new ImageIcon("icons\\harrypotter.jpeg");
	ImageIcon It = new ImageIcon("icons\\it.jpeg");
	ImageIcon Joker = new ImageIcon("icons\\joker.jpeg");
	ImageIcon Poseidon = new ImageIcon("icons\\poseidon.jpeg");
	ImageIcon Ra = new ImageIcon("icons\\ra.png");
	ImageIcon Rick = new ImageIcon("icons\\rick.jpeg");
	ImageIcon Spiderman = new ImageIcon("icons\\spiderman.jpeg");
	ImageIcon SpongeBob = new ImageIcon("icons\\spongebob.jpeg");
	ImageIcon Thor = new ImageIcon("icons\\thor.jpeg");
	ImageIcon Toothless = new ImageIcon("icons\\toothless.jpeg");
	ImageIcon Custom = new ImageIcon("icons\\custom.png");
	private JLabel lblBg;
	private JLabel Icon2;
	private JLabel lblVersus;
	private JLabel lblInfo;
	private JButton btnNewButton_1;
	
	public KombatAreaFrame(FictionalCharFrame fcr) {
		setTitle("Kombat Area");
		fr = fcr;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 860, 518);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter 1st Character: ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(152, 106, 120, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblEnterstCharacter = new JLabel("Enter 2st Character: ");
		lblEnterstCharacter.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEnterstCharacter.setForeground(Color.WHITE);
		lblEnterstCharacter.setBounds(152, 131, 120, 14);
		contentPane.add(lblEnterstCharacter);
		
		txtFirst = new JTextField();
		txtFirst.setBounds(328, 103, 86, 20);
		contentPane.add(txtFirst);
		txtFirst.setColumns(10);
		
		txtSecond = new JTextField();
		txtSecond.setColumns(10);
		txtSecond.setBounds(328, 128, 86, 20);
		contentPane.add(txtSecond);
		
		JButton btnNewButton = new JButton("FIGHT!");
		btnNewButton.setFont(btnNewButton.getFont().deriveFont(btnNewButton.getFont().getStyle() | Font.BOLD));
		btnNewButton.setBackground(new Color(153, 102, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtFirst.getText().equals("") || txtSecond.getText().equals("")) {
					lblInfo.setText("PLEASE ENTER 2 CHARACTERS");
				}else if(txtFirst.getText().equals(txtSecond.getText()))
					lblInfo.setText("You can't choose same characters!");
				else {
					switch(txtFirst.getText()) {
					case "AgentSmith" : Icon1.setIcon(AgentSmith); break;
					case "Athena": Icon1.setIcon(Athena); break;
					case "Batman" : Icon1.setIcon(Batman); break;
					case "Boo" : Icon1.setIcon(Boo); break;
					case "DareDevil" : Icon1.setIcon(DareDevil); break;
					case "DarthVader": Icon1.setIcon(DarthVader); break;
					case "DeadPool": Icon1.setIcon(DeadPool); break;
					case "DrStrange" : Icon1.setIcon(DrStrange); break;
					case "Gandalf" : Icon1.setIcon(Gandalf); break;
					case "HarryPotter" : Icon1.setIcon(HarryPotter); break;
					case "It" : Icon1.setIcon(It); break;
					case "Joker" : Icon1.setIcon(Joker); break;
					case "Poseidon" : Icon1.setIcon(Poseidon); break;
					case "Ra" : Icon1.setIcon(Ra); break;
					case "Rick" : Icon1.setIcon(Rick); break;
					case "Spiderman" : Icon1.setIcon(Spiderman); break;
					case "SpongeBob" : Icon1.setIcon(SpongeBob); break;
					case "Thor" : Icon1.setIcon(Thor); break;
					case "Toothless" : Icon1.setIcon(Toothless); break;
					default: Icon1.setIcon(Custom); break;
					}
					switch(txtSecond.getText()) {
					case "AgentSmith" : Icon2.setIcon(AgentSmith); break;
					case "Athena": Icon2.setIcon(Athena); break;
					case "Batman" : Icon2.setIcon(Batman); break;
					case "Boo" : Icon2.setIcon(Boo); break;
					case "DareDevil" : Icon2.setIcon(DareDevil); break;
					case "DarthVader": Icon2.setIcon(DarthVader); break;
					case "DeadPool": Icon2.setIcon(DeadPool); break;
					case "DrStrange" : Icon2.setIcon(DrStrange); break;
					case "Gandalf" : Icon2.setIcon(Gandalf); break;
					case "HarryPotter" : Icon2.setIcon(HarryPotter); break;
					case "It" : Icon2.setIcon(It); break;
					case "Joker" : Icon2.setIcon(Joker); break;
					case "Poseidon" : Icon2.setIcon(Poseidon); break;
					case "Ra" : Icon2.setIcon(Ra); break;
					case "Rick" : Icon2.setIcon(Rick); break;
					case "Spiderman" : Icon2.setIcon(Spiderman); break;
					case "SpongeBob" : Icon2.setIcon(SpongeBob); break;
					case "Thor" : Icon2.setIcon(Thor); break;
					case "Toothless" : Icon2.setIcon(Toothless); break;
					default: Icon2.setIcon(Custom); break;
					}
					FictionalChar a = FictionalCharSys.search(txtFirst.getText());
					FictionalChar b = FictionalCharSys.search(txtSecond.getText());
					
					if(a.getPower() > b.getPower()) {
						lblInfo.setText(a.getName() + " Wins!!");
					}else if(b.getPower() > a.getPower())
						lblInfo.setText(b.getName() + " Wins!!");
					else
						lblInfo.setText("DRAW!!!");
					txtFirst.setText("");
					txtSecond.setText("");
				}
			}
		});
		btnNewButton.setBounds(443, 106, 140, 40);
		contentPane.add(btnNewButton);
		
		Icon1 = new JLabel("");
		Icon1.setBounds(61, 210, 212, 225);
		contentPane.add(Icon1);
		
		Icon2 = new JLabel("");
		Icon2.setBounds(593, 210, 241, 225);
		contentPane.add(Icon2);
		
		lblVersus = new JLabel("");
		lblVersus.setBounds(278, 193, 305, 235);
		contentPane.add(lblVersus);
		lblVersus.setIcon(new ImageIcon("icons\\versus.png"));
		
		lblInfo = new JLabel("SELECT FIGHTERS");
		lblInfo.setHorizontalAlignment(SwingConstants.CENTER);
		lblInfo.setBackground(new Color(0, 0, 0));
		lblInfo.setForeground(new Color(204, 0, 51));
		lblInfo.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblInfo.setBounds(0, 37, 847, 34);
		contentPane.add(lblInfo);
		
		JButton btnBack = new JButton("<- Back");
		btnBack.setBackground(new Color(153, 102, 0));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fr.setVisible(true);
				dispose();
			}
		});
		btnBack.setBounds(30, 11, 89, 23);
		contentPane.add(btnBack);
		
		btnNewButton_1 = new JButton("Finish ->");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cr.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBackground(new Color(153, 102, 0));
		btnNewButton_1.setBounds(729, 11, 89, 23);
		contentPane.add(btnNewButton_1);
		
		lblBg = new JLabel("");
		lblBg.setBounds(0, -21, 847, 505);
		contentPane.add(lblBg);
		lblBg.setIcon( new ImageIcon("fight.jpg"));
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
