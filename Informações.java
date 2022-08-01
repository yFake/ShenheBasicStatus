package Shenhe;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Informações {			
	
	    JButton Botao;
	    JLabel Label;	 
	    
	    public static void main (String[] args) {	 							
				
		var Vida = "Vida Básica Lvl 90: 12993 ";
		var Atq = "ATQ Básico Lvl 90: 304";
		var Def = "DEF Básica Lvl 90: 830";
		var ATQ = "ATQ% Lvl 90: 28.8%";		
		
		ImageIcon Icone = new ImageIcon("C:\\Users\\PC01\\Documents\\Java SE Documentos\\[Icon]\\Informações.png");
		
		JLabel Label = new JLabel();
		Label.setIcon(Icone);	
		Label.setBounds(50, 110, 500, 400);
		Label.setVisible(false);								
		
		JFrame Janela = new JFrame();
		Janela.setSize(520,520);
	    Janela.getContentPane().setBackground(new Color(135, 175, 196));
		Janela.setTitle("Informações Shenhe");		
		Janela.setVisible(true);					
		Janela.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\PC01\\Documents\\Java SE Documentos\\[Icon]\\Shenhe.png"));					    		
		
    	JButton Botao = new JButton("Shenhe");
        Botao.setBounds(150, 90, 200, 50);               
        Botao.addActionListener(F -> System.out.println(Vida));
        Botao.addActionListener(F -> System.out.println(Atq));
        Botao.addActionListener(F -> System.out.println(Def));
        Botao.addActionListener(F -> System.out.println(ATQ));
        Botao.setFont(new Font("SansSerif", Font.ITALIC, 20));
        Botao.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 4, false));
        Botao.setForeground(new Color(0, 0, 0));
        Botao.setBackground(new Color(193, 240, 240));
        Botao.setFocusable(false);
        Botao.setHorizontalTextPosition(JButton.CENTER);       
        Botao.addActionListener(new ActionListener() {
        	
     	   public void actionPerformed(ActionEvent F) {
     		   Label.setVisible(true);
     		   Label.setEnabled(true);
     	     }   	   
          } 
      );
                       
        Janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     
        Janela.setLayout(null);
        Janela.setSize(500, 500);
        Janela.setVisible(true);
        Janela.add(Botao);
        Janela.add(Label);                                       
        
	  }
   }