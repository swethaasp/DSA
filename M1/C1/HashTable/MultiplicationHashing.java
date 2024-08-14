package module1;


public class MultiplicationHashing {
    private Double k;
    public MultiplicationHashing(Double k){ this.k = k;}
    public int hashKey(Integer key, int tableSize){return (int) (tableSize * (k * key % 1));}

    public static void main(String[] args) {
        MultiplicationHashing multiplicationHashing = new MultiplicationHashing((Math.sqrt(5)-1)/2);
        System.out.println(multiplicationHashing.hashKey(12342342,1000));
        System.out.println(multiplicationHashing.hashKey(23545646,1000));
        System.out.println(multiplicationHashing.hashKey(87934653,1000));
        System.out.println(multiplicationHashing.hashKey(25464566,1000));
    }
}


//Constant k: A constant used in the multiplication hashing formula. It is chosen to ensure a uniform distribution of keys. The choice of k is crucial for good hash performance.
//k = (Math.sqrt(5) - 1) / 2, which is approximately 0.61803398875.


/* 3. Example Calculation
Let’s use the constant k = (Math.sqrt(5) - 1) / 2, which is approximately 0.61803398875.

For example, let's calculate the hash for the key 12342342 with a table size of 1000:

Multiply Key by k:

k * key = 0.61803398875 * 12342342 ≈ 7648290.0
Fractional Part:

7648290.0 % 1 = 0.0 (because it is a whole number)
Scale to Table Size:

1000 * 0.0 = 0.0
Convert to Integer:

(int) 0.0 = 0
So, hashKey(12342342, 1000) returns 0.  */
