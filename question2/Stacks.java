package question2;

public class Stacks {
int[] array1;
int top;
int maxSize;
public Stacks(int size) {
array1 = new int[size];
top = -1;
maxSize = 0;
}
public int size() {
return maxSize;
}
void push(int value) {
if (top < array1.length - 1) {
array1[++top] = value;
maxSize++;
}
else {
System.out.println("Full");
}
}
public int pop() {
if (top >= 0) {
int data = array1[top--];
maxSize--;
return data;
}
return -1;
}
public static void main(String[] args) {
Stacks plates = new Stacks(5);
plates.push(90);
plates.push(80);
plates.push(70);

plates.pop();

for (int k = 0; k < plates.maxSize; k++) {
System.out.println(plates.array1[k]);
}
}
}
