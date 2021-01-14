package com.virtualpiano;

import java.awt.Button;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class VirtualPianoTest {

	private JFrame frame;
	private JTextField textField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VirtualPianoTest window = new VirtualPianoTest();
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
	public VirtualPianoTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 664, 474);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btn_1 = new JButton("C");
		btn_1.setBackground(Color.WHITE);
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream= AudioSystem.getAudioInputStream(new File("C:\\Users\\Admin\\Downloads\\Music_Note\\C.wav"));
					Clip clip= AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start(); }
					catch(Exception ex) {
						ex.printStackTrace();}
				String key= textField.getText()+btn_1.getText();
				textField.setText(key + " ");
				}
		});
		
		btn_1.setFont(new Font("Arial Narrow", Font.BOLD, 18));
		btn_1.setVerticalAlignment(SwingConstants.BOTTOM);
		btn_1.setBounds(42, 231, 59, 185);
		frame.getContentPane().add(btn_1);
		
		JButton btn_Q = new JButton("C#");
		btn_Q.setForeground(Color.WHITE);
		btn_Q.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {try {
				AudioInputStream audioInputStream= AudioSystem.getAudioInputStream(new File("C:\\Users\\Admin\\Downloads\\Music_Note\\C_s.wav"));
				Clip clip= AudioSystem.getClip();
				clip.open(audioInputStream);
				clip.start(); }
				catch(Exception ex) {
					ex.printStackTrace();}
				String key= textField.getText()+btn_Q.getText();
				textField.setText(key + " ");
				
			}
				
		});
		btn_Q.setFont(new Font("Arial Narrow", Font.BOLD, 14));
		btn_Q.setBackground(Color.BLACK);
		btn_Q.setBounds(64, 127, 59, 106);
		frame.getContentPane().add(btn_Q);
		
		textField = new JTextField("");
		textField.setToolTipText("Click a piano key...");
		textField.setFont(new Font("Arial Narrow", Font.BOLD, 14));
		textField.setBounds(64, 70, 501, 46);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		Button btn_clear = new Button("Clear");
		btn_clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btn_clear.setFont(new Font("Arial Narrow", Font.BOLD, 12));
		btn_clear.setBounds(571, 70, 52, 46);
		frame.getContentPane().add(btn_clear);
	}
}
