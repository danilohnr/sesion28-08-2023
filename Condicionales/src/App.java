import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Sentencia condicional simple
        Scanner lector = new Scanner(System.in);
        System.out.print("Edad: ");
        byte edad = lector.nextByte();
        System.out.print("Sexo (f/m): ");
        char sexo = lector.next().charAt(0);
        if((edad == 5 || sexo == 'f') && (edad == 10 && sexo == 'm')){
            System.out.println("Linea 1 Dentro del if");
            System.out.println("Linea 2 Dentro del if ");
        } else {
            System.out.println("Dentro del else ");
        }
    }
}
