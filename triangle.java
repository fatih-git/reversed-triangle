import java.util.Scanner;

/**
 * @author fatih-git
 * */

public class triangle {

    public static void main(String[] args) {

        int n;
        Scanner input=new Scanner(System.in);

        System.out.print("Lütfen bir değer giriniz: ");
        n=input.nextInt();

        for(int i=0; i<n; i++){

            for(int j=0; j<i; j++){
                System.out.print(" ");
            }

            for(int k=0; k<(2*n)-(2*i); k++){
                System.out.print("*");
            }

            System.out.print("\n");
        }

    }

}
