package cn.itcast.test;

public class Test2String {

	/**
	 * @param args
	 * 需求：统计一个字符串大写字母，小写字母，数字字符出现字数
	 */
	public static void main(String[] args) {
		String s = "AavvrgDS122354AAss2%%%";
		int big = 0;	//记录大写
		int small = 0;  //记录小写
		int num = 0;   // 记录数字
		int other = 0; //记录其他
		
		for(int i = 0; i < s.length(); i++){
			char temp = s.charAt(i); //临时变量记录每一个字符
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
		
		System.out.println("字符串中大写字母" + big + "个 " + "小写字母" + small + "个 " + "数字" + num + "个 " 
				+ "其他字符" + other + "个");
	}

}
