package stack;
class Stack {
	String arr[];
	int topofstack;
	
	public void create (int size) {
		arr=new String[size];
		topofstack=-1;
		System.out.println("Stack is created");		
	}
	
	public boolean isFull() {
		if(topofstack==arr.length-1) {
			System.out.println("Stack is Full");
			return true;
		}
		return false;
	}
	
	public boolean isEmpty() {
		if(topofstack==-1) {
			System.out.println("Stack is Empty");
			return true;
		}
		return false;
	}
	
	public void push(String s) {
		arr[topofstack+1]=s;
		topofstack++;
		System.out.println(s+" is pushed in the stack");
	}
	
	public String peek() {
		return arr[topofstack];
	}
	
	public void pop()
	{   
		String s=arr[topofstack];
		topofstack--;
		System.out.println(s+" is poped");
	}
}

public class Evaluate_Reverse_Polish_Notation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack=new Stack();
		String s[]= {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
		stack.create(s.length);
		for(int i=0;i<s.length;i++) {
		 if(s[i]=="+") {
		  	int v= Integer.parseInt(stack.arr[stack.topofstack-1])+Integer.parseInt(stack.arr[stack.topofstack]);
		  	stack.pop();
		  	stack.pop();
		  	stack.push(Integer.toString(v));
		 }
		 else if(s[i]=="*") {
			 System.out.println(stack.topofstack);
			 int v= Integer.parseInt(stack.arr[stack.topofstack-1])*Integer.parseInt(stack.arr[stack.topofstack]);
			 System.out.println(v);
			  	stack.pop();
			  	stack.pop();
			  	stack.push(Integer.toString(v));
		 }
		 else if(s[i]=="/") {
			 System.out.println(stack.topofstack);
			 int v= Integer.parseInt(stack.arr[stack.topofstack-1])/Integer.parseInt(stack.arr[stack.topofstack]);
			 System.out.println(v);
			  	stack.pop();
			  	stack.pop();
			  	stack.push(Integer.toString(v));
		 }
		 else if(s[i]=="-") {
			 System.out.println(stack.topofstack);
			 int v= Integer.parseInt(stack.arr[stack.topofstack-1])-Integer.parseInt(stack.arr[stack.topofstack]);
			 System.out.println(v);
			  	stack.pop();
			  	stack.pop();
			  	stack.push(Integer.toString(v));
		 }
		 else {
			 stack.push(s[i]);
		 }
	   }
	}

}
