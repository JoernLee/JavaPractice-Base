package cn.itcast.string;

public class Demo2String {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//demo1();
		//demo2();
		//demo3();
		//demo4();
		//demo5();
		//String s1 = "abc";
		String s2 = "�����й���";
		//һ���ַ�������
		for(int i = 0;i < s2.length(); i++){
			System.out.println(s2.charAt(i));
			
		}
		
	}

	public static void demo5() {
		String s1 = "ab";
		String s2 = "abc";
		String s3 = s1 + "c";
		System.out.println(s2 == s3);
		System.out.println(s2.equals(s3));
	}

	public static void demo4() {
		String s1 = "a" + "b" + "c";
		String s2 = "abc";
		System.out.println(s1==s2); //java�г����Ż����ƣ��ڱ���ʱ�Ѿ�ʱabc�ַ�����
		System.out.println(s1.equals(s2));
	}

	public static void demo3() {
		String s1 = new String("abc");
		String s2 = "abc";
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}

	public static void demo2() {
		byte[] arr = {97,98,99};
		String s1 = new String(arr);
		System.out.println(s1);
	}

	public static void demo1() {
		String s1 = new String();//������ǿյ��ַ���
		System.out.println(s1);
		
		System.out.println("-----");
		
		String s3 = null;
		System.out.println(s3);//�����null�ͷ���null�����򷵻ض���toString����
	}

}
