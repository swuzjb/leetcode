/**
 * 852. 山脉数组的峰顶索引
 * https://leetcode-cn.com/problems/peak-index-in-a-mountain-array/
 */
public class Problem852 {
    public int peakIndexInMountainArray(int[] A) {
        int i = 1;
        while (i <A.length){
            if (A[i]<A[i-1]) {
                return i-1;
            }
            i++;
        }
        return i;
    }
}
