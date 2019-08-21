package exercise;

import java.util.LinkedList;

/**
 * @author lmy
 * @ClassName SlidingWindowMax
 * @date 2019/8/18
 **/
public class SlidingWindowMax {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int len = nums.length;
        if (len <k) {
            return new int[]{};
        }
        LinkedList<Integer> linkedList = new LinkedList<>();
        int[] res = new int[len - k + 1];
        int cur = 0;
        for (int i = 0; i < nums.length; i++) {
            while (!linkedList.isEmpty() && nums[linkedList.peekLast()] <= nums[i]) {
                linkedList.pollLast();
            }
            linkedList.offer(i);
            if (linkedList.peekFirst() == (i - k)) {
                linkedList.pollFirst();
            }

            if (i >= k-1) {
                res[cur++] = nums[linkedList.peekFirst()];
            }

        }

        return res;
    }


    public static void main(String[] args) {
        int []nums={1,3,-1,-3,5,3,6,7};
        int k=3;
        int []res=maxSlidingWindow(nums,k);
        for (int i:res){
            System.out.println(i);
        }
    }
}
