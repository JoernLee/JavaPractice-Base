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
	 * ð������
	 * 1.����ֵ����void
	 * 2.�����б�int[] arr
	 */
	public static void bubbleSort(int[] arr){
		for(int i = 0;i < arr.length - 1;i++){  //���һ�β���Ҫ�ٽ�����
			for(int j = 0; j < arr.length -1 - i;j++){ //- 1�Ƿ�ֹ����Խ��	
				if(arr[j] > arr[j+1]){		// - i��Ϊ�����Ч��
					swap(arr,j,j+1);
				}
			}
		}
	}
	
	/*
	 * ����������λ��
	 * 1.����ֵ����void
	 * 2.�����б�int[] arr,int i,int j 
	 */
	public static void swap(int[] arr,int i,int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	/*
	 * ��ӡ����
	 * 1.����ֵString
	 * 2.�����б�int[] arr
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
