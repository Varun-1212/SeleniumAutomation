package practice;

public class P3 {
    public static void main(String[] args) {
            int a=0;
            int b=1;
            int sum=0;
            int range=10;
            while(range!=0)
            {
                System.out.print(a+" ");
                sum=a+b;
                a=b;
                b=sum;
                range--;
            }
    }
}
