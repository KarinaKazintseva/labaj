import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MergerTest {
    @Test
    public void merge(){
        int[] a = { 1, 2, 3, 4, 5, 16 };
        int[] b = { 6, 7, 8, 9, 10, 11, 12 };
        int[] expected = {1,2,3,4,5,6,7,8,9,10,11,12,16};
        assertArrayEquals(expected,Merger.merge(a,b));
    }
}
