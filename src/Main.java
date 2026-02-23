import service.LRUService;

import java.util.Scanner;

class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Create a LRU Cache");
        System.out.println("Enter the capacity :");
        int capacity = sc.nextInt();

        LRUService service = new LRUService(capacity);

        while (true)
        {
                System.out.println("1.Put");
                System.out.println("2.Get");
                System.out.println("3.Exit");

                System.out.println("Enter your choice :");
                int choice = sc.nextInt();

                if(choice == 1)
                {
                    System.out.println("Enter the key");
                    int key= sc.nextInt();
                    System.out.println("Enter the value");
                    int value= sc.nextInt();
                    service.put(key,value);
                    continue;
                }
                else if(choice == 2)
                {
                    System.out.println("Enter the Key");
                    int key = sc.nextInt();
                    service.get(key);
                    continue;
                }
                else
                {
                    System.out.println("Exiting....");
                    break;
                }


        }
    }
}