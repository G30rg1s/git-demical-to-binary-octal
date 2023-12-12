import java.util.Scanner;
import java.lang.Math;

public class DemicalToBinaryAndOctal {

    public static void main(String[] args) {


        System.out.printf("GIVE A NUMBER [ x ] (DEMICAL) [ x<=999.999.999 ] :\n x= ");
        Scanner in = new Scanner(System.in);
        int x = 0;
        x = in.nextInt();
        System.out.printf("GIVE : \n 2--> BINARY \n 8--> OCTAL  \n -----> ");
        int choise = in.nextInt();
        int a = 0;
        //o n einai h dunamh tou 2
        int n = -1;
        //o z pairnei tis times tou a antistrofa apo to megalutero pros to mikrotero
        int z = 0;
        //o y pairnei times y=x-z kai an y>0 tote x=y
        int y = 0;
        //o j xreishmopoieitai mesa ston brogxo for gia na afxanetai kata 1
        int j = 0;
        int diairesh = 0;
        int ypoloipo = 0;

        switch (choise) {
            case 2:
                System.out.printf("USING : ");
                do {
                    n = n + 1;
                    a = (int) Math.pow(2, n);
                    //ektypwsh thesewn gia duadiko systhma
                    System.out.printf("[%d]\t", a);

                    if ((x - a) < a) {
                        j = n + 1;
                        System.out.printf("\n BINARY FORMAT : ");
                        for (int i = n; i > -1; i--) {
                            j = j - 1;
                            z = (int) Math.pow(2, j);
                            y = x - z;
                            if (y >= 0) {
                                System.out.print("1");
                                x = y;
                            }
                            if (y < 0) {
                                System.out.print("0");
                            }
                        }
                    }

                } while (x >= a);
                break;
            case 8:
                System.out.printf("USING : ");
                do {
                    n = n + 1;
                    a = (int) Math.pow(8, n);
                    //ektypwsh thesewn gia oktadiko systhma
                    System.out.printf("[%d]\t", a);

                    if ((x - a) < 7 * a) {
                        j = n + 1;
                        System.out.printf("\n OCTAL FORMAT: ");
                        for (int i = n; i > -1; i--) {
                            j = j - 1;
                            z = (int) Math.pow(8, j);
                            y = x - z;
                            if (y >= 0) {
                                diairesh = x / z;
                                ypoloipo = x % z;
                                System.out.printf("%d", diairesh);
                                x = ypoloipo;
                            }
                            if (y < 0) {
                                System.out.print("0");
                            }

                        }
                    }

                } while (x >= a);
                break;

            default:
                System.out.printf("---> NO SUCH CHOISE---TRY AGAIN <---");

        }

    }
}



