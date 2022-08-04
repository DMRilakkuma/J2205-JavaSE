package lesson4;

/**
 * @author: MC
 * @program: J2205
 * @create: 2022-06-27 14:36
 * @Description:
 */
public class test5 {
    public static void main(String[] args) {
        // 如果要使用二分查找，数组中的值一定是有序值
        int test = test();
        if(test == -1){
            System.out.println("没有找到");
        }else{
            System.out.println("找到为:"+test);
        }

    }
    public static int  test(){
        int a = 10;
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int left = 0;
        int right = array1.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array1[mid] > a) { // 如果中间位大于要查找的数据，那么中间位右边数据直接舍弃不再排查
                right = mid - 1;
            } else if (array1[mid] == a) {
                return mid+1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}