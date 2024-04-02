import javax.swing.JOptionPane;

public class Ejercicio {

    public static void main(String[] args) {

        int dec;
        String binario, hex, oct;
        boolean verificado;

        do {
            binario = JOptionPane.showInputDialog("Ingrese un n�mero binario:");
            verificado = true;

            for (int i = 0; i < binario.length(); i++) {
                if (binario.charAt(i) != '1' && binario.charAt(i) != '0') {
                    verificado = false;
                }
            }

            if (verificado == false) {
                JOptionPane.showMessageDialog(null, "N�MERO INV�LIDO, INGRESE UNO V�LIDO");
            }

        } while (verificado == false);

        dec = (int) Long.parseLong(binario, 2);
        oct = Integer.toOctalString(dec);
        hex = Integer.toHexString(dec);

        JOptionPane.showMessageDialog(null, "El n�mero binario " + binario + " es:\n"
                + "en Decimal: " + dec + "\nen Octal: " + oct + "\nen Hexadecimal: " + hex);

    }
}