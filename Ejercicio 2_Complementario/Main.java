import java.util.Scanner;
class Main {

  public static void main(String[] args) {
    Scanner teclado= new Scanner(System.in);
    int n,may, men ,div, i;
    may=0 ; men=0 ;
    for (i=1 ; i<=10 ; i++){
      System.out.print("Ingrese la nota: ");
      n= teclado.nextInt();
      if(n>= 7 && n <=10){
        may ++ ;
      } 
      else if (n<7 && n>=1){
        men ++;
      }     
    }
    System.out.println("Habían "+ may +" notas mayores o iguales a 7 y habían "+ men +" menores a 7.");
  }
}