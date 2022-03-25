package main.front;

import main.back.Coffre;

import java.awt.*;
import javax.swing.*;

public class FenetreEtat extends JFrame implements Observateur{

	private JTextField txtEtat;

	public FenetreEtat()
	{
		setTitle("Etat du coffre");
		setBounds(500,500,190,130);
		Container contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		JLabel labEtat = new JLabel("ETAT");
		contentPane.add(labEtat);
		txtEtat = new JTextField(15);
		contentPane.add(txtEtat);
		setVisible(true);
		afficherEtat("Cache");
	}
	
	public void afficherEtat(String etat)
	{
		txtEtat.setText(etat);
	}

	@Override
	public void mettreAJour(Coffre coffre) {
		afficherEtat(coffre.nomEtat());
	}
}