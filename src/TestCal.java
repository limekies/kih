import java.util.*;
public class TestCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("请输入一个数字");
		int  g=s.nextInt();
		while(true){	
			 
		System.out.println("请输入一个运算方式，+,-,*,/");
		String l=s.next();
		System.out.println("请输入一个数字");
		int  f=s.nextInt();	
		
		char ch=l.charAt(0);
		//创建一个Cal的对象
		
		Cal cl = new Cal();
		
		//属性：赋值
		cl.a = g;
		cl.b = f;
		
		//行为：运算
		if(ch=='+'){
		int c=cl.jia();
		g=c;
		System.out.println("结果是"+c);
		}else if(ch=='-'){
		//...
		 int c=cl.jian();
		 g=c;
		System.out.println("结果是"+c);
		}else if(ch=='*'){
		int  c=cl.cheng();
		g=c;
		System.out.println("结果是"+c);
		}else if(ch=='/'){
		int c=cl.chu();
		g=c;
		System.out.println("结果是"+c);
		}else{
			System.out.println("输入有误");
		}
		
		}
		
	}//何雨uy是小天池

}
