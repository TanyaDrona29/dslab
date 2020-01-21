package dslab1.seco.main;

public class ArraryProcessing {
    public static void main(String args[]){
        int[] arrary = new int[10];
        System.out.println("printing arrary");
        for (int i = 0; i <arrary.length; i++) {
            System.out.print(arrary[i]);
            System.out.print(",");
        }
        System.out.println();
        arrary[0] = 1;
        arrary[1] = 2;                                          //static arrary
        arrary[2] = 3;
        arrary[3] = 4;
        arrary[4] = 5;
        arrary[5] = 6;
        arrary[6] = 7;
        arrary[7] = 8;
        arrary[8] = 9;
        arrary[9] = 10;
        System.out.println("printing static arrary");
        for (int i = 0; i <arrary.length ; i++) {
            System.out.print(arrary[i]);
            System.out.print(",");
        }
        System.out.println();                                       //command line arrary
        for (int i = 0; i < arrary.length && i<args.length; i++) {
            arrary[i] = Integer.parseInt(args[i]);
        }
        System.out.println("printing command line arrary");
        for (int i = 0; i < arrary.length ; i++) {
            System.out.print(arrary[i]);
            System.out.print(",");
        }
        System.out.println();
        int sum = 0;
        for (int i = 0; i < arrary.length ; i++) {
            sum = sum + arrary[i];
        }
        System.out.println("sum is "+sum);
        int avg = 0;
        avg = sum/arrary.length;
        System.out.println("avreage is "+avg);
    }
}
