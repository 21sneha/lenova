public class java2 {
        public static void main(String args[]){

            int num1=21,num2=28,sum,sub,mult,div;
            sum=num1 + num2;
            sub=num1 - num2;
            mult=num1 * num2;
            div=num1 / num2;

            System.out.println("the result is:"+sum + " " +sub + " " +mult + " " +div);


            int a = 9;
            int b = 37;
            int c = 0;
            c = a & b;
            System.out.println("a & b = " + c );
            c = a / b;
            System.out.println("a / b = " + c );
            c = b ^ a;
            System.out.println("a ^ b = " + c );
            c = ~a;
            System.out.println("~a = " + c );


            int S = 40;
            int N = 30;
            System.out.println("S == N = " + (S == N) );
            System.out.println("S != N = " + (S != N) );
            System.out.println("S > N = " + (S > N) );
            System.out.println("S < N = " + (S < N) );
            System.out.println("S >= N = " + (S >= N) );
            System.out.println("S <= N = " + (S <= N) );

            //*unary operator//*

            int i = 9, j;
            j = i++;
            j = ++i;
            j = --i;
            j = i--;
            System.out.println(i);
            System.out.println(j);









        }
    }

