
package examparcial;

import java.util.ArrayList;
import java.util.Scanner;


public class ExamParcial {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        TelefonoMovil telefonoMovil01 = new TelefonoMovil();
        telefonoMovil01 = setPantalla("4.7");
        telefonoMovil01 = setCamara("8MP");
        telefonoMovil01 = setProcesador("1.4Ghz");
        
        TelefonoMovil telefonoMovil02 = new TelefonoMovil();
        telefonoMovil01 = setPantalla("4.7");
        telefonoMovil01 = setCamara("8MP");
        telefonoMovil01 = setProcesador("1.4Ghz");
        
        TelefonoMovil telefonoMovil03 = new TelefonoMovil();
        telefonoMovil01 = setPantalla("4.7");
        telefonoMovil01 = setCamara("8MP");
        telefonoMovil01 = setProcesador("1.4Ghz");
        
        ArrayList ListadeTelefonos = new ArrayList();
        ListadeTelefonos.add("Pantalla");
        ListadeTelefonos.add("Camara");
        ListadeTelefonos.add("Procesador");
       
        
        
        
        
        System.out.println("Examen Parcial");
        System.out.println("Marco Antonio C.A.");
        System.out.println("");
        System.out.println("Catalogo de Telefonos:");
        System.out.println("");
        System.out.println("Telefonos Moviles");
        System.out.println("1.Sansung S7");
        System.out.println("2.iPhone 6");
        System.out.println("3.Huawei P8");
        System.out.println("Seleccione un Modelo:  ");
        
        char opcion = input.next().charAt(0);
        
        switch (opcion){
            case '1':
                System.out.println("PANTALLA    :   8.4\'");
                System.out.println("CAMARA      :   8MP\'");
                System.out.println("PROCESADOR  :   1.4\'");
                break;
            case '2':
                System.out.println("PANTALLA    :   8.4\'");
                System.out.println("CAMARA      :   8MP\'");
                System.out.println("PROCESADOR  :   1.4\'");
                break;
                
            case '3':
                System.out.println("PANTALLA    :   8.4\'");
                System.out.println("CAMARA      :   8MP\'");
                System.out.println("PROCESADOR  :   1.4\'");
                break;   
            
        }
    }

    

   
}
