package cn.itcast.StringBuffer;

public class Demo1StringBuffer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//demo1();
		//demo2();
		int[] arr = {1,2,3};
		System.out.println(arr2String(arr));
		
	}

	public static void demo2() {
		StringBuffer sb = new StringBuffer();
		StringBuffer sb2 = sb.append(true);
		StringBuffer sb3 = sb.append(123);
		StringBuffer sb4 = sb.append("Joern");
		System.out.println(sb);	 //ȫ�������������StringBuffer��toString����
		System.out.println(sb2); //ͬ�ϣ���ȫ�����
	}

	public static void demo1() {
		StringBuffer sb1 = new StringBuffer();
		System.out.println(sb1.capacity());
		
		StringBuffer sb2 = new StringBuffer("Joern");
		System.out.println(sb2.capacity());
		System.out.println(sb2.length());
	}
	
	public static String arr2String(int[] arr){
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		
		for(int i = 0 ; i < arr.length; i++){
			if(i == arr.length-1){	//�������飬��������һ�����������],�����,�ո�����
				//sb.append(arr[i]+"]");
				sb.append(arr[i]).append("]");
				//����ڶ��ַ���Ч�ʸߣ���Ϊʹ�á�+���Ļ���Ҫ�ײ�����StringBuffer������append�ٷ���String��
				//Ч�ʱȽϲ����append�����޸�ͬһ��Buffer
			}else{
				sb.append(arr[i]).append(", ");
			}
		}
		return sb.toString();
	}

}
