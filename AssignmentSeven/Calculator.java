import java.util.*;
public class Calculator {
    int result;
    static int operationCount;
    void add(int a,int b){
        result = a + b ;
        operationCount++;
        System.out.println("Addition: " + result);
    }
    static void displayOperationCount(){
        System.out.println("Total operations: " + operationCount);
    }
    public static void main(String[] args){
        Calculator obj = new Calculator();
        obj.add(1,2);
        displayOperationCount();
        Calculator obj2 = new Calculator();
        obj2.add(5,7);
        displayOperationCount();
    }
}
