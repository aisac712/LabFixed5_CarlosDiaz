/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_carlosdiaz;

import java.awt.Color;
import java.util.Date;

/**
 *
 * @author Diaz
 */
public class Pais {
    private String nombre;
    private Date fFundacion;
    private String nHimno;
    private Color color;

    public Pais() {
    }

    public Pais(String nombre, Date fFundacion, String nHimno, Color color) {
        this.nombre = nombre;
        this.fFundacion = fFundacion;
        this.nHimno = nHimno;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getfFundacion() {
        return fFundacion;
    }

    public void setfFundacion(Date fFundacion) {
        this.fFundacion = fFundacion;
    }

    public String getnHimno() {
        return nHimno;
    }

    public void setnHimno(String nHimno) {
        this.nHimno = nHimno;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return nombre + " fundado en" + fFundacion + " " + nHimno + " bandera color" + color;
    }
    
}
