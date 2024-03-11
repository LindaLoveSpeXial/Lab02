import java.util.Scanner;
public class JPA02 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        for(int i=1;i<=2;i++){
            System.out.println("Input:");
            int a=scn.nextInt();
            int b=scn.nextInt();
            if(a>b){
                System.out.println(a+" is larger than "+b);
            }else{
                System.out.println(b+" is larger than "+a);
            }
        }
        scn.close();
    }
}
