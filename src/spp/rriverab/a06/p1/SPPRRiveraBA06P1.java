//Nombre: Roberto Alain Rivera Bravo
//Matrícula: A01411516
//Carrera: IMT11
package spp.rriverab.a06.p1;
import java.util.Scanner;

public class SPPRRiveraBA06P1 {

    public static void main(String[] args) {
        inicioReinicio(); //Se llama a método inicio reinicio
    }
    
    
    //Método inicio reinicio: introduce al programa e inicia o reinicia las sumas al llamar a los demás métodos
    public static void inicioReinicio(){
        
        System.out.println("\n\n--------------------");
        System.out.println("Cálculadora de sumas");     
        System.out.println("--------------------");
        
        //Manda a método calcular suma, y el valor que regresa se manda a método mostrar resultados
        mostrarResultados(calcularSuma()); 
        //Manda a método salir
        salir();
    }
    
    
    //Método solicitar datos: permite verificar que los datos sean correctos y los captura
    public static int solicitarDatos(){
        Scanner teclado = new Scanner (System.in);
        int x=0;
        boolean flag;

        //Ciclo do while: ejecuta al menos una vez las instrucciones en do, y evalúa si es cierto en while
        do{      
            try{ //Intenta realizar las instrucciones 
                System.out.println("\nIntroduce un número entero");
                x = teclado.nextInt(); 
                flag = true;
            }catch (Exception ex) { //Evita que el programa falle en caso de error y muestra el error
                flag = false;
                System.out.println("\nEl valor insertado no es válido (entero normal)\n" +ex+ "\n");
                teclado.nextLine(); //Limpia el buffer del teclado  
            } 
            
        }while(flag==false); //Evalua si la condición es verdadera o falsa, para volver a hacer las operaciones o no

        return x; //regresa el valor obtenido
    }
    
    
    //Método calcular suma: realiza la suma de los datos introducidos hasta que se rompe la condición
    public static int calcularSuma(){
        int suma=0, x;

        //Ciclo do while para seguir sumando valores hasta que se rompa la condición 
        do{
            //Se entra al método solicitar datos y se guarda el valor
            x = solicitarDatos();
            
            //Se suma el valor si el número es mayor o igual a cero
            if(x>=0){
                suma = suma+x;
            }
        }while(x>=0);
        
        return suma; //regresa el valor obtenido
    }
    
    
    //Método mostrar resultados: muestra los resultados del programa
    public static void mostrarResultados(int suma){
        System.out.println("\nEl valor de la suma es: "+suma); //Se muestra el valor obtenido del proceso de sumar
    }
    
    
    //Método salir: da opción de terminar o reiniciar los cálculos
    public static void salir(){
        Scanner teclado = new Scanner (System.in);
        String letra;
    
        System.out.println("\n¿Desea continuar?");
        System.out.println("No: Presione E");
        System.out.println("Sí: Presione cualquier otra tecla");
        letra = teclado.nextLine(); 
        
        //verifica si el String es igual a "E"
        if(letra.equals("E")){
            //termina el programa
            System.exit(0);
        }
        //se ejecuta si el String es distinto de "E"
        else{
            //Se invoca a método inicio reinicio para volver a ejecutar el programa
            inicioReinicio();
        }      
    }
    
    
}