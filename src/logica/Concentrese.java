/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import presentacion.Modelo;

/**
 *
 * @author Usuario
 */
public class Concentrese {

    private final int[] tabla = new int[4];
    private int tablero[][];
    private int tablero2[][];
    private int arregloControlRepeticiones[];
    int arregloNumeroImagenes[];
    int cantidadclick, b, parejas, turnos;
    int posFil, posCol, contador = 0;

    public int[][] getTablero() {
        return tablero;
    }

    public int[] getTabla() {
        return tabla;
    }

    private void llenaArreglosConCeros(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = 0;
        }
    }

    public int getCantidadclick() {
        return cantidadclick;
    }

    public void setCantidadclick(int cantidadclick) {
        this.cantidadclick = cantidadclick;
    }

    private void inicializarArreglos(int a, int b) {

        llenaArreglosConCeros(arregloControlRepeticiones);
        llenaArreglosConCeros(arregloNumeroImagenes);

        Random r = new Random();//permite la generacion de numeros aleatorios
        int posicionImagen;
        for (int i = 0; i < b; i++) {

            posicionImagen = r.nextInt(a);//la posicionImagen tendra un valor aleatorio 
            /*Se valida que el numero aleatorio solo se repita 2 veces*/
            if (arregloControlRepeticiones[posicionImagen] < 2) {
                arregloNumeroImagenes[i] = posicionImagen + 1;//almacena el valor que representa cada imagen (la imagen se llama con su numero), se suma 1 porq si el numero es 0 entonces queda en 1
                arregloControlRepeticiones[posicionImagen]++;//si se almacena el numero entonces se aumenta el valor para que sepamos que ya existe 1 vez
            } else {
                i--;//en caso de que el numero se repita entonces se devuelve una iteraci�n para que pueda continuar pidiendo numeros
            }
        }

    }

    public void TableroFacil() {

        tablero = new int[4][5];
        tablero2 = new int[4][5];
        arregloControlRepeticiones = new int[10];
        arregloNumeroImagenes = new int[20];
        inicializarArreglos(10, 20);
        for (posFil = 0; posFil < 4; posFil++) {
            for (posCol = 0; posCol < 5; posCol++) {
                tablero[posFil][posCol] = 0;
                tablero2[posFil][posCol] = arregloNumeroImagenes[contador];
                contador++;

            }
        }

    }

    public void TableroMedio() {
        tablero = new int[6][6];
        tablero2 = new int[6][6];
        arregloControlRepeticiones = new int[18];
        arregloNumeroImagenes = new int[36];
        inicializarArreglos(18, 36);
        for (posFil = 0; posFil < 6; posFil++) {
            for (posCol = 0; posCol < 6; posCol++) {
                tablero[posFil][posCol] = 0;
                tablero2[posFil][posCol] = arregloNumeroImagenes[contador];
                contador++;
            }
        }
    }

    public void TableroDificil() {

        tablero = new int[5][12];
        tablero2 = new int[5][12];
        arregloControlRepeticiones = new int[30];
        arregloNumeroImagenes = new int[60];
        inicializarArreglos(30, 60);
        for (posFil = 0; posFil < 5; posFil++) {
            for (posCol = 0; posCol < 12; posCol++) {
                tablero[posFil][posCol] = 0;
                tablero2[posFil][posCol] = arregloNumeroImagenes[contador];
                System.out.println(arregloNumeroImagenes[contador]);
                contador++;
            }
        }
    }

    public void marcarCelda(int f, int c) throws Exception {

        if (tablero[f][c] == 0) {
            cantidadclick++;

            if (cantidadclick == 1) {

                tabla[0] = f;
                tabla[1] = c;
                tablero[f][c] = tablero2[f][c];
            }

            if (cantidadclick == 2) {
                tabla[2] = f;
                tabla[3] = c;

                tablero[f][c] = tablero2[f][c];
                if (tablero[tabla[0]][tabla[1]] != tablero[f][c]) {
                    System.out.println("No son iguales");
                    turnos++;
                } else {
                    parejas++;
                    tabla[0]=0;
                    tabla[1]=0;
                    tabla[2]=0;
                    tabla[3]=0;
                    System.out.println(parejas);
                    cantidadclick = 0;
                    turnos++;
                }
            }
            if (cantidadclick == 3) {
                tablero[tabla[0]][tabla[1]] = 0;
                tablero[tabla[2]][tabla[3]] = 0;
                cantidadclick = 0;

            }

        }
        if (verificarGanador()) {
            JOptionPane.showMessageDialog(null, "Felicidades el juego Termino en " + turnos + " Turnos");
        }
    }

    private boolean verificarGanador() {
        int a = tablero.length;
        if (a == 4 && parejas == 10) {
            return true;
        }
        if (a == 6 && parejas == 18) {
            return true;
        }
        if (a == 5 && parejas == 30) {
            return true;
        }

        return false;
    }

}
