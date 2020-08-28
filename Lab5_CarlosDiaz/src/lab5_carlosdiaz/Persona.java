/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_carlosdiaz;

/**
 *
 * @author Diaz
 */
public class Persona {
    private String nacionalidad;
    private String nombre;
    private String apellido;
    private String genero;
    private int edad;
    private String vocacion;
    private boolean titulo;
    private boolean covid;

    public Persona() {
    }

    public Persona(String nacionalidad, String nombre, String apellido, String genero, int edad, String vocacion, boolean titulo, boolean covid) {
        this.nacionalidad = nacionalidad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.edad = edad;
        this.vocacion = vocacion;
        this.titulo = titulo;
        this.covid = covid;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getVocacion() {
        return vocacion;
    }

    public void setVocacion(String vocacion) {
        this.vocacion = vocacion;
    }

    public boolean isTitulo() {
        return titulo;
    }

    public void setTitulo(boolean titulo) {
        this.titulo = titulo;
    }

    public boolean isCovid() {
        return covid;
    }

    public void setCovid(boolean covid) {
        this.covid = covid;
    }

    @Override
    public String toString() {
        String r = nombre + " "+apellido +" vive en "+ nacionalidad +" " + genero + " " + edad + " " + vocacion;
        if(titulo==true){
            r += " tiene título ";
        } else if(titulo==false){
            r += " no tiene título ";
        }
        if(covid==true){
            r += "está infectado";
        } else if(covid==false){
            r += "no está infectado";
        }
        return r;
    }
    
}
