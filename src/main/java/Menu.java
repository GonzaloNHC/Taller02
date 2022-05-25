import java.util.Scanner;

public class Menu {

    public void menu(){
        int opcion=-1;
        while(opcion!=3){

            String title="\t\t\tMENU PRINCIPAL\n\n\n";
            System.out.println(title);

            String descripcionOpciones="1-Ver estado de empresa"+
                    "\n"+"2-editar empresa"+
                    "\n"+"3-salir";

            System.out.println(descripcionOpciones);

            Scanner teclado = new Scanner(System.in);
            opcion = teclado.nextInt();

        }
    }

}
