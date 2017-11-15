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
		System.out.println(sb);	 //全部输出，调用了StringBuffer的toString方法
		System.out.println(sb2); //同上，都全部输出
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
			if(i == arr.length-1){	//遍历数组，如果是最后一个索引，添加],否则和,空格连接
				//sb.append(arr[i]+"]");
				sb.append(arr[i]).append("]");
				//上面第二种方法效率高，因为使用“+”的话需要底层生成StringBuffer，调用append再返回String类
				//效率比较差，连着append都是修改同一个Buffer
			}else{
				sb.append(arr[i]).append(", ");
			}
		}
		return sb.toString();
	}

}
