import java.util.Scanner;
public class JPA07 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        for(int i=1;i<=4;i++){
            System.out.print("請輸入三個整數:");
            int a=scn.nextInt();
            int b=scn.nextInt();
            int c=scn.nextInt();
            if(a==0 || b==0 || c==0 || a+b<c || a+c<b || b+c<a){
                System.out.println("不可以構成三角形");
            }else if(Math.pow(a,2)+Math.pow(b,2)==Math.pow(c,2) ||Math.pow(a,2)+Math.pow(c,2)==Math.pow(b,2) || Math.pow(c,2)+Math.pow(b,2)==Math.pow(a,2)){
                System.out.println("直角三角形");
            }else if(Math.pow(a,2)+Math.pow(b,2)<Math.pow(c,2) || Math.pow(a,2)+Math.pow(c,2)<Math.pow(b,2) || Math.pow(c,2)+Math.pow(b,2)<Math.pow(a,2)){
                System.out.println("鈍角三角形");
            }else{
                System.out.println("銳角三角形");    
            }
        }    
    scn.close();
    }

}
       

