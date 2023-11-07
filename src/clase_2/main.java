/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author crist
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> listaAlumnos = new ArrayList<>();
        List<String>listaAnimales = new ArrayList<>(Arrays.asList("leon","tigre","oso","lobo","pantera"));
        listaAlumnos.add("cristian");
        listaAlumnos.add("jesica");
        listaAlumnos.add("damian");
        listaAlumnos.add("pablo");
        listaAlumnos.add("angelica");
        
        Conversion conversion = (elemento)->elemento.toUpperCase();
        for(String lista:listaAlumnos){
             System.out.println("mayusculas: " + conversion.convertir(lista));
                   
        }
        System.out.println("");
      
        for(String lista:listaAnimales){
             System.out.println("mayusculas: " + conversion.convertir(lista));
                   
        }
    }
    
}
