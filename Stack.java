import java.io.*;
public class Stack {

private int stack[];
private int top;
private int size;

public Stack(int size) {
top= -1;
this.size = size;
stack = new int[this.size];
}

public boolean push(int n) {
top++;
if(!isFull()) {
stack[top] = n;
return true;
}
else {
return false;
}
}

public int pop() {
if(!isEmpty()) {
top--;
}
return stack[top];
}

public boolean isEmpty() {
if(top == -1)
 return true;
else
return false;
}

public boolean isFull() {
if(top == size)
return true;
else
return false;
}

public static void main(String args[]) {
Stack st = new Stack(5);
System.out.println(st.isEmpty());
boolean p = st.push(1);
System.out.println(p);
p = st.push(2);
System.out.println(p);
p = st.push(3);
System.out.println(p);
p = st.push(4);
System.out.println(p);
p = st.push(5);
System.out.println(p);
p = st.push(6);
System.out.println(p);
System.out.println(st.isFull());

int x = st.pop();
System.out.println(x);
}
}



