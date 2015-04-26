import java.util.*;
public class StackImpl{
static	int top = -1;
public static void main(String[] args){

Scanner scan = new Scanner(System.in);
String s1 = scan.nextLine();
String s2 = scan.nextLine();
String s3 = scan.nextLine();
int size = 3;
String[] stackArray = {"","",""};


stackPush(s1, stackArray);
stackPeek(stackArray);
System.out.println("top value " + top);
stackPush(s2, stackArray);
stackPeek(stackArray);
System.out.println("top value " + top);
stackPush(s3, stackArray);
stackPeek(stackArray);
System.out.println("top value " + top);
}

public static void stackPush(String elem, String[] stackArray){
stackArray[++top] = elem;
}
public static void stackPeek(String[] stackArray){
System.out.println(stackArray[top]);
}
}