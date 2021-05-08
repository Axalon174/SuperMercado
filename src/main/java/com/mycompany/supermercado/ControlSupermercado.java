package com.mycompany.supermercado;

import com.mycompany.supermercado.Cliente;
import com.mycompany.supermercado.Producto;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class ControlSupermercado {
    
    public static ArrayList <Producto> producto = new ArrayList <Producto>();
            
    private ArrayList <Cliente> cliente = new ArrayList <Cliente> ();
    
  public static void addProducto(Producto p){
      producto.add(p);
      
  }
  public static void removeProducto(String cadena){
      
      boolean encontrado=false;
      int pivote = 0;
      while (encontrado=false){
          if(producto.get(pivote).getNombre().compareTo(cadena)==0){
              System.out.println("gf");
              encontrado = true;
             
          }else{
              pivote++;
              System.out.println("s");
          }
          if(encontrado){
              System.out.println("Se ha encontrado");
              producto.remove(pivote);
              System.out.println(producto);
              
          }
      }
      
   
  }
  public static void listaProducto(){
      JOptionPane.showMessageDialog(null,producto);
}
  
    public static void main(String[] args) {
        addProducto(new Producto("Lalechera","5704b","patito",57.04,1));
        addProducto(new Producto("tupack","57048","patito",1.14,5));
        System.out.println(producto);
        listaProducto();
        removeProducto("tupack");
        System.out.println("&&&&&&&");
        
        boolean encontrado=false;
        for (int i = 0; encontrado == false&&i<producto.size(); i++) {
            if(producto.get(i).getNombre().equals("tupack")){
                System.out.println("Se ha encontrado");
                producto.remove(i);
            }else{
                
            }if(encontrado==true){
                    listaProducto();
                }
        }
      int pivote = 0;
      System.out.println(producto.get(pivote).getNombre());
        
      
     
}}