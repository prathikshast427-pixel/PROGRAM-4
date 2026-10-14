public class Stack {
    int [] stack = new int[5];
    int top=-1;
    void push(int val){
        if(top==stack.length-1){
            System.out.println("stackoverflow");
        }
        else{
            top++;
            stack[top]=val;
            System.out.println(val+"pushed onto stack");
        }
    }
    void pop(){
        if(top==1){
            System.out.println("stackunderflow");
        }
        else{
            int val=stack[top];
            top--;
            System.out.println(val +"poped out of stack");
        }
    }
    void display(){
        if(top==-1){
            System.out.println("stack is empty");
        }
        else{
            System.out.println("elements are");
            for (int i =top;i>=0;i--) {
                System.out.println(stack[i]);
            }
        }
    }
}
