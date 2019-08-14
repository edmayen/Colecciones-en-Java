/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejocolecciones;
import java.util.*;

/**
 *
 * @author edmayen
 */
public class ManejoColecciones 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        List miLista=new ArrayList();
        miLista.add("1");
        miLista.add("2");
        miLista.add("3");
        miLista.add("4");
        /*las listas permiten agregar elementos repetidos
        ademas de que mantienen un orden.
        */
        miLista.add("4");
        imprimir(miLista);
        
        Set miSet=new HashSet();
        miSet.add("100");
        miSet.add("200");
        miSet.add("300");
        /*
        no permite elementos repetidos, lo ignora
        */
        miSet.add("300");
        imprimir(miSet);
        
        Map miMapa=new HashMap();
        //Llave, valor
        miMapa.put("1", "Juan");
        miMapa.put("2", "args");
        miMapa.put("3", "args");
        miMapa.put("4", "args");
        //Se imprimen todas las llaves 
        imprimir(miMapa.keySet());
        
        //para imprimir todos los valores
        imprimir(miMapa.values());
        
    }
    
    private static void imprimir(Collection coleccion)
    {
        coleccion.forEach((elemento) -> {
            System.out.println(elemento + " ");
        });
          System.out.println("");
    }
    
}
