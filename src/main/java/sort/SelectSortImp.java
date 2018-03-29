package sort;


/*选择排序
步骤：
1.从待排序序列中，找到关键字最小的元素
2.如果最小元素不是待排序序列的第一个元素，将其和第一个元素互换
3.从余下的 N - 1 个元素中，找出关键字最小的元素，重复(1)、(2)步，直到排序结束
*/
public class SelectSortImp implements Sort {
    @Override
    public int[] sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;//初始化最小值的索引,假设为第一个数
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {//如果后面的一个比前面一个小，则替换最小值对应的索引
                    min = j;
                }
            }
            if (i != min) {//交换两个数的位置。
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
            System.out.println("第" + (i + 1) + "轮排序后的结果：");
            Until.display(array);
        }
        return array;
    }
}
