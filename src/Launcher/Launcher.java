/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Launcher;

import presentacion.Modelo;

/**
 *
 * @author Usuario
 */
public class Launcher {

    private Modelo miAplicacion;

    public Launcher() {
        miAplicacion = new Modelo();
        miAplicacion.iniciar();
    }

    public static void main(String[] args) {
        new Launcher();
    }

}
