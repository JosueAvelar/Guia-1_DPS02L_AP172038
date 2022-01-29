//Crear un programa en consola que me permita saber si dos números son divisibles entre sí, para saber siun número es divisible por otro se tiene que obtener el modulo y si este es cero entonces este número es divisible por el otro
import java.util.Scanner;
class Main {

  public static void main(String[] args) {
    Scanner teclado= new Scanner(System.in);
    int num1, num2, div;
    System.out.print("ingrese el primer numero: ");
    num1= teclado.nextInt();
    System.out.print("ingrese el primer numero: ");
    num2= teclado.nextInt();
    div= num1 % num2;
    if(div ==0){
      System.out.println("el numero "+ num1 +" y el numero "+ num2 +" son divisibles. ");
    }
    else{
      System.out.println("el numero "+ num1 +" y el numero "+ num2 +" no son divisibles. ");
    }
    //System.out.println(div);
  }
}