/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package queueact;


public class QueueAct {
    
    static int front, rear; 
    static int myQueue[] = new int [10]; 
    
    public static void DisplayQueueElements(){ 
        if(front == -1 && rear == - 1) { 
            System.out.println("Queue is Empty");
        }
        else if (rear <= front){ 
            System.out.println("Elements in Circular Queue are: ");
            for(int i = front; i <= myQueue.length - 1; i++){ 
                System.out.printf("%d ", myQueue[i]);
            }
        }
        else{ 
            for(int i = front; i < myQueue.length; i++){ 
                System.out.printf("%d", myQueue[i]);
            }
            for(int i = 0; i<=rear; i++){ 
                System.out.printf("%d", myQueue[i]);
            }
        }
    }
    
    public static void Enqueue(int n){ 
        if (((rear + 1) % myQueue.length) == front) {
            System.out.println("Queue is full.");
        }
        else if ((rear == - 1)&& (front == - 1)){ 
           front = rear = 0; 
        }
        else{ 
            rear = (rear + 1) % myQueue.length; 
        }
        myQueue[rear] = n; 
    }
    
    public static void Dequeue(){ 
        front++; 
    }
    
    public static void Front(){ 
        System.out.print("\nFront: " + myQueue[front]);
    }
    
    public static void Rear(){ 
        System.out.print("\nRear: " + myQueue[rear] + "\n");
    }
    
    public static void IsEmpty(){ 
        if(front == -1 && rear == -1){ 
            System.out.println("is it empty? : True, queue has no elements.");
            System.out.println("Is it empty? : False, queue has elements");
        }
    }
    
    public static void main(String[] args) {
        Enqueue(1);  Enqueue(2); Enqueue(3); 
        Enqueue(4); Enqueue(5); 
        Dequeue(); 
        Enqueue(6); Enqueue(7); Enqueue(8); 
        Enqueue(9); Enqueue(10); 
        
        DisplayQueueElements(); 
        Enqueue(11); 
        Front(); 
        Rear(); 
        IsEmpty(); 
        Enqueue(12); 
    }
    
}
