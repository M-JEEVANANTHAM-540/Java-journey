import java.util.Scanner;
public class test{
    
    public static void print_statements(){
        System.out.println("I'm Jeeva");
        System.out.println("I'm studying AD");
        System.out.println("I'm from Coimbatore");
    }
    public static void variables(){
        String name="Jeevanantham";
        int age=18;
        double cgpa=8.7;
        String clg="Karpagam college of engineering";
        System.out.println("Name:"+name);
        System.out.println("age:"+age);
        System.out.println("cgpa:"+cgpa);
        System.out.println("college:"+clg);
    }


    public static void getting_input() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name:");
        String name=sc.nextLine();
        System.out.print("Hello "+name+"\n");
        System.out.print("Enter your age:");
        int age=sc.nextInt();
        System.out.print("You are "+age+" years old\n");
        System.out.print("Enter your cgpa:");
        double cgpa=sc.nextDouble();
        System.out.print("Your cgpa is "+cgpa);

        sc.close();
    }
public static void main(String[] args) {
         print_statements();
         variables();
        getting_input();
    }
    
}











