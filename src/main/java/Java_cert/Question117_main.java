package Java_cert;

public class Question117_main {

    public static void main(String[] args) {
        Question117 employee = new Question117();
        Manager manager=new Manager();
        Director director=new Director();
        //manager .stockoptions = 500;
        director .stockoptions = 1000;
        director .salary = 80000;
        //employee .budget = 200000;
        employee .salary = 50000;
        manager .budget = 1000000;
    }
}
//Options A and D will fail to compile as the values are not declared in the class
//Correct andwer is A and D.


