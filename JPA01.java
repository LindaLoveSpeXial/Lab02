import java.util.Scanner;
public class JPA01 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        for(int i=1;i<=2;i++){
            System.out.println("Please enter score:");
            int a=scn.nextInt();
            if(a>60){
                System.out.println("You Pass");
            }
           
            System.out.println("End");
        
        }
        scn.close();    
    }
}
