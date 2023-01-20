package stack;
class Stack2{
	char arr[];
	int topofstack;
	
	public Stack2(int size) {
		arr=new char[size];
		topofstack=-1;
	}
	
	public boolean isEmpty() {
		if(topofstack==-1) {
			return true;
		}
		return false;
	}
	
	public boolean isFull() {
		if(topofstack==arr.length) {
			return true;
		}
		return false;
	}
	
	public void push(char value) {
		arr[topofstack+1]=value;
		topofstack++;
		System.out.println(value+" is pushed at "+topofstack);
	}
	
	public char pop() {
		char s=arr[topofstack];
		topofstack--;
		return s;
	}
	
}
public class Basic_calculator_using_Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String question= "3+5 / 2 ";
		 String s=question.replaceAll("\\s+","");
		 System.out.println(s);
		Stack2 stack2=new Stack2(s.length());
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			stack2.push(c);
		}
		int i=stack2.topofstack;
		while(i>0) {
			if(stack2.arr[i]=='*') {
				int operand1=stack2.pop()-'0';
				stack2.pop();
				int operand2=stack2.pop()-'0';
				int v=operand2*operand1;
				char c=(char)(v+'0');
				stack2.push(c);
				i=stack2.topofstack;
			}
			else if(stack2.arr[i]=='+') {
				int operand1=stack2.pop()-'0';
				stack2.pop();
				int operand2=stack2.pop()-'0';
				int v=operand2+operand1;
				char c=(char)(v+'0');
				stack2.push(c);
				i=stack2.topofstack;
			}
			else if(stack2.arr[i]=='-') {
				int operand1=stack2.pop()-'0';
				stack2.pop();
				int operand2=stack2.pop()-'0';
				int v=operand2-operand1;
				char c=(char)(v+'0');
				stack2.push(c);
				i=stack2.topofstack;
			}
			else if(stack2.arr[i]=='/') {
				int operand1=stack2.pop()-'0';
				stack2.pop();
				int operand2=stack2.pop()-'0';
				int v=operand2/operand1;
				char c=(char)(v+'0');
				stack2.push(c);
				i=stack2.topofstack;
			}
			else {
				i--;
			}
		}
		System.out.println(stack2.arr[stack2.topofstack]);
		
		

	}

}
