import java.util.Scanner;

public class App{
    public static void main(String [] args){
        ListArrayOfInteger lista = new ListArrayOfInteger();
        int tam = lista.size();
        while (tam<10){
        Scanner teclado = new Scanner(System.in);
        int i = teclado.nextInt();
        lista.add(i);
        }
        System.out.println(lista.get(0));
        System.out.println(lista.isEmpty());
    }
}
