package GUI;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Credits extends JFrame {

	private JPanel contentPane;
	KombatAreaFrame kf = null;
	
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Credits(KombatAreaFrame fr) {
		setTitle("Credits");
		kf = fr;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 797, 581);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Thank You For Playing");
		lblNewLabel.setForeground(new Color(153, 0, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(0, 91, 781, 63);
		contentPane.add(lblNewLabel);
		
		JLabel lblCreatedBy = new JLabel("Created By");
		lblCreatedBy.setForeground(new Color(255, 102, 0));
		lblCreatedBy.setHorizontalAlignment(SwingConstants.CENTER);
		lblCreatedBy.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblCreatedBy.setBounds(0, 165, 781, 63);
		contentPane.add(lblCreatedBy);
		
		JLabel lblZeynepHavvaYlmaz = new JLabel("Zeynep Havva Yılmaz");
		lblZeynepHavvaYlmaz.setForeground(new Color(255, 204, 0));
		lblZeynepHavvaYlmaz.setHorizontalAlignment(SwingConstants.CENTER);
		lblZeynepHavvaYlmaz.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblZeynepHavvaYlmaz.setBounds(0, 224, 781, 63);
		contentPane.add(lblZeynepHavvaYlmaz);
		
		JLabel lblisemBuseTorun = new JLabel("Çisem Buse Torun");
		lblisemBuseTorun.setForeground(new Color(255, 204, 0));
		lblisemBuseTorun.setHorizontalAlignment(SwingConstants.CENTER);
		lblisemBuseTorun.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblisemBuseTorun.setBounds(0, 285, 781, 63);
		contentPane.add(lblisemBuseTorun);
		
		JLabel lblDidehanTopsakal = new JLabel("Didehan Topsakal");
		lblDidehanTopsakal.setForeground(new Color(255, 204, 0));
		lblDidehanTopsakal.setHorizontalAlignment(SwingConstants.CENTER);
		lblDidehanTopsakal.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblDidehanTopsakal.setBounds(0, 349, 781, 63);
		contentPane.add(lblDidehanTopsakal);
		
		JLabel lblCanUmutDnmez = new JLabel("Can Umut Dönmez");
		lblCanUmutDnmez.setForeground(new Color(255, 204, 0));
		lblCanUmutDnmez.setHorizontalAlignment(SwingConstants.CENTER);
		lblCanUmutDnmez.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblCanUmutDnmez.setBounds(0, 411, 781, 63);
		contentPane.add(lblCanUmutDnmez);
		
		JLabel lblBg = new JLabel("");
		lblBg.setBounds(0, 0, 781, 542);
		contentPane.add(lblBg);
		lblBg.setIcon(new ImageIcon("credits.jpeg"));
	}

}
