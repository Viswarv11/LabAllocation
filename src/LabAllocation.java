import java.util.Scanner;

public class LabAllocation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        int y=scanner.nextInt();
        int z=scanner.nextInt();
        int n=scanner.nextInt();
        int array[]=new int[3];
        array[0]=x-n;
        array[1]=y-n;
        array[2]=z-n;
        if(array[0]< array[1] && array[0]< array[2])
            System.out.println("L1");
        else if(array[1]< array[0] && array[1]< array[2])
            System.out.println("L2");
        else
            System.out.println("L3");
    }
}
