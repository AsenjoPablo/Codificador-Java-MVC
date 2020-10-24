package codif;

import java.awt.event.*;

public class Controller {
    private CodifModel modelo;
    private CodifView vista;

    public Controller(CodifModel modelo, CodifView vista) {
        this.modelo = modelo;
        this.vista = vista;

        this.vista.addCodifListener(new CodifListener());
    }

    class CodifListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String textoOriginal;

            try {
                textoOriginal = vista.getTextoOriginal();
                vista.setTextoFinal(modelo.Codificar(textoOriginal));
            } catch (Exception ex) {
                System.out.println(ex);
                vista.mostrarError("Ha ocurrido un problema");
            }

        }

    }


}
