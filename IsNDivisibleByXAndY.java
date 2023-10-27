public class IsNDivisibleByXAndY{
	public static boolean isDivisible(long n, long x, long y) {
    
    // Start of Solution
    return (n % x == 0 && n % y == 0? true : false);
    // End of Solution
    
	}
}
