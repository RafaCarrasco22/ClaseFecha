/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebafecha;

import java.util.Scanner;

/**
 *
 * @author Rafael Carrasco Valencia
 */
public class PruebaFecha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        Fecha miFecha = new Fecha();
        Integer n;
        
        System.out.print("Ingrese un anio: ");
        Integer yyyy = entrada.nextInt();
        miFecha.setAnio(yyyy);        
        while(miFecha.valAnio()!=0){
            System.out.printf("Anio inexistente%nIngrese un anio: ");
            yyyy = entrada.nextInt();
            miFecha.setAnio(yyyy); 
        }
        System.out.printf("%nIngrese mes (1-12): ");
        Integer mm = entrada.nextInt();
        miFecha.setMes(mm);
        while(miFecha.valMes()!=0){
            System.out.printf("Mes inexistente%nIngrese mes (1-12): ");
            mm = entrada.nextInt();
            miFecha.setMes(mm);
        }
        System.out.printf("%nIngrese dia: ");
        Integer dd = entrada.nextInt();
        miFecha.setDia(dd);
        while(miFecha.valDia()!=0){
            System.out.printf("Dia inexistente%nIngrese dia: ");
            dd = entrada.nextInt();
            miFecha.setDia(dd);
        }        
        
        System.out.printf("%nLa fecha ingresada es:%n"+miFecha.getDia()+"/"+miFecha.getMes()+"/"+miFecha.getAnio()+"%n");
        System.out.printf("Seleccione de acuerdo a lo que necesita%n1)Aumentar 1 dia%n2)Disminuir 1 dia%n3)Aumentar N dias%n4)Disminuir N dias%nIngrese: ");
        int op = entrada.nextInt();
            switch(op){
                case 1:
                    System.out.printf("%nSi aumentamos un dia: ");
                    miFecha.aumentar();
                    miFecha.nuevaFecha();
                    break;
                case 2:
                    System.out.printf("%nSi restamos un dia: ");
                    miFecha.reducir();
                    miFecha.nuevaFecha();
                    break;
                case 3:
                    System.out.printf("Ingresa la cantidad de dias que deseas agregar: ");
                    n = entrada.nextInt();
                    for(int i=0;i<n;i++){
                        miFecha.aumentar();
                    }
                    miFecha.nuevaFecha();
                    break;
                case 4:
                    System.out.printf("Ingresa la cantidad de dias que deseas restar: ");
                    n = entrada.nextInt();
                    for(int i=0;i<n;i++){
                        miFecha.reducir();
                    }
                    miFecha.nuevaFecha();
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            
        }
    }
    
}
