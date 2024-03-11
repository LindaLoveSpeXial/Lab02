import java.util.Scanner;
public class JPA06 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        for(int i=1;i<=4;i+=1){
            System.out.print("Input Chinese score:");
            int a=scn.nextInt();

            
            System.out.print("Input English score:");
            int b=scn.nextInt();
            System.out.print("Input Math score:");
            int c=scn.nextInt();
            if(a>60 && b>60 && c>60){
                System.out.println("All Pass");
            }else if(a>60 && b>60 && c<60){
                System.out.println("Math failed");
            }else if(a>60 && c>60 && b<60){
                System.out.println("English failed");
            }else if(b>60 && c>60 && a<60){
                System.out.println("Chinese failed");
            }else if(a>60 && b<60 && c<60){
                System.out.println("English failed");
                System.out.println("Math failed");
            }else if(b>60 && a<60 && c<60){
                System.out.println("Chinese failed");
                System.out.println("Math failed");
            }else if(c>60 && a<60 && b<60){
                System.out.println("Chinese failed");
                System.out.println("English failed");

            }else{
                System.out.println("Chinese failed");
                System.out.println("English failed");
                System.out.println("Math failed");
            }
        }
        scn.close();
    }
}
