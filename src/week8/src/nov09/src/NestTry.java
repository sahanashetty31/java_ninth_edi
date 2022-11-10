//example of nested try statements
class NestTry {
    public static void main(String[] args) {
        try {
            int a = args.length;
            /*if no commandline args are present,following statement will
            generate divide by zero exception
             */
            int b = 42/a;
            System.out.println("a= "+a);
            try {
                if(a==1) a=a/(a-a);
                if(a==2){
                    int c[] = {1};
                    c[42] = 99; //generate an out of bound exception
                }
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Array index out of bounds: "+e);
            }
        }catch (ArithmeticException e){
            System.out.println("Divide by 0: "+e);
        }
    }
}
