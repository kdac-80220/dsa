package com.shivshankar.assignment3q1;

public class PrefixCalculation {

	public static int calculate(int op1,int op2,char ele)
	{
		switch(ele)
		{
			case '+':return op1+op2;
			case '-':return op1-op2;
			case '*':return op1*op2;
			case '/':return op1/op2;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		Stack st=new Stack(10);
		String prefix="-++4/*56397";
		for(int i=prefix.length()-1;i>=0;i--)
		{
			char ele=prefix.charAt(i);
			if(Character.isDigit(ele))
			{
				st.push(ele-'0');
			}else {
				int op1=st.pop();
				int op2=st.pop();
				
				int result=calculate(op1, op2, ele);
				st.push(result);
			}
		}
		System.out.println("Infix Statement result: "+st.pop());
	}

}
