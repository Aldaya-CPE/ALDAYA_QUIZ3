
package aldaya_quiz3;

import java.util.Scanner;

public class ALDAYA_QUIZ3{
    
    private class queNode{
        int data;
        queNode next;
    }
    private queNode head;
    private queNode tail;
    
     static int MAX = 9;
    
   
    private int [] data = new int [MAX];
       
   
    private int front = -1;
    private int rear = -1;
    

    
    public void insert(int item) throws Exception {
      
        if (rear == MAX - 1) {
            throw new Exception("Queue is full");
        }

      
        if (front == -1) {
            front = rear = 0;
            data[front] = item;
        } else {
            
            if (front != 0) {
                data[++rear] = item;
            } else {
               
                for (int i = rear + 1; i > 0; i--) {
                    data[i] = data[i - 1];
                }
                data[0] = item;
                rear++;
            }
        }
    }
   
    public void insertBeginning(int item) throws Exception {
       
        if (rear == MAX -1){
            throw new Exception ("Queue is full");
            
        }
        

        if (front == -1){
            front = rear = 0;
            data[front] = item;
        }       
        
        else {
            if (front == 0){
                throw new Exception("Cannot insert insert at the beginning, Queue is full");
            }          
           
            data[--front] = item;
        }
    }
    

    public void insertEnding (int item) throws Exception {
       
        if (rear == MAX -1){
            throw new Exception("Queeue is full");
        }
        
        data[++rear] = item;
    }
    
     public void display1 () throws Exception {
        if (front == -1){
             throw new Exception ("Queue is empty");
        }
        
        for (int i = front; i < rear + 1; i++){
            System.out.println(data[i] + "->");
        }
        
        System.out.println("NULL"); 
    }
    
    
    public void insertion1 (int index) throws Exception{
        queNode node = new queNode();
        node.data = index;
        node.next = null;
        
        if(head==null){
            head = tail = node;
            
        }else{
            tail.next = node;
            tail= node;
        }
    }
    
    public void insertion (int index) throws Exception{
        queNode node = new queNode();
        node.data = index;
        node.next = null;
        
        if(head==null){
            head = tail = node;
            
        }else{
            tail.next = node;
            tail= node;
        }
    }
    
    public void display () throws Exception{
        if (head== null){
            throw new Exception("que is emplty");
                    
        }
        
        queNode temporary = head;
        
        while (temporary!= null){
        System.out.println(temporary.data + "");
        temporary = temporary.next;
        
    }
        System.out.println("NULL \n");
    }
 
    public int deletion()throws Exception{
        if (head == null){
            throw new Exception("qeus is empty");
        }
        int temporary = head.data;
        head = head.next;
        return temporary;
    }
  
 public static void main(String[] args) throws Exception{
   
            Scanner scn = new Scanner(System.in);
             ALDAYA_QUIZ3 list = new ALDAYA_QUIZ3();
             System.out.println("Choose number");
              boolean num = true;
        
                System.out.println("Number? 1 ");
                System.out.println("Number? 2 ");
                int choi = scn.nextInt();
                
               if (choi == 1){
             while (true){
                 int choice;
                 int index;
                 
                 System.out.println("1. insert");
                 System.out.println("2. Display");
                 System.out.println("3. Delete");
                 choice = scn.nextInt();
                 
                 switch (choice){
                     case 1:
                         System.out.println("Enter Node;");
                         index = scn.nextInt();
                         list.insert(index);
                         break;
                     case 2:
                        System.out.println(" list of ques");
                        list.display1();
                        break;
                     case 3:
                         
                          System.out.println(list.deletion() +"deleted succesfully");
                         list.deletion();
                         System.out.println("\n");
                         break;
                     default:
                         throw new AssertionError();
                 }
             }
               }
               else if (choi == 2){
            while (num){
                 int index;
                
                 System.out.println("1. insert");
                 System.out.println("2. Display");
                 System.out.println("3. Delete Beginning");
                 System.out.println("4. Delete Ending");
                 
                 int secondchoi = scn.nextInt();
                 
                 switch (secondchoi){
                     case 1:
                         System.out.println("Enter Node;");
                         index = scn.nextInt();
                         list.insertion(index);
                         break;
                     case 2:
                         System.out.println(" list of ques");
                         System.out.println("this is head >" + list.tail.data);
                         System.out.println("this is tail >" + list.head.data);
                        list.display();
                        break;
                     case 3:
                         list.deletion();
                         break;
                     case 4:
//                         list.DeleteEnding();
                         break;
                     default:
                         throw new AssertionError();
                 }
             }
            }
      
 }
}


