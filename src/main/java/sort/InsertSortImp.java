package sort;

/*
* 插入排序
* 步骤：
* 每一步将一个待排序的记录，插入到前面已经排好序的有序序列中去，直到插完所有元素为止
* 也就是每次都把后面一个数和前面排好的数列进行比较，然后插入到合适的位置。
* 在第一轮排序中，它最多比较一次，第二轮最多比较两次，一次类推，第N轮，最多比较N-1次。因此有 1+2+3+...+N-1 = N*（N-1）/2。
* 复制的次数大致等于比较的次数，但是一次复制与一次交换的时间耗时不同，所以相对于随机数据，插入排序比冒泡快一倍，比选择排序略快
* */
public class InsertSortImp implements Sort {

    @Override
    public int[] sort(int[] array) {
        int j;
        //从下标为1的元素开始选择合适的位置插入，因为下标为0的只有一个元素，默认是有序的
        for (int i = 1; i < array.length; i++) {
            int tmp = array[i];
            j = i;
            while (j > 0 && tmp < array[j - 1]) {//从已经排序的序列最右边的开始比较，找到比其小的数
                array[j] = array[j - 1];//向后挪动
                j--;
            }
            array[j]=tmp;
            Until.display(array);
        }
        return  array;
    }
}
