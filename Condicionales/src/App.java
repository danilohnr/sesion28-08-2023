import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Sentencia condicional simple
        Scanner lector = new Scanner(System.in);
        System.out.print("Edad: ");
        byte edad = lector.nextByte();
        System.out.print("Sexo (f/m): ");
        char sexo = lector.next().charAt(0);
        if(edad <= 0){
            System.out.println("Ud no ha nacido.\nUd es un feto.");
        } else if (edad < 18){
            System.out.println("Usted es menor de edad.");            
        } else {
                System.out.println("Usted es mayor de edad");
        }
        lector.close();
    }
}

/* 
 * 1.Se le va a pedir al usuario que ingrese su edad, su sexo y si porta armas.
2.Evaluar los casos de edades negativas.
3.Si porta armas, no puede entrar a la disco.
4.Si la edad es menor a 18, no puede entrar a la disco.
5.Si es mujer y mayor de edad (mayor o igual a 18), puede entrar a la disco y 
consumir bebidas alcoholicas.
6.Si es varon y su edad està entre 18 y 21, puede entrar a la disco pero no 
consumir bebidas alcoholicas.
7.Si es varon y es mayor de 21, puede entrar a la disco y consumir bebidas 
alcoholicas.
*/