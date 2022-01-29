import java.util.Scanner;
class Main {

  public static void main(String[] args) {
    Scanner teclado= new Scanner(System.in);
    int n,par, impar ,div;
    par=0 ; impar=0 ;
    do{
      System.out.print("Ingrese un número. O ingrese 0 si desea terminar:");
      n= teclado.nextInt();
      div= n % 2;
      if(n!=0){
        if(div==0){
        par++;
        }
        else{
          impar++;
        }
      }     
    }while(n != 0);
    System.out.println("Habían "+ par +" pares y habían "+ impar +" impares");
  }
}