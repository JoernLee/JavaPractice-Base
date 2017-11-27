package com.joernlee.three;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		//1.mathLearn();
		//2.系统类方法：gc垃圾回收，exit退出虚拟机，还有标准输入输出错误流；currentTimeMillis，返回与世界时1970.1.1的时间差（毫秒值）。可以通过相减的方式确定经过时间。
		//3.bigIntegerLearn();
		//4.bigDecimalLearn();
		//5.Date类学习
		//dataLearn();
		//6.DataFormate类学习
		//dateFormatLearn();
		//7.Calendar类学习
		//calendarLearn();
	}

	private static void calendarLearn() {
		/*
		 * 日历类，Calendar 类是一个抽象类，它为特定瞬间与一组诸如 YEAR、MONTH、DAY_OF_MONTH、HOUR 等 日历字段之间的转换提供了一些方法，并为操作日历字段（例如获得下星期的日期）提供了一些方法。
		 * 瞬间可用毫秒值来表示，它是距历元（即格林威治标准时间 1970 年 1 月 1 日的 00:00:00.000，格里高利历）的偏移量。
		 * */
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);			//通过指定的字段获取日期值
		System.out.println(year); //2017
		int month = c.get(Calendar.MONTH);
		System.out.println(month + 1); //注意加1，9
		int day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(day); //28
		
		/*
		 * public abstract void add(int field,int amount)根据日历的规则，为给定的日历字段添加或减去指定的时间量。
		 * 例如，要从当前日历时间减去 5 天，可以通过调用以下方法做到这一点： add(Calendar.DAY_OF_MONTH, -5)。
		 * */
		//就是对前面字段修改
		//set方法就是修改时间参数
		Calendar c1 = Calendar.getInstance();
		//c.add(Calendar.MONTH, -3);					//(int field,int amount)amout变量对前面的日期字段增加或减少(根据正负数)
		//c.set(Calendar.YEAR, 2000);
		c1.set(2008, 2, 8);
		System.out.println(c1.get(Calendar.YEAR));
		System.out.println(c1.get(Calendar.MONTH) + 1);
		System.out.println(c1.get(Calendar.DAY_OF_MONTH));
	}

	private static void dateFormatLearn() throws ParseException {
		/*
		 * SimpleDateFormat 是一个以与语言环境有关的方式来格式化和解析日期的具体类。它允许进行格式化（日期 -> 文本）、解析（文本 -> 日期）和规范化。 
		 * SimpleDateFormat 使得可以选择任何用户定义的日期-时间格式的模式。但是，仍然建议通过 DateFormat 中的 getTimeInstance、getDateInstance 或 getDateTimeInstance 来创建日期-时间格式器。
		 * 每一个这样的类方法都能够返回一个以默认格式模式初始化的日期/时间格式器。
		 * 可以根据需要使用 applyPattern 方法来修改格式模式。有关使用这些方法的更多信息，请参阅 DateFormat。 API里面有如何指定格式
		 * 
		 * 
		 * */
		Date d = new Date();
		DateFormat df = DateFormat.getDateInstance();		//返回DateFormat的子类对象
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");//这个首先大小写和具体位数没有限制，但是y，m，d这类代表的是不能变的，你可以看下源码
		
		System.out.println(d);   
		System.out.println(df.format(d)); //这个是DateFromat初始的格式
		String time = sdf.format(d);
		System.out.println(time);		//继承自DateFormat
		
		//把字符串转化为时间
		String str = "2012年3月22日 08:30:30";
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		Date d2 = sdf2.parse(str);					//将日期字符串转换成日期对象
		System.out.println(d2);
	}

	private static void dataLearn() {
		//该类很多方法过时了，
		Date d1 = new Date();				//创建当前时间对象
		System.out.println(d1);
		
		Date d2 = new Date(1000);			//根据指定的毫秒值创建时间对象
		System.out.println(d2);
		
		d2.setTime(10000000);
		System.out.println(d2);
		
		System.out.println(d2.getTime());
	}

	private static void bigDecimalLearn() {
		//System.out.println(2.0 - 1.1);
				/*BigDecimal b1 = new BigDecimal(2.0);		//用double数当作参数可以,但是开发不用
				BigDecimal b2 = new BigDecimal(1.1);
				
				System.out.println(b1.subtract(b2));
				BigDecimal b1 = new BigDecimal("2.0");		//推荐使用	
				BigDecimal b2 = new BigDecimal("1.1");
				System.out.println(b1.subtract(b2));*/
				
				BigDecimal b1 = BigDecimal.valueOf(2.0);	//推荐使用
				BigDecimal b2 = BigDecimal.valueOf(1.1);
				System.out.println(b1.subtract(b2));
	}

	private static void bigIntegerLearn() {
		BigInteger b1 = new BigInteger("100");
		BigInteger b2 = new BigInteger("2");
		//System.out.println(b1.add(b2));				//+
		//System.out.println(b1.subtract(b2));		//-
		//System.out.println(b1.multiply(b2));  		//*
		//System.out.println(b1.divide(b2));  		//除
		BigInteger[] arr = b1.divideAndRemainder(b2);	//商和余数
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		//50和0
	}

	private static void mathLearn() {
		// TODO 自动生成的方法存根
		//System.out.println(Math.PI);
		//System.out.println(Math.abs(-10));				//取绝对值
		//System.out.println(Math.abs(10));					
		//System.out.println(Math.ceil(12.33));				//天花板(向上取整,但是是一个double数)
		//System.out.println(Math.ceil(12.77));
		//System.out.println(Math.floor(12.33));			//地板(向下取整,但是是一个double数)
		//System.out.println(Math.floor(12.77));
		//System.out.println(Math.max(10, 100));
		//System.out.println(Math.pow(2, 3));	 			//2.0 ^ 3.0次方
		//System.out.println(Math.random());				//随机数(0.0 - 1.0之间,不包括1.0)
		//System.out.println(Math.round(12.33));
		//System.out.println(Math.round(12.53));			//四舍五入
		//System.out.println(Math.sqrt(9));	 				//开平方
	}

}
