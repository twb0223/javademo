package sort;


public class Program {

    public static void main(String[] args) {
//        int[] array = {4, 2, 8, 9, 5, 7, 6, 1, 3};
//        //未排序数组顺序为
//        System.out.println("未排序数组顺序为：");
//        Until.display(array);
//        System.out.println("-----------------------");


//        Sort selectSort=new SelectSortImp();
//        array = selectSort.sort(array);

//        Sort insertSort=new InsertSortImp();
//        array = insertSort.sort(array);
//
//        System.out.println("-----------------------");
//        System.out.println("经过选择排序后的数组顺序为：");
//        Until.display(array);
        
//        HLMove.move(10, "A", "B", "C");
//        System.out.println("END");
        
        int result=pow(2, 3);
        System.out.println(result);
    }
    //乘方运算
    public static int pow(int x,int y) {
		if(x==0||x==1) {
			return x;
		}
		if (y>1) {
			int b=y/2;
			int a=x*x;
			if (y%2==1) {//y为奇数
				return pow(a, b)*x;
			}else {//y为偶数
				return pow(a, b);
			}
		}else if(y==0){
			return 1;
		}else {//y==1
			return x;
		}
	}
}
