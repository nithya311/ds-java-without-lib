public class Linkedlist {
private Node head;
public IntLinkedList(int item) {
head = new Node();
head.value = item;
head.link = null;
}

public boolean insert(int item) {
Node n = new Node();
//n.value = item;
//n.link = head;
//head = n;
//return true;
Node new_node;
new_node = head;
while(new_node.link!=null) {
new_node = new_node.link;
}
n.value = item;
n.link = null;
new_node.link = n;
return true;
}

class Node {
private int value;
private Node link;
}

public void printlist() {
Node z = head;
while(z!=null) {
 System.out.println(z.value);
z = z.link;
}

public boolean delete(int item) {
if(head.value == item) {
head = head.link;
return true;
}
else {
Node x = head;
Node y = head.link;
while(true) {
if(y == null || y.value == item) {
break;
}
else {
x = y;
y = y.link;
}
}
if(y!=null) {
x.link = y.link;
return true;
}
else {
return false;
}
}

public void sort() {
int c = 0;
Node a = head.link;
while(a.link!=null){
Node b = head.link;
while(b.link!=null) {
if(b.value <b.link.value) {
c = b.value;
b.value = b.link.value;
b.link.value = c;
}
b = b.link;
}
a = a.link;
}
}








