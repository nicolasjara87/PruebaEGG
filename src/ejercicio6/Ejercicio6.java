
package ejercicio6;

import java.util.Scanner;


public class Ejercicio6 {

   
    public static void main(String[] args) {
     //Crear cafetera
        Cafetera c1 = new Cafetera();
        
        c1.capacidadMaxima = 500;
        
     //Llenar cafetera
     
        String respuestallenar = llenarCafetera();
        
        if ("s".equalsIgnoreCase(respuestallenar)) {
            
           c1.cantidadActual = c1.capacidadMaxima ;
                    
     //Servir taza
     
        int respuestaservir = servirTaza();
          
            //200                       //300
            if (c1.cantidadActual > respuestaservir) {
                
                c1.cantidadActual = c1.cantidadActual - respuestaservir;
            }
            
            else 
                
                System.out.println("Se lleno solo " + c1.cantidadActual);
                        
               
             
     
    }
         
     //vaciar cafetera
    
    String respuestaVaciar = vaciarCafetera();
         
         if ("s".equalsIgnoreCase(respuestaVaciar)) {
            
            c1.cantidadActual = 0;
    
    }
     // Agregar cafe
     
    int respuestaAgregar = agregarCafe();
    
    c1.cantidadActual = c1.cantidadActual+respuestaAgregar;
    
         
         
         
    }
    
    
    public static String llenarCafetera(){
       
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Llenar cafetera? -- S / N--");
        
        String respuestallenar = leer.nextLine();
        
        return respuestallenar;
        
    }
    
    public static int servirTaza(){
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Tamanio de la taza a llenar? 100ml - 200ml - 300ml ");
        
        int respuestaservir = leer.nextInt();
        
        return respuestaservir;
        
        
    }
    
    
    public static String vaciarCafetera(){
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("VACIAR cafetera? -- S / N--");
        
        String respuestaVaciar = leer.nextLine();
        
        return respuestaVaciar;
        
        
        
    }
    
    public static int agregarCafe(){
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Que cantidad de cafe desea agregar?");
        
        int respuestaAgregar = leer.nextInt();
        
        return respuestaAgregar;
        
                
        
        
    }
}

