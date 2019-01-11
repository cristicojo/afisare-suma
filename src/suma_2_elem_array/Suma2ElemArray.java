//afisare suma a 2 elem dintr-un array care este egala cu un n dat de la tastatura
//elem pot sa fie oricare
//nu se pot aduna elem de pe acelasi index
//afisarea sumei se face doar o data

package suma_2_elem_array;

import java.util.Scanner;

public class Suma2ElemArray {

    private int b[][];
    private Scanner s = new Scanner(System.in);

    {System.out.print("dati numarul cu care sa fie egala suma=");}
    private int n = s.nextInt();


    public void suma(int userInput[]) {

        int S;
        b = new int[10][10];

            for (int j = 1; j < userInput.length; j++) {
                S = userInput[0] + userInput[j];
                System.out.println(S);
                b[0][j] = S;

            }
            System.out.println("*******");


        for (int i = 1; i < userInput.length; i++) {

            if (i==9)
                break;
            S = userInput[i] + userInput[userInput.length - 1];
            System.out.println(S);
            b[i][1] = S;
            System.out.println("-------");
        }
    }

    public void display() {

        for (int i=0;i<b.length-1;i++) {
            System.out.println();

            for (int j=1;j<b.length;j++){
                if (b[i][j]==n)
                System.out.printf("%3d",b[i][j]);
            }
        }
        System.out.println();
    }
    }
