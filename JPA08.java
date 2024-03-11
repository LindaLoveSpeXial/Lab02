import java.util.Scanner;
public class JPA08 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        for(int i=1;i<=5;i+=1){
            System.out.println("Input:");
            int a=scn.nextInt();
            if(a>=90){
                System.out.println("Your grade is A");
            }else if(90>a && a>=80){
                System.out.println("Your grade is B");
            }else if(80>a && a>=70){
                    System.out.println("Your grade is C");
            }else if(70>a && a>=60){
                    System.out.println("Your grade is D");
            }else{
                    System.out.println("Your grade is F");
            }
    
        }
    scn.close();
    }
}
