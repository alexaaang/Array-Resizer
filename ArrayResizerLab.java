/**
 * 2021 FRQ 4
 * ArrayResizer Lab
 *
 * Alexander A '24
 * @version May 6, 2024
 */
import java.util.*;
public class ArrayResizerLab
{
    /** Returns true if and only if every value in row r of array2D is non-zero.
     * Precondition: r is a valid row index in array2D.
     * Postcondition: array2D is unchanged.
     */
    public static boolean isNonZeroRow(int[][] array2D, int r)
    {
        //solution to part a) put here
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
        //solution to part b) goes here
    }
    public String toString(int[][] arr)
    {
        return Arrays.deepToString(arr);
    }
}

