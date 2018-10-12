import java.io.File;
import java.io.FileNotFoundException; //objeto que contiene la informacion del objeto
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException { //throws lanza una excepcion
        File entrada=new File("entrada.txt");
        Scanner escaner=new Scanner(entrada); //lee el archivo de entrada
        double total=0;
        while(escaner.hasNext()) { //hasNext si aun hay algo en el archivo
            total=total+ escaner.nextDouble();
        }
        System.out.println(total);
    }
}
 //mover el archivo a la carpeta principal