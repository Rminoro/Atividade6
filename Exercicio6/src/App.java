import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
    Double Rcirculo, Acirculo;
    //pedir raio
    Scanner S = new Scanner(System.in);
    System.out.print("Digite o raio");
    Rcirculo= S.nextDouble();

    Acirculo = Math.PI*(Rcirculo*Rcirculo);

    System.out.print("Á área do círculo é igual a:" +Acirculo);


    }


}
