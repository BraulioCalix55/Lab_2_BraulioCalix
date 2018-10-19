/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_brauliocalix;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

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
        int espera=0 ,listo=0;
        int log = 0;
        Aviones av = new Aviones();
        ArrayList<Aviones> aviones = new ArrayList();
        int op = 0;
        while (op != 4) {
            System.out.println("usuario admin\n contra admin");
            System.out.println("1)registro de aviones\n2)manejo de trafico\n"
                    + "3)log in\n4)salir");
            
            op = lea.nextInt();
            switch (op) {
                case 1:
                    System.out.println("bienvenido a registro");
                    System.out.println("eliga que opcion desea\n1)crear aviones\n"
                            + "2)leer aviones\n"
                            + "3)actualizar aviones"
                            + "\n4)borrar aviones");
                    int traba = lea.nextInt();
                    switch (traba) {
                        case 1:
                            if (log==1) {
                                System.out.println("ingrese el numero de modelo");
                                String modelo = lea.next();
                                System.out.println("ingrese el  codigo");
                                String codigo = lea.next();
                                System.out.println("ingrese la  fabrica");
                                String fabrica = lea.next();
                                System.out.println("ingrese el  anio de ingreso");
                                String anio = lea.next();
                                System.out.println("ingrese la  cantidad de pasajeros");
                                String pasas = lea.next();
                                System.out.println("ingrese la  capacidad de peso");
                                String peso = lea.next();
                                String hors = "0";
                                System.out.println("ingrese la cantidad de motores");
                                String mots = lea.next();
                                String estado = "estacionado";
                                System.out.println("ingrese el nombre del ingeniero");
                                String nombre = lea.next();
                                //                     (String numode, String codi, String fabrica, String ingreso, String cantidad, String pesomax, String horasvuelo, String numotores, String estado, String nombre) 
                                aviones.add(new Aviones(modelo, codigo, fabrica, anio, pasas, peso, hors, mots, estado, nombre));
                            } else {
                                System.out.println("no ha ininiado sesion ");
                            }
                            break;
                        case 2:
                            for (int i = 0; i < aviones.size(); i++) {
                                System.out.println(aviones.get(i).toString());
                            }
                            break;
                        case 3:
                            for (int i = 0; i < aviones.size(); i++) {
                                System.out.println(i + ")" + aviones.get(i));
                            }
                            System.out.println("ingrese la posicion del "
                                    + "avion que quiere modificar");
                            int posi = lea.nextInt();
                            System.out.println("ingrese que quiere modificar del avion");
                            /*  private int numode;
    private String codi;
    private int fabrica;
    private int ingreso private int cantidad;private int pesomax;private int horasvuelo;private int numotores;private String estado;private String nombre;*/
                            System.out.println("1)numero de modelo\n"
                                    + "2)codigo\n"
                                    + "3)fabrica\n"
                                    + "4)anio de ingreso\n"
                                    + "5)cantidad de pasajeros\n"
                                    + "6)capacidad de peso\n"
                                    + "7)cantidad de horas de vuelo\n"
                                    + "8)numero de motores\n"
                                    + "9)estado del avion\n"
                                    + "10)nombre del ingeniero\n");
                            int trabajo = lea.nextInt();
                            switch (trabajo) {
                                case 1:
                                    System.out.println("ingrese el nuevo numero de modelo");
                                    String modelon = lea.next();
                                    ((Aviones) aviones.get(posi)).setNumode(modelon);
                                    break;
                                case 2:
                                    System.out.println("ingrese el nuevo codigo");
                                    String codigon = lea.next();
                                    ((Aviones) aviones.get(posi)).setCodi(codigon);
                                    break;
                                case 3:
                                    System.out.println("ingrese la bueva fabrica");
                                    String fabrican = lea.next();
                                    ((Aviones) aviones.get(posi)).setFabrica(fabrican);
                                    break;
                                case 4:
                                    System.out.println("ingrese el nuevo anio de ingreso");
                                    String anion = lea.next();
                                    ((Aviones) aviones.get(posi)).setIngreso(anion);

                                    break;
                                case 5:
                                    System.out.println("ingrese la nueva cantidad de pasajeros");
                                    String pasasn = lea.next();
                                    ((Aviones) aviones.get(posi)).setCantidad(pasasn);
                                    break;
                                case 6:
                                    System.out.println("ingrese la nueva capacidad de peso");
                                    String peson = lea.next();
                                    ((Aviones) aviones.get(posi)).setPesomax(peson);
                                    break;
                                case 7:
                                    System.out.println("ingrese la cantidad de horas de vuelo");
                                    String cantn = lea.next();
                                    ((Aviones) aviones.get(posi)).setHorasvuelo(cantn);

                                    break;
                                case 8:
                                    System.out.println("ingrese la cantidad de motores");
                                    String motsn = lea.next();
                                    ((Aviones) aviones.get(posi)).setNumotores(motsn);
                                    break;
                                case 9:
                                    System.out.println("ingrese el estado del avion");
                                    String estadon = lea.next();
                                    ((Aviones) aviones.get(posi)).setEstado(estadon);
                                    break;
                                case 10:
                                    System.out.println("ingrese el nombre del ingeniero");
                                    String nombren = lea.next();
                                    ((Aviones) aviones.get(posi)).setNombre(nombren);
                                    break;
                                default:
                                    System.out.println("ingreso una opcion invalida");
                                    break;

                            }

                            break;
                        case 4:
                            for (int i = 0; i < aviones.size(); i++) {
                                System.out.println(i + ")" + aviones.get(i).toString());
                            }
                            System.out.println("ingrese la posicion del avion que quiere eliminar");
                            int avi = lea.nextInt();
                            aviones.remove(avi);
                            break;
                        default:
                            System.out.println("opcion invalida");
                            break;

                    }

                    break;
                case 2:    
                    //manejo de trafico
                    
                    if (log==1) {
                    for (int i = 0; i < aviones.size(); i++) {
                        System.out.println(i+")"+aviones.get(i).toString());
                    }
                    System.out.println("ingrese el valor del avion al que le quiere cambiar el estado");
                    int puesto=lea.nextInt();
                    String estado=((Aviones)aviones.get(puesto)).getEstado();
                    int cambio=lea.nextInt();
                    if (estado.equals("estacionado")) {
                        System.out.println("quiere cambiar el estado del avion de estacionado a en espera?1)si2)no");
                        cambio=lea.nextInt();
                        if (cambio==1) {
                            ((Aviones)aviones.get(puesto)).setEstado("en espera");
                            espera++;
                        }
                    }else if(estado.equals("en espera")){
                        System.out.println("quiere cambiar el estado del avion de en espera a listo?1)si2)no");
                        cambio=lea.nextInt();
                        if (espera>10) {
                            System.out.println("no se puede poner en espera porque supera el limite");
                        }else{
                        if (cambio==1) {
                            ((Aviones)aviones.get(puesto)).setEstado("listo");
                            listo++;
                            espera--;
                        }
                        }
                    }else if(estado.equals("listo")){
                        System.out.println("quiere cambiar le estado del avion de listo a en vuelo?1)si2)no");
                        cambio=lea.nextInt();
                        if (listo>5) {
                            System.out.println("no se puede poner listo porque supera el limite");
                        }
                        if (cambio==1) {
                            ((Aviones)aviones.get(puesto)).setEstado("en vuelo");
                            listo--;
                        }
                    }else if(estado.equals("en vuelo")){
                        System.out.println("quiere cambiar el estado del avion de en vuelo a estacionado1)si2)no");
                        cambio=lea.nextInt();
                        if (cambio==1) {
                            ((Aviones)aviones.get(puesto)).setEstado("estacionado");
                        }
                    }
                    
                    }else{
                        System.out.println("aun no ha iniciado sesion");
                    }
                    break;
                case 3:
                    System.out.println("ingrese el usuario");
                    String usu = lea.next();
                    System.out.println("ingrese la contrasenia");
                    String contra = lea.next();
                    if (usu.equals("admin") && contra.equals("admin")) {
                        log = 1;
                        System.out.println("se ingreso secion de forma correcta");
                    } else {
                        System.out.println("no se ingreso de forma correcta");
                    }
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
