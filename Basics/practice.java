import java.util.Scanner;
public class practice{
    
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

    public static void understanding_loops(){
//         analyzing 1 → n, let the user repeatedly enter numbers.

            // Keep accepting numbers until they enter -1.

            // Then display:

            // Sum
            // Average
            // Largest number
            // Smallest number
            // Count of even numbers
            // Count of odd numbers
            int num;
            int largest=Integer.MIN_VALUE;
            int smallest=Integer.MAX_VALUE;
            int div=0;
            int sum=0;
            int even=0;
            int odd=0;
            do{
                System.out.println("Enter the number:");
                Scanner sc=new Scanner(System.in);
                num=sc.nextInt();
                if (num==-1){
                    break;
                }
                else{
                    sum+=num;
                    div+=1;
                    if (num<smallest){
                        smallest=num;
                    }
                    if(num>largest){
                        largest=num;
                    }
                        if (num%2==0){
                        even+=1;
                            }
                        else{
                        odd+=1;
                        }}
                
            }while (num!=-1);
                
            
            System.out.println("Largest number:"+largest);
            System.out.println("smallest number:"+smallest);
            System.out.println("Average:"+(sum/div));
            System.out.println("No of even numbers:"+even);
            System.out.println("No of odd numbers:"+odd);
        
       
    }

public static void main(String[] args) {
         print_statements();
         variables();
         getting_input();
         understanding_loops();
    }
    
}

// checking git status



















































