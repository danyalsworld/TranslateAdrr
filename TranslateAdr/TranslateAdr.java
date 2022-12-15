import java.util.Scanner;

public class TranslateAdr {
    private static Scanner scanner;
    public static void main (String args[]){
        scanner=new Scanner(System.in);
        double address=Double.valueOf(scanner.nextLine());
        if(address<0||address>Math.pow(2,32)-1){
            System.out.println("Invalid input:Out of range");
            return;
        }
        double largestPage=Math.pow(2,32)/Math.pow(2,12)-1;
        double pageNumber=address/(Math.pow(2,12));
        double offset=address%(Math.pow(2,12));
        System.out.println("The largest possible page number is:"+ largestPage);
        System.out.println("The page table size is:4 megabytes");
        System.out.println("The page number is:"+(int)pageNumber);
        System.out.println("The page offset: "+offset);


        String binaryAdd=String.format("%32s", Integer.toBinaryString((int) address)).replaceAll(" ", "0");

        String p1= (binaryAdd.substring(0,11));
        String p2=(binaryAdd.substring(11,21));

        int p1Decimal = Integer.parseInt(p1, 2);
        int p2Decimal=Integer.parseInt(p2,2);
        System.out.println("With a 2-level page table, the outer p1 is: "+p1Decimal);
        System.out.println("With a 2-level page table, the inner p2 is: "+p2Decimal);




    }
}
