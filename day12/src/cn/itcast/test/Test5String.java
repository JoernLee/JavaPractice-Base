package cn.itcast.test;

public class Test5String {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s1 = "aasjoernbasdjoern165465joern12323341325joernjoern13213267";
		String s2 = "joern";
		int num = 0;
		while(s1.length()>= s2.length() && s1.indexOf(s2)>= 0){
			int index = s1.indexOf(s2);
			num++;
			s1 = s1.substring(index + s2.length());
		}
		
		System.out.println(num);
	}

}
