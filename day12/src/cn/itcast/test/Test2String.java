package cn.itcast.test;

public class Test2String {

	/**
	 * @param args
	 * ����ͳ��һ���ַ�����д��ĸ��Сд��ĸ�������ַ���������
	 */
	public static void main(String[] args) {
		String s = "AavvrgDS122354AAss2%%%";
		int big = 0;	//��¼��д
		int small = 0;  //��¼Сд
		int num = 0;   // ��¼����
		int other = 0; //��¼����
		
		for(int i = 0; i < s.length(); i++){
			char temp = s.charAt(i); //��ʱ������¼ÿһ���ַ�
			if(temp >= 'A' && temp <= 'Z'){
				big++;
			}else if(temp >= 'a' && temp <= 'z'){
				small++;
			}else if(temp >= '0' && temp <= '9'){
				num++;
			}else{
				other++;
			}
		}
		String.valueOf(big);
		
		System.out.println("�ַ����д�д��ĸ" + big + "�� " + "Сд��ĸ" + small + "�� " + "����" + num + "�� " 
				+ "�����ַ�" + other + "��");
	}

}
