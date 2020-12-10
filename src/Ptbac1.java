import java.util.Scanner;

public class Ptbac1 {
    public static void main(String[] args) {
        double a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("a:");
        a=sc.nextFloat();
        System.out.println("b:");
        b=sc.nextFloat();
        if (a==0){
            if (b!=0){
            System.out.println("pt vô nghiệm");
            }else {
                System.out.println("pt vô số nghiệm");
            }
        }else if (a!=0){
            double x=-b/a;
            System.out.println("x:"+x);
        }

        }

    }
