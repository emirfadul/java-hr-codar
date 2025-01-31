package secao11;

public class LoopsB {

    public static void main(String[] args) {

        // externo:
        // for (int i = 0; i < 3; i++) {
        //     for (int j = 0; j < 3; j++) {
        //         if (i == 1 && j == 1) {
        //             break externo;
        //         }
        //         System.out.println("i = " + i + " , j = " + j);
        //     }
        //     System.out.println("Break externo.");
        // }
        // for (int i = 0; i < 3; i++) {
        //     interno:
        //     for (int j = 0; j < 3; j++) {
        //         if (j == 2) {
        //             System.out.println("Parou interno.");
        //             break interno;
        //         }
        //         System.out.println("i = " + i + " , j = " + j);
        //     }
        // }
        //LOOP OFF BY ONE
        for (int a = 1; a < 5; a++) {

            System.out.println("A: " + a);
        }

    }

}
