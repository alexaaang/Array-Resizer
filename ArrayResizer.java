/**
 * 2021 FRQ 4
 * ArrayResizer
 *
 * implementation: Alexander A '24
 * @version May 6, 2024
 */
import java.util.*;
public class ArrayResizer
{
    private int[][] arr;
    public ArrayResizer(int[][] arr)
    {
        this.arr = arr;
    }

    /** Returns true if and only if every value in row r of array2D is non-zero.
     * Precondition: r is a valid row index in array2D.
     * Postcondition: array2D is unchanged.
     */
    public static boolean isNonZeroRow(int[][] array2D, int r)
    {
        for (int c = 0; c < array2D[0].length;c++)
        {
            if(array2D[r][c] == 0)
            {
                return false;
            }
        }
        return true;
    }

    /** Returns the number of rows in array2d that contain all non-zero values.
     * Postcondition: array2D is unchanged
     * 
     */
    public static int numNonZeroRows(int[][] array2D)
    {
        int count = 0;
        for (int r = 0; r < array2D.length; r++)
        {
            if (isNonZeroRow(array2D, r))
            {
                count++;
            }
        }
        return count;
    }

    /** Returns a new, possibly smaller, two-dimensional array that contains only rows 
     * from array2D with no zeros, as described in part (b).
     * Precondition: array2D with no zeros, as described in part (b).
     * Postcondition: array2D is unchanged.
     */
    public static int[][] resize(int[][] array2D)
    {
        int[][] newArray = new int[numNonZeroRows(array2D)][array2D[0].length];
        int newR = 0;
        for(int oldR = 0; oldR < array2D.length; oldR++)
        {
            if(isNonZeroRow(array2D, oldR))
            {
                newArray[newR] = array2D[oldR];
                newR++;
            }
        }
        return newArray;
    }
    public String toString(int[][] arr)
    {
        return Arrays.deepToString(arr);
    }
}
