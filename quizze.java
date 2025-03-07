import java.util.*;

class quizze{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("WELCOME TO LEARN WITH quizze");
        System.out.println("Do you want to play?");
        String user=scan.nextLine();
        if (!user.equalsIgnoreCase("yes")){
            System.exit(0);
        }
       else{
        System.out.println("lets start");
       }

       int score=0;

       System.out.println("How many days are there in a week?");
       String userq=scan.nextLine();
       if(userq.equals("7")){
        System.out.println("correct");
        score+=1;
       }
       else{
        System.out.println("incorrect");
       }


       System.out.println("How many months are there in a year?");
       String user1=scan.nextLine();
       if(user1.equals("12")){
        System.out.println("correct");
        score+=1;
       }
       else{
        System.out.println("incorrect");
       }


       System.out.println("How many hours are there in a day?");
       String user2=scan.nextLine();
       if(user2.equals("24")){
        System.out.println("correct");
        score+=1;
       }
       else{
        System.out.println("incorrect");
       }

       System.out.println("your score is"+score);
       
    }
}