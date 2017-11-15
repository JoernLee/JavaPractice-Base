package cn.itcast.arrays;
import java.lang.StringBuilder;

public class Demo1BubbleSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = {11,55,23,54,2};
		bubbleSort(arr);
		System.out.println(arr2String(arr));
	}
	
	/*
	 * 冒泡排序
	 * 1.返回值类型void
	 * 2.参数列表int[] arr
	 */
	public static void bubbleSort(int[] arr){
		for(int i = 0;i < arr.length - 1;i++){  //最后一次不需要再进行了
			for(int j = 0; j < arr.length -1 - i;j++){ //- 1是防止数组越界	
				if(arr[j] > arr[j+1]){		// - i是为了提高效率
					swap(arr,j,j+1);
				}
			}
		}
	}
	
	/*
	 * 交换数组中位置
	 * 1.返回值类型void
	 * 2.参数列表int[] arr,int i,int j 
	 */
	public static void swap(int[] arr,int i,int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	/*
	 * 打印数组
	 * 1.返回值String
	 * 2.参数列表int[] arr
	 */
	public static String arr2String(int[] arr){
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for(int i = 0;i < arr.length;i++){
			if(i == arr.length - 1){
				sb.append(arr[i]).append("]");
			}else{
				sb.append(arr[i]).append(", ");
			}
		}
		return sb.toString();
	}

}
