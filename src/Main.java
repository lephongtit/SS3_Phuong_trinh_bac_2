import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sr =new Scanner(System.in);
        System.out.print("Nhập a: ");
        double a=sr.nextDouble();
        System.out.print("Nhập b: ");
        double b=sr.nextDouble();
        System.out.print("Nhập c: ");
        double c=sr.nextDouble();

     QuadraticEquation quadraticEquation=new QuadraticEquation(a,b,c);
     if (quadraticEquation.getDiscriminant()>0){
         System.out.println("Phương trình có 2 nghiệm phân biệt:");
         System.out.println("x1= "+ quadraticEquation.getRoot1());
         System.out.println("x2= "+ quadraticEquation.getRoot2());
     }else if (quadraticEquation.getDiscriminant()==0){
         System.out.println("Phương trình có 1 nghiệm duy nhất: ");
         System.out.println("x1=x2= "+quadraticEquation.getRoot3());
     }else {
         System.out.println(quadraticEquation.getRoot4());
     }

    }
}
