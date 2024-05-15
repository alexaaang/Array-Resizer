/**
 * 2021 FRQ 4: Array Resizer Tester
 * Requires ArrayResizer class
 * with answer to parts (a) and (b)
 *
 * test code: Alexander A
 * @version May 6, 2024
 */

public class ArrayResizerTester 
{
    public static void main(String[] args)
    {
        int[][] arr = { {4, 1, 1},
                        {8, 3, 0},
                        {0, 0, 0},
                        {4, 5, 6}};
        ArrayResizer test = new ArrayResizer(arr);
        System.out.println("NonZeroRow Test should return true. Your code returns: " + test.isNonZeroRow(arr, 0));
        System.out.println("NonZeroRow Test should return false. Your code returns: " + test.isNonZeroRow(arr, 1));
        System.out.println("NonZeroRow Test should return false. Your code returns: " + test.isNonZeroRow(arr, 2));
        System.out.println("NonZeroRow Test should return true. Your code returns: " + test.isNonZeroRow(arr, 3));
        System.out.println();
        System.out.println("ArrayResizer should return [[4, 1, 1], [4, 5, 6]]. Your code returns: " + test.toString(test.resize(arr)) + "\n");
        
        int[][] arr2 = { {0, 1, 0},
                        {5, 4, 2},
                        {3, 8, 7},
                        {4, 0, 6}};
        System.out.println("ArrayResizer should return [[5, 4, 2], [3, 8, 7]]. Your code returns: " + test.toString(test.resize(arr2)) + "\n");
    }
}
