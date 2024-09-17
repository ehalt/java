 class stackOfIntegers{
    
    private int[] elements;
    private int size=0;
    
    public static final int DEFAULT_CAPACITY=10;
    
    
    public stackOfIntegers(){
        this (DEFAULT_CAPACITY);
    }
    
    public stackOfIntegers(int capacity){
        elements=new int[capacity];
    }
    
    public void push(int value){
        if(size>=elements.length)
            System.out.println("Stack is Full");
        else
        elements[size++]=value;
    }
    
     public int pop(){
        if(size==0)
           { System.out.println("Stack is Empty"); return -1;}
        else
            return (elements[--size]);
    }
    
    public boolean empty(){
        return size==0;
    }
    public int returnSize(){
        return elements.length;
    }
}

public class TestStack{

    public static void main(String[] args){
        int i,l;
        stackOfIntegers stack=new stackOfIntegers( );
        
        for( i=0;i<stack.returnSize();i++)
            stack.push(i);
            
             stack.push(10);
        //while((l=stack.pop())>0){
        while(!stack.empty()){
            System.out.println(stack.pop()+ "  ");
        }
        int l1=stack.pop();
    }
    
}