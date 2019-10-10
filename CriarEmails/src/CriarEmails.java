import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class CriarEmails extends Applet implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	TextField txtPrimeiroNome =new TextField();
	TextField txtSegundoNome=new TextField();
	Label lblPrimeiroNome = new Label("Primeiro Nome");
	Label lblSegundoNome = new Label("Segundo Nome");
	Button btnResultado=new Button("Email");
	Label lblEmail = new Label("Email:");
	Label lblResultado = new Label("");
	
	public CriarEmails() { 
		setBackground(Color.yellow);
		setLayout(new GridLayout(5,2));
		add(lblPrimeiroNome);
		add(txtPrimeiroNome);
		add(lblSegundoNome);
		add(txtSegundoNome);
		add(lblEmail);
		add(lblResultado);
		add(btnResultado);
		
		
		//btnResultado.addActionListener(this);
		
		btnResultado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Email=txtPrimeiroNome.getText()+"."+txtSegundoNome.getText()+"@empresa.pt";
				lblResultado.setText(Email);
				JOptionPane.showMessageDialog(null, "Qualque email" + Email, "Applet", 1);
			}
		});

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
//	public void actionPerformed(ActionEvent e) {
//		String Email=txtPrimeiroNome.getText()+"."+txtSegundoNome.getText()+"@empresa.pt";
//		lblResultado.setText(Email);
//	}

}
