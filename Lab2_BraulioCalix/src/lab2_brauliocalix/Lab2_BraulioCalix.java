/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_brauliocalix;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Lab2_BraulioCalix {

    /**
     * @param args the command line arguments
     */
    static Scanner lea = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here
        int op = 0;
        while (op != 4) {
            System.out.println("1)registro de aviones\n2)manejo de trafico\n"
                    + "3)log in\n4)salir");
            op = lea.nextInt();
            switch (op) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("nos vemos");
                    break;
                default:
                    System.out.println("ingreso un valor invalido");
                    break;

            }

        }

    }

}
