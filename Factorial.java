class Factorial{
    public static int fact(int n){
        if(n==0)
            return 1;
        else
            return n*fact(n-1);
    }
    public static void main(String args[]){
        int fact=fact(5);    
        System.out.println("Factorial of 5 is: "+fact);    
    }
}