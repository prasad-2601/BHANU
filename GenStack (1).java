import java.util.*;
class Gen<T>
{
  int maxSize;
  int  top;
  Object[] stack;
  Gen(int size)
  {
   maxSize=size;
   stack=new Object[maxSize];
   top=-1;
  }
  public boolean isEmpty()
 {
   return top==-1;
 }
 public boolean isFull()
 {
 return maxSize==top-1;
 }    
 public void push(T value)
{
 if(!isFull())
  {
    stack[++top]=value;
  }
 else
  {
     System.out.println("stack is full");
  }
}
public T pop()
{   
  if(!isEmpty())
  {
    return (T)stack[top--];
  }
 return null;
}
public void peek()
{
  if(!isEmpty())
  {
   System.out.println(stack[top]);
  }
 else
  {
  System.out.println("stack empty");
}
}
public void display()
{
  for(int i=top;i>=0;i--)
  System.out.println(stack[i]);
}
 
}
class GenStack{
 public static void main(String[] args)
  {
Scanner sc=new Scanner(System.in);
Gen<Integer> ob=new Gen<Integer>(5);
System.out.println("enter choice");
int choice=0;
while(choice!=-1)
{
choice=sc.nextInt();
  switch(choice)
{
 case 1:System.out.println("enter element");
   Integer ele=sc.nextInt();
    ob.push(ele);
   break;
  case 2:System.out.println(ob.pop());
         break;
  case 3:ob.peek();
        break;
  case 4:ob.display();
        break;
   case 5:choice=-1;
   break;
default:System.out.println("invalid option");
}
}
}

}