/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase_1;

/**
 *
 * @author crist
 */
public class Alumno extends Persona {
    private int idAlumno;
    private int legajo;
    

    public Alumno() {
    }

    public Alumno(int idAlumno, int legajo) {
        this.idAlumno = idAlumno;
        this.legajo = legajo;
    }

    public Alumno(int idAlumno, int legajo, String nombre, int dni, int telefono, String direccion) {
        super(nombre, dni, telefono, direccion);
        this.idAlumno = idAlumno;
        this.legajo = legajo;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }
    
    
}
