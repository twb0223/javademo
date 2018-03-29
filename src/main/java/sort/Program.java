package sort;


public class Program {

    public static void main(String[] args) {
        int[] array = {4, 2, 8, 9, 5, 7, 6, 1, 3};
        //未排序数组顺序为
        System.out.println("未排序数组顺序为：");
        Until.display(array);
        System.out.println("-----------------------");


//        Sort selectSort=new SelectSortImp();
//        array = selectSort.sort(array);

        Sort insertSort=new InsertSortImp();
        array = insertSort.sort(array);

        System.out.println("-----------------------");
        System.out.println("经过选择排序后的数组顺序为：");
        Until.display(array);
    }
}
