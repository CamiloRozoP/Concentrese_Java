/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.Timer;
import logica.Concentrese;

/**
 *
 * @author Usuario
 */
public class Modelo {

    private VentanaMenu ventanaMenu;
    private VentanaFacil ventanaFacil;
    private VentanaMedio ventanaMedio;
    private VentanaDificil ventanaDificil;
    private Timer timer;
    private Image imagenes[];
    private MediaTracker mt;
    private Concentrese juego;
    int b, c;

    public Modelo() {
        mt = new MediaTracker(null);
        imagenes = new Image[33];
        for (int i = 0; i < 32; i++) {
            imagenes[i] = (new ImageIcon(getClass().getResource("/imagenes/" + i + ".jpg"))).getImage();
            mt.addImage(imagenes[i], i);
        }
    }

    public VentanaMenu getVentanaMenu() {
        if (ventanaMenu == null) {
            ventanaMenu = new VentanaMenu(this);
        }
        return ventanaMenu;
    }

    public Timer getTimer() {

        if (timer == null) {

            timer = new Timer(5000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    verificarOcultar();
                }

            });

        }
        return timer;
    }

    private void verificarOcultar() {
        int x = juego.getTabla()[0];
        int y = juego.getTabla()[1];
        System.out.println(timer.getInitialDelay());
        if (getJuego().getTablero()[x][y] != 0) {
            getVentanaFacil().getLblTablero()[x][y].setIcon(new ImageIcon(imagenes[20]));
            juego.getTablero()[x][y] = 0;
            juego.setCantidadclick(0);

        }

    }

    public VentanaFacil getVentanaFacil() {
        if (ventanaFacil == null) {
            ventanaFacil = new VentanaFacil(this);
        }
        return ventanaFacil;
    }

    public VentanaMedio getVentanaMedio() {
        if (ventanaMedio == null) {
            ventanaMedio = new VentanaMedio(this);
        }
        return ventanaMedio;
    }

    public VentanaDificil getVentanaDificil() {
        if (ventanaDificil == null) {
            ventanaDificil = new VentanaDificil(this);
        }
        return ventanaDificil;
    }

    public Concentrese getJuego() {
        if (juego == null) {
            juego = new Concentrese();

        }
        return juego;
    }

    public void iniciar() {
        System.out.println("Se creo el modelo");
        getVentanaMenu().setSize(320, 420);
        getVentanaMenu().setVisible(true);
        getTimer();
    }

    public void Crear(JLabel etiqueta) {

        getVentanaMenu().setVisible(false);
        String posicion = etiqueta.getName();
        int simbolo = 0;
        System.out.println("Posicion" + posicion);
        if (posicion.equals("Facil")) {
            getVentanaFacil().setSize(500, 500);
            getVentanaFacil().setVisible(true);
            getJuego().TableroFacil();

        }
        if (posicion.equals("Medio")) {
            getVentanaMedio().setSize(600, 600);
            getVentanaMedio().setVisible(true);
            getJuego().TableroMedio();

        }
        if (posicion.equals("Dificil")) {
            getVentanaDificil().setSize(1000, 600);
            getVentanaDificil().setVisible(true);
            getJuego().TableroDificil();
            System.out.println("se creo un juego dificil");

        }
        try {
            String p[] = posicion.split(",");
            getJuego().marcarCelda(Integer.parseInt(p[0]), Integer.parseInt(p[1]));
        } catch (Exception ex) {
            String msg = ex.getMessage();
            return;
        }

        int clicks = juego.getCantidadclick();
        if (clicks == 1) {
            getTimer().start();

        }
        if (clicks == 2) {
            getTimer().stop();
        }
        int a = getJuego().getTablero().length;
        if (a == 4) {
            b = 5;
        }
        if (a == 6) {
            b = 6;
        }
        if (a == 5) {
            b = 12;
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {

                switch (getJuego().getTablero()[i][j]) {
                    case 0:
                        simbolo = 20;
                        break;
                    case 1:
                        simbolo = 1;
                        break;
                    case 2:
                        simbolo = 2;
                        break;
                    case 3:
                        simbolo = 3;
                        break;
                    case 4:
                        simbolo = 4;
                        break;
                    case 5:
                        simbolo = 5;
                        break;
                    case 6:
                        simbolo = 6;
                        break;
                    case 7:
                        simbolo = 7;
                        break;
                    case 8:
                        simbolo = 8;
                        break;
                    case 9:
                        simbolo = 9;
                        break;
                    case 10:
                        simbolo = 10;
                        break;
                    case 11:
                        simbolo = 11;
                        break;
                    case 12:
                        simbolo = 12;
                        break;
                    case 13:
                        simbolo = 13;
                        break;
                    case 14:
                        simbolo = 14;
                        break;
                    case 15:
                        simbolo = 15;
                        break;
                    case 16:
                        simbolo = 16;
                        break;
                    case 17:
                        simbolo = 17;
                        break;
                    case 18:
                        simbolo = 18;
                        break;
                    case 19:
                        simbolo = 19;
                        break;
                    case 20:
                        simbolo = 31;
                        break;
                    case 21:
                        simbolo = 21;
                        break;
                    case 22:
                        simbolo = 22;
                        break;
                    case 23:
                        simbolo = 23;
                        break;
                    case 24:
                        simbolo = 24;
                        break;
                    case 25:
                        simbolo = 25;
                        break;
                    case 26:
                        simbolo = 26;
                        break;
                    case 27:
                        simbolo = 27;
                        break;
                    case 28:
                        simbolo = 28;
                        break;
                    case 29:
                        simbolo = 29;
                        break;
                    case 30:
                        simbolo = 30;
                        break;                       
                     case 31:
                        simbolo = 32;
                        break;

                }
                if (a == 4) {
                    getVentanaFacil().getLblTablero()[i][j].setIcon(new ImageIcon(imagenes[simbolo]));
                }
                if (a == 6) {
                    getVentanaMedio().getLblTablero()[i][j].setIcon(new ImageIcon(imagenes[simbolo]));
                }
                if (a == 5) {
                    getVentanaDificil().getLblTablero()[i][j].setIcon(new ImageIcon(imagenes[simbolo]));
                }
            }
        }
    }

}
