import java.util.Scanner;
class Main {

  public static void main(String[] args) {
    Scanner teclado= new Scanner(System.in);
    int n,i,x,y,c1,c2,c3,c4;
    c1=0; c2=0; c3=0; c=0;
    System.out.print("Cantidad de puntos que desea: ");
    n=teclado.nextInt();
    for(i=1;i<=n;i++) {
      System.out.print("Ingrese las coordenadas en x: ");
      x=teclado.nextInt();
      System.out.print("Ingrese las coordenadas en y: ");
      y=teclado.nextInt();
      if (x>0 && y>0) {
        c1++;
      } else {
        if (x<0 && y>0) {
          c2++;
        } else {
          if (x<0 && y<0) {
            c3++;
          } else {
            if (x>0 && y<0) {
              c4++;
            }
          }
        }
      }
    }
    System.out.print("Puntos en el primer cuadrante: ");
    System.out.println(c1);
    System.out.print("Puntos en el segundo cuadrante: ");
    System.out.println(c2);
    System.out.print("Puntos en el tercer cuadrante: ");
    System.out.println(c3);
    System.out.print("Puntos en el cuarto cuadrante: ");
    System.out.println(c4);
  }
}