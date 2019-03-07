//afisarea elementelor dintr-un array[] a caror suma este egala cu un n dat de la tastatura

import java.util.Scanner;

public class SumaElemArray {

    private int n;

    SumaElemArray(){

        Scanner s = new Scanner(System.in);
        System.out.print("dati numarul cu care sa fie egala suma=");
        this.n = s.nextInt();
    }


    public void suma(int userInput[]) {


        if(userInput!=null) {

            for (int i = 0; i < userInput.length; i++)
                System.out.print(userInput[i] + " ");

            for (int i = 0; i < userInput.length; i++) {
                for (int j = i; j < userInput.length; j++)

                    if ((userInput[i] + userInput[j] == n))
                        System.out.print("\n" + userInput[i] + " + " + userInput[j]);

            }
        }
        else
            System.out.println("dati array diferit de null");

    }
}
