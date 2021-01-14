package com.virtualpiano;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.*;
import java.io.*;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Button;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 * This is a simple virtual piano application.
 * Acts like the real piano but only show some keys/part of the piano.
 * @author Johanna Marie Quitoviera
 *
 */
public class VirtualPiano{
    
	private JFrame frame;
	private JTextField textField;
	/**
	 * Launch the application.
	 * Main method of the application.
	 * @param args array of string arguments.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VirtualPiano window = new VirtualPiano();
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
	public VirtualPiano() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * Make the piano keys, text field that shows the key, clear button and the label
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 664, 474);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//buttons with names btn_Q/W/E/R/T/Y/U are the black keys of the piano and are initialized, customized and with their specific commands.
		JButton btn_Q = new JButton("C#");
		btn_Q.setForeground(Color.WHITE);
		btn_Q.addActionListener(new ActionListener() {
			//method for when the key is clicked 
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream= AudioSystem.getAudioInputStream(new File("C:\\Users\\Admin\\Downloads\\Music_Note\\C_s.wav"));
					Clip clip= AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
					System.out.println("You clicked a C# key"); }
					catch(Exception ex) {
						ex.printStackTrace();
						}
				//For showing the key clicked in the text field/screen of the application
				String key= textField.getText()+btn_Q.getText(); 
				textField.setText(key + " ");
			}
				
		});
		btn_Q.setFont(new Font("Arial Narrow", Font.BOLD, 14));
		btn_Q.setBackground(Color.BLACK);
		btn_Q.setBounds(64, 127, 59, 106);
		frame.getContentPane().add(btn_Q);
		
		JButton btn_W = new JButton("D#");
		btn_W.setForeground(Color.WHITE);
		btn_W.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream= AudioSystem.getAudioInputStream(new File("C:\\Users\\Admin\\Downloads\\Music_Note\\D_s.wav"));
					Clip clip= AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
					System.out.println("You clicked a D# key"); } 
					catch(Exception ex) {
						ex.printStackTrace();
					}
				String key= textField.getText()+btn_W.getText();
				textField.setText(key + " ");
			}
		});
		btn_W.setFont(new Font("Arial Narrow", Font.BOLD, 14));
		btn_W.setBackground(Color.BLACK);
		btn_W.setBounds(133, 127, 59, 106);
		frame.getContentPane().add(btn_W);
		
		JButton btn_E = new JButton("F#");
		btn_E.setForeground(Color.WHITE);
		btn_E.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream= AudioSystem.getAudioInputStream(new File("C:\\Users\\Admin\\Downloads\\Music_Note\\F_s.wav"));
					Clip clip= AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
					System.out.println("You clicked a F# key");}
					catch(Exception ex) {
						ex.printStackTrace();
					}
				String key= textField.getText()+btn_E.getText();
				textField.setText(key + " ");
			}
		});
		btn_E.setFont(new Font("Arial Narrow", Font.BOLD, 14));
		btn_E.setBackground(Color.BLACK);
		btn_E.setBounds(233, 127, 59, 106);
		frame.getContentPane().add(btn_E);
		
		JButton btn_R = new JButton("G#");
		btn_R.setForeground(Color.WHITE);
		btn_R.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream= AudioSystem.getAudioInputStream(new File("C:\\Users\\Admin\\Downloads\\Music_Note\\G_s.wav"));
					Clip clip= AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
					System.out.println("You clicked a G# key");}
					catch(Exception ex) {
						ex.printStackTrace();
					}
				String key= textField.getText()+btn_R.getText();
				textField.setText(key + " ");
			}
		});
		btn_R.setFont(new Font("Arial Narrow", Font.BOLD, 14));
		btn_R.setBackground(Color.BLACK);
		btn_R.setBounds(302, 127, 59, 106);
		frame.getContentPane().add(btn_R);
		
		JButton btn_T = new JButton("A#");
		btn_T.setForeground(Color.WHITE);
		btn_T.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream= AudioSystem.getAudioInputStream(new File("C:\\Users\\Admin\\Downloads\\Music_Note\\Bb.wav"));
					Clip clip= AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
					System.out.println("You clicked a A# key");}
					catch(Exception ex) {
						ex.printStackTrace();
					}
				String key= textField.getText()+btn_T.getText();
				textField.setText(key + " ");
			}
		});
		btn_T.setFont(new Font("Arial Narrow", Font.BOLD, 14));
		btn_T.setBackground(Color.BLACK);
		btn_T.setBounds(371, 127, 59, 106);
		frame.getContentPane().add(btn_T);
		
		JButton btn_Y = new JButton("C1#");
		btn_Y.setForeground(Color.WHITE);
		btn_Y.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream= AudioSystem.getAudioInputStream(new File("C:\\Users\\Admin\\Downloads\\Music_Note\\C_s1.wav"));
					Clip clip= AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
					System.out.println("You clicked a C1# key");}
					catch(Exception ex) {
						ex.printStackTrace();
					}
				String key= textField.getText()+btn_Y.getText();
				textField.setText(key + " ");
			}
		});
		btn_Y.setFont(new Font("Arial Narrow", Font.BOLD, 14));
		btn_Y.setBackground(Color.BLACK);
		btn_Y.setBounds(457, 127, 59, 106);
		frame.getContentPane().add(btn_Y);
		
		
		JButton btn_U = new JButton("D1#");
		btn_U.setForeground(Color.WHITE);
		btn_U.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream= AudioSystem.getAudioInputStream(new File("C:\\Users\\Admin\\Downloads\\Music_Note\\D_s1.wav"));
					Clip clip= AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
					System.out.println("You clicked a D1# key");}
					catch(Exception ex) {
						ex.printStackTrace();
					}
				String key= textField.getText()+btn_U.getText();
				textField.setText(key + " ");
			}
		});
		btn_U.setFont(new Font("Arial Narrow", Font.BOLD, 14));
		btn_U.setBackground(Color.BLACK);
		btn_U.setBounds(526, 127, 59, 106);
		frame.getContentPane().add(btn_U);
		
		//buttons with names btn_1/2/3/4/5/6/7/8/9/0 are the white keys of the piano, initialized, customized and with their specific commands.
		JButton btn_1 = new JButton("C");
		btn_1.setBackground(Color.WHITE);
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream= AudioSystem.getAudioInputStream(new File("C:\\Users\\Admin\\Downloads\\Music_Note\\C.wav"));
					Clip clip= AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
					System.out.println("You clicked a C key");}
					catch(Exception ex) {
						ex.printStackTrace();
					}
				String key= textField.getText()+btn_1.getText();
				textField.setText(key + " ");
			}
		});
		
		btn_1.setFont(new Font("Arial Narrow", Font.BOLD, 18));
		btn_1.setVerticalAlignment(SwingConstants.BOTTOM);
		btn_1.setBounds(42, 231, 59, 185);
		frame.getContentPane().add(btn_1);
		
		JButton btn_2 = new JButton("D");
		btn_2.setBackground(Color.WHITE);
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream= AudioSystem.getAudioInputStream(new File("C:\\Users\\Admin\\Downloads\\Music_Note\\D.wav"));
					Clip clip= AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
					System.out.println("You clicked a D key");}
					catch(Exception ex) {
						ex.printStackTrace();
					}
				String key= textField.getText()+btn_2.getText();
				textField.setText(key + " ");
			}
		});
		btn_2.setVerticalAlignment(SwingConstants.BOTTOM);
		btn_2.setFont(new Font("Arial Narrow", Font.BOLD, 18));
		btn_2.setBounds(99, 231, 59, 185);
		frame.getContentPane().add(btn_2);
		
		JButton btn_3 = new JButton("E");
		btn_3.setBackground(Color.WHITE);
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream= AudioSystem.getAudioInputStream(new File("C:\\Users\\Admin\\Downloads\\Music_Note\\E.wav"));
					Clip clip= AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
					System.out.println("You clicked a E key");}
					catch(Exception ex) {
						ex.printStackTrace();
					}
				String key= textField.getText()+btn_3.getText();
				textField.setText(key + " ");
			}
		});
		btn_3.setVerticalAlignment(SwingConstants.BOTTOM);
		btn_3.setFont(new Font("Arial Narrow", Font.BOLD, 18));
		btn_3.setBounds(154, 231, 59, 185);
		frame.getContentPane().add(btn_3);
		
		JButton btn_4 = new JButton("F");
		btn_4.setBackground(Color.WHITE);
		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream= AudioSystem.getAudioInputStream(new File("C:\\Users\\Admin\\Downloads\\Music_Note\\F.wav"));
					Clip clip= AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
					System.out.println("You clicked a F key");}
					catch(Exception ex) {
						ex.printStackTrace();
					}
				String key= textField.getText()+btn_4.getText();
				textField.setText(key + " ");
			}
		});
		btn_4.setVerticalAlignment(SwingConstants.BOTTOM);
		btn_4.setFont(new Font("Arial Narrow", Font.BOLD, 18));
		btn_4.setBounds(210, 231, 59, 185);
		frame.getContentPane().add(btn_4);
		
		JButton btn_5 = new JButton("G");
		btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream= AudioSystem.getAudioInputStream(new File("C:\\Users\\Admin\\Downloads\\Music_Note\\G.wav"));
					Clip clip= AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
					System.out.println("You clicked a G key");}
					catch(Exception ex) {
						ex.printStackTrace();
					}
				String key= textField.getText()+btn_5.getText();
				textField.setText(key + " ");
			}
		});
		btn_5.setVerticalAlignment(SwingConstants.BOTTOM);
		btn_5.setFont(new Font("Arial Narrow", Font.BOLD, 18));
		btn_5.setBackground(Color.WHITE);
		btn_5.setBounds(266, 231, 59, 185);
		frame.getContentPane().add(btn_5);
		
		JButton btn_6 = new JButton("A");
		btn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream= AudioSystem.getAudioInputStream(new File("C:\\Users\\Admin\\Downloads\\Music_Note\\A.wav"));
					Clip clip= AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
					System.out.println("You clicked a A key");}
					catch(Exception ex) {
						ex.printStackTrace();
					}
				String key= textField.getText()+btn_6.getText();
				textField.setText(key + " ");
			}
		});
		btn_6.setVerticalAlignment(SwingConstants.BOTTOM);
		btn_6.setFont(new Font("Arial Narrow", Font.BOLD, 18));
		btn_6.setBackground(Color.WHITE);
		btn_6.setBounds(321, 231, 59, 185);
		frame.getContentPane().add(btn_6);
		
		JButton btn_7 = new JButton("B");
		btn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream= AudioSystem.getAudioInputStream(new File("C:\\Users\\Admin\\Downloads\\Music_Note\\B.wav"));
					Clip clip= AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
					System.out.println("You clicked a B key");}
					catch(Exception ex) {
						ex.printStackTrace();
					}
				String key= textField.getText()+btn_7.getText();
				textField.setText(key + " ");
			}
		});
		btn_7.setVerticalAlignment(SwingConstants.BOTTOM);
		btn_7.setFont(new Font("Arial Narrow", Font.BOLD, 18));
		btn_7.setBackground(Color.WHITE);
		btn_7.setBounds(377, 231, 59, 185);
		frame.getContentPane().add(btn_7);
		
		JButton btn_8 = new JButton("C1");
		btn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream= AudioSystem.getAudioInputStream(new File("C:\\Users\\Admin\\Downloads\\Music_Note\\C1.wav"));
					Clip clip= AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
					System.out.println("You clicked a C1 key");}
					catch(Exception ex) {
						ex.printStackTrace();
					}
				String key= textField.getText()+btn_8.getText();
				textField.setText(key + " ");
			}
		});
		btn_8.setVerticalAlignment(SwingConstants.BOTTOM);
		btn_8.setFont(new Font("Arial Narrow", Font.BOLD, 18));
		btn_8.setBackground(Color.WHITE);
		btn_8.setBounds(434, 231, 59, 185);
		frame.getContentPane().add(btn_8);
		
		JButton btn_9 = new JButton("D1");
		btn_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream= AudioSystem.getAudioInputStream(new File("C:\\Users\\Admin\\Downloads\\Music_Note\\D1.wav"));
					Clip clip= AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
					System.out.println("You clicked a D1 key");}
					catch(Exception ex) {
						ex.printStackTrace();
					}
				String key= textField.getText()+btn_9.getText();
				textField.setText(key + " ");
				
			}
		});
		btn_9.setVerticalAlignment(SwingConstants.BOTTOM);
		btn_9.setFont(new Font("Arial Narrow", Font.BOLD, 18));
		btn_9.setBackground(Color.WHITE);
		btn_9.setBounds(491, 231, 59, 185);
		frame.getContentPane().add(btn_9);
		
		JButton btn_0 = new JButton("E1");
		btn_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				try {
					AudioInputStream audioInputStream= AudioSystem.getAudioInputStream(new File("C:\\Users\\Admin\\Downloads\\Music_Note\\E1.wav"));
					Clip clip= AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
					System.out.println("You clicked a E1 key");}
					catch(Exception ex) {
						ex.printStackTrace();
					}
				String key= textField.getText()+btn_0.getText();
				textField.setText(key + " ");
			}
		});
		btn_0.setVerticalAlignment(SwingConstants.BOTTOM);
		btn_0.setFont(new Font("Arial Narrow", Font.BOLD, 18));
		btn_0.setBackground(Color.WHITE);
		btn_0.setBounds(548, 231, 59, 185);
		frame.getContentPane().add(btn_0);
		
		//Label in the frame of the program
		JLabel lblNewLabel = new JLabel("Simple Virtual Piano");
		lblNewLabel.setFont(new Font("Arial Narrow", Font.PLAIN, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(197, 26, 258, 33);
		frame.getContentPane().add(lblNewLabel);
		
		//Making a text field that shows the key that you clicked.
		textField = new JTextField("");
		textField.setToolTipText("Click a piano key...");
		textField.setFont(new Font("Arial Narrow", Font.BOLD, 14));
		textField.setBounds(64, 70, 501, 46);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		//Making a clear button that sets the text inside the text field into null or be erased when the button is clicked.
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
//Code by Johanna Marie Quitoviera
//A Simple Virtual Piano