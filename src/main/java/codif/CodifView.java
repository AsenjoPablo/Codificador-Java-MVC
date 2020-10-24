package codif;

import javax.swing.*;

import codif.Controller.CodifListener;

public class CodifView extends JFrame{

	private static final long serialVersionUID = 1L;

	private JLabel hintText;

    JTextField textoFinal;
	private JTextField textoOriginal;
	private JButton confirmarBtn;
	
	public CodifView () {
		hintText = new JLabel ("Por favor, introduzca una cadena de texto");
		textoOriginal = new JTextField ();
        confirmarBtn = new JButton("Codificar");
        textoFinal = new JTextField("Tu mensaje aparecerá aquí");

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        panel.add(hintText);
        panel.add(textoOriginal);
        panel.add(confirmarBtn);
        panel.add(textoFinal);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,300);
        this.add(panel);
    }
    
    public String getTextoOriginal () {
        return textoOriginal.getText();
    }

    public void setTextoFinal (String texto) {
        textoFinal.setText(texto);
    }

    void addCodifListener (CodifListener codifListener) {
        confirmarBtn.addActionListener(codifListener); 
    }

    void mostrarError (String msj) {
        JOptionPane.showMessageDialog(this, msj);
    }
}
