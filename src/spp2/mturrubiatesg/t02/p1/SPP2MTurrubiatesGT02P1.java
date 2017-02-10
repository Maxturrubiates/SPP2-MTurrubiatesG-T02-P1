/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.mturrubiatesg.t02.p1;
import java.util.Scanner;
/**
 *
 * @author Max
 */
public class SPP2MTurrubiatesGT02P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Maximiliano Turrubiates González
        // A01410410
        // IDA
        Scanner Teclado = new Scanner (System.in); 
        double sue, sT;
        int cate,he;
        
        System.out.print("Introduce el sueldo base: $");
        sue= Teclado.nextDouble();
        System.out.println("Introduce la cantidad de horas extras trabajadas: ");
        he= Teclado.nextInt();
        System.out.println("Introduce la categoria del trabajador: ");
        cate= Teclado.nextInt();
        
        switch(cate) {
            case 1:
                sT= sue + (30*he);
                System.out.println("El sueldo total es de : $"+ sT);
                break;
            case 2:
                sT= sue + (38*he);
                System.out.println("El sueldo total es de : $"+ sT);
                break;
            case 3:
                sT= sue + (50*he);
                System.out.println("El sueldo total es de : $"+ sT);
                break;
            case 4:
                sT= sue + (70*he);
                System.out.println("El sueldo total es de : $"+ sT);
                break;
            default:
                System.out.println("No existe tal categoria.");
        }
    }
    
}
