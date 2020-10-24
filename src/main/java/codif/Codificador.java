package codif;

public class Codificador {
    public static void main(String[] args) {
        CodifModel modelo = new CodifModel();
        CodifView vista = new CodifView();
        Controller controller = new Controller(modelo, vista);

        vista.setVisible(true);
    }
}
