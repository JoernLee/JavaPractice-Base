package cn.itcast.test;

public class Test3String {

	/**
	 * @param args
	 * �����������ݰ���[1,2,3]��ʽƴ��Ϊ�ַ���
	 */
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		
		String temp = "[";
		for(int i = 0; i < arr.length; i++){
			/*if(i == arr.length - 1){
				temp = temp + arr[i] + "]";
			}else{
				temp = temp + arr[i] + ", ";
			}*/
			
			//����Ԫ�����
			temp = temp + ((i == arr.length - 1) ? arr[i] + "]" : arr[i] + ", "); 
			
		}
		
		System.out.println(temp);
	}

}
