package gr.aueb.cf.cf9.ch4;



public class Pyramid {
    public static void main(String[] args) {

        int n = 5;

        for (int rows = 1; rows <= n; rows++) {

            for (int dash = n-rows; dash > 0; dash--) {
                System.out.print("_");
            }

            for (int stars = 1; stars <= (rows-1)*2+1 ; stars++) {
                System.out.print("*");
            }
            System.out.println("");

        }

    }
}

