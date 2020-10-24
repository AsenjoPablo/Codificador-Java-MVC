package codif;

public class CodifModel {

	public String Codificar(String mensaje) {

        String mensajeFinal = "";
		int codigoTrans;
		
		System.out.println("Generando identificador de codificación");
        int numeroAlAzar = (int) (Math.random() * 5)+ 1;
        System.out.println("\nResultado: " + numeroAlAzar+ "\n");

        switch (numeroAlAzar) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:

                for (int indice = 0; indice < mensaje.length(); indice++) {

                    if ((mensaje.charAt(indice) == ' ') || (mensaje.charAt(indice) == '.')
                            || (mensaje.charAt(indice) == ';') || (mensaje.charAt(indice) == ',')
                            || (mensaje.charAt(indice) == '¡') || (mensaje.charAt(indice) == '!')
                            || (mensaje.charAt(indice) == '¿') || (mensaje.charAt(indice) == '?'))

                    {
                        System.out.print(mensaje.charAt(indice));
                        mensajeFinal += mensaje.charAt(indice);
                    }

                    else {
                        int codigo = mensaje.charAt(indice);
                        int clave = numeroAlAzar;
                        codigoTrans = codigo + clave;
                        int mensajeTrans = (char) codigoTrans;
                        System.out.print((char) mensajeTrans);
                        mensajeFinal+=(char) mensajeTrans;
                    }
                }
                System.out.println("\n¡Secuencia codificada con éxito!");

            default:
                System.out.println("\nCerrando programa");

        }    
        return mensajeFinal;    
	}
}
