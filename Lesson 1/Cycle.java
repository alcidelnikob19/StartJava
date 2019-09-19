public class Cycle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 0; i < 21; i++) {
            System.out.print(i + " ");
        }

        System.out.println( " ");
        int j = 6;
        while (j > -7) {
            System.out.print(j + " ");
            j=j-2;
        }
        int a = 10;
        int sum1=0;
        do {
            if (a % 2 == 0) ;
            a++;
            sum1+=a;


        } while (a < 20);
        System.out.println(sum1);
    }
}