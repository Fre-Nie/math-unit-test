public class BasicMath {
        public int div(int a, int b) {
            if (b == 0){
                throw new ArithmeticException("Divide by zero is not allowed!");
            }
            else {
                return a / b;
            }

        }

        public int add(int a, int b)
        {
            return a+b;
        }

        public int multiply(int a, int b){
            return a*b;
        }

        public int subtract (int a, int b) {return a-b; }

        public int fibonacci (int a){
            if (a == 0 ){
                return 0;
            }
            else if (a == 1){
                return 1;
            }
            else{
                int fibo = 0;
                fibo = fibonacci(a-1) + fibonacci(a-2 );
                return fibo;
            }


        }
}


