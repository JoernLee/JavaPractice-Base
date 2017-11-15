package cn.itcast.test;

public class Test3String {

	/**
	 * @param args
	 * 把数组中数据按照[1,2,3]格式拼接为字符串
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
			
			//用三元运算符
			temp = temp + ((i == arr.length - 1) ? arr[i] + "]" : arr[i] + ", "); 
			
		}
		
		System.out.println(temp);
	}

}
