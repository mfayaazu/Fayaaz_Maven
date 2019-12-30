package Java_cert;

public class Question110_Myfield {

        int x;
        int y;
        public void doStuff(int x, int y) {
            this.x = x;
            y = this.y;
        }

        public void display(){
            System.out.print(x + " " + y + " : ");
        }

        public static void main(String []args){
            Question110_Myfield m1 = new Question110_Myfield();
            m1.x = 100;
            m1.y = 200;
            Question110_Myfield m2 = new Question110_Myfield();
            m2.doStuff(m1.x,m1.y);
            m1.display();
            m2.display();

        }

    }
    /*
       Output : 100 200 : 100 0
    Correct Answer : C
    Reason : For m1 object values are directly assigned so 100 200 is printed. For m2 object doStuff method is called and so 100 0 is printed.

     */
