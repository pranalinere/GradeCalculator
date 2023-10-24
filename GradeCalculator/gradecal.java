import java.util.Scanner;

class gradecal{

    public static void studGradeCal()
    {
        float total, average, percentage;
        char grade;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of 5 subjects out of 100 marks");
        System.out.println("Enter the marks of English :");
        float English = sc.nextFloat();

        System.out.println("Enter the marks of Math :");
        float Math = sc.nextFloat();

        System.out.println("Enter the marks of Science :");
        float Science = sc.nextFloat();

        System.out.println("Enter the marks of Marathi :");
        float Marathi = sc.nextFloat();

        System.out.println("Enter the marks of Hindi :");
        float Hindi = sc.nextFloat();

         total = English + Math + Science + Marathi + Hindi;
         average = (float)(total / 5.0);
         percentage = (float)((total / 500.0) * 100);

        if(average>=90)
            grade = 'A';

        else if(average>=80 && average<90)
            grade = 'B';

        else if(average>=70 && average<80)
            grade = 'C';
        
        else if(average>=60 && average<70)
            grade = 'D';
        
        else
            grade = 'E';
        
        System.out.println("\nEnglish marks :"+ English);
        System.out.println("Math marks :"+ Math);
        System.out.println("Science marks :"+ Science);
        System.out.println("Marathi marks :"+ Marathi);
        System.out.println("Hindi marks :"+ Hindi);

        System.out.println("\nThe Total marks   = " + total + "/500.0");
        System.out.println("The Average marks = " + average);
        System.out.println("The Percentage    = " + percentage + "%");
        System.out.println("The Grade         = '" + grade + "'");

    } 
    public static void main(String[] args)
    {
        studGradeCal();
    }
}