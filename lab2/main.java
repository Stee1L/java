public class main {
    public static void main(String[] args)
    {
        Stack a = new Stack(10);
        System.out.println("Stack: ");
        for(int i = 0; i < 10; i++)
        {
            a.push(i * i);
            System.out.print(a.peek() + " ");
        }

        Stack b = new Stack(10);

        for(int i = 0; i < 10; i++)
        {
            b.push(a.pop());
        }

        if(a.isEmpty()) System.out.println("\nStack a is empty!\n");
        else System.out.println("\nStack a is not empty!\n");

        for(int i = 0; i < 10; i++)
            System.out.print(b.pop() + " ");

        if(b.isEmpty()) System.out.print("\nStack b is empty!");
        else System.out.print("\nStack b is not empty!");
    }
}
