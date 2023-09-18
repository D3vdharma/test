// program passed the test cases in geeks 


// User function Template for Java

class isPowerOfTwo{
    
    // Function to check if given number n is a power of two.
    public static boolean isPowerofTwo(long n){
    long i=1;
   while (true) {
              i*=2L;
              if(i==n||n==1)  return true ;
              if(i > n||n==0)  return false ;
        }
    
}
}