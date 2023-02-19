/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios06.ejercicio3;

import java.util.ArrayList;

/**
 *
 * @author DAW
 */
public class PrincipalConcurso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Crear uno
        Concurso concurso1=new Concurso("Skill Cartagena", 2);
        Concurso concurso2=new Concurso("Skill Mula", 4);
        Concurso concurso3=new Concurso("Skill Bullas ", 3);
        
        ArrayList<Concurso> listaConcursos=new ArrayList<>();
        
        listaConcursos.add(concurso1);
        listaConcursos.add(concurso2);
        listaConcursos.add(concurso3);
        
        
        ArrayList<String> aq=new ArrayList<>();
        
        for (Concurso c : listaConcursos) {
            c.addEquipo("TorreVieja","PuertoNuevo","CasasViejas");
            aq = c.getListaEquipo(); 
        }
        
      
        
        
        
        
                
                
    }
    
}
