import java.util.Scanner;
public class JPA03 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
       
        for(int i=1;i<=2;i++){
            System.out.println("Input an interger:");
            int a=scn.nextInt();
            if(a%2==0){
                System.out.println("The number is even");
            }else{
                System.out.println("The number is odd");
    
            }
        }
        scn.close();
    }
}
