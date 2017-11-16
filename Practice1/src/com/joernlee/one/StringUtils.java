package com.joernlee.one;

import java.util.Scanner;

public class StringUtils {
	
	public static String getPrintln(){
		String result = null;
		Scanner scanner = new Scanner(System.in);
		if(scanner.hasNext()){
			result = scanner.next();
		}else{
			System.out.println("ÊäÈë´íÎó");
		}
		
		return result;
	}
}
