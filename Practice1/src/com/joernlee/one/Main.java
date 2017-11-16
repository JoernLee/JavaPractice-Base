package com.joernlee.one;

import java.util.Scanner;

public class Main {
	/**
	小易准备去魔法王国采购魔法神器,购买魔法神器需要使用魔法币,但是小易现在一枚魔法币都没有,
	但是小易有两台魔法机器可以通过投入x(x可以为0)个魔法币产生更多的魔法币。
	魔法机器1:如果投入x个魔法币,魔法机器会将其变为2x+1个魔法币
	魔法机器2:如果投入x个魔法币,魔法机器会将其变为2x+2个魔法币
	易采购魔法神器总共需要n个魔法币,所以小易只能通过两台魔法机器产生恰好n个魔法币,小易需要你帮他设计一个投入方案使他最后恰好拥有n个魔法币。 
	 * */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//获取输入的要求硬币数
		String in = StringUtils.getPrintln();
		System.out.println(in);
		//通过迭代的方法获得使用魔法机器的顺序
		StringBuffer record = new StringBuffer("");
		String out = calMachine(Integer.parseInt(in), record);
		//输出结果
		System.out.println(out);
	}
	
	private static String calMachine(int number,StringBuffer record){
		while(number != 0){
			if(number % 2 == 0){
				number = (number-2)/2;
				record = record.append("2");
			}else if(number % 2 == 1){
				number = (number - 1)/2;
				record = record.append("1");
			}
		}
		
		return record.reverse().toString();
	}
	
}
