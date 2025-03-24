import java.util.*;

class queueop
{
    int q[];
    int f, r, size;
    
    // Constructor to initialize the queue
    queueop(int n)
    {
        q = new int[n]; // Initialize array with user-defined size
        f = -1;
        r = -1;
        size = n;
    }

    // Method to insert elements into the queue
    void insertqueue(int item)
    {
        if (r == size - 1) // Check if the queue is full
            System.out.println("Queue Overflow");
        else
        {
            if (f == -1 && r == -1) // Initial condition, setting up front and rear
            {
                f = 0;
                r = 0;
            }
            else
                r = r + 1;
            q[r] = item; // Insert element at rear
        }
    }

    // Method to delete elements from the queue
    void deletequeue()
    {
        if (f == -1 && r == -1) // Check if the queue is empty
            System.out.println("Queue Underflows");
        else
        {
            int val = q[f]; // Store the element being deleted
            System.out.println("Deleted element: " + val);

            if (f == r) // If only one element was in the queue
            {
                f = -1;
                r = -1;
            }
            else
                f = f + 1;
        }
    }

    // Method to display the elements of the queue
    void display()
    {
        if (f == -1 && r == -1)
            System.out.println("QUEUE UNDERFLOWS");
        else
        {
            System.out.println("Elements of the queue:");
            for (int j = f; j <= r; j++) // Use <= to include the last element
                System.out.println(q[j]);
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the queue: ");
        int n = sc.nextInt();
        
        queueop obj = new queueop(n);
        
        while(true)
        {
            System.out.println("\nQueue Operations: ");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            
            switch(choice)
            {
                case 1:
                    System.out.print("Enter the element to be inserted: ");
                    int item = sc.nextInt();
                    obj.insertqueue(item);
                    break;
                    
                case 2:
                    obj.deletequeue();
                    break;
                    
                case 3:
                    obj.display();
                    break;
                    
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                    
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
