package Java_cert;

public class Question113 {

    public String name;
    public int  moons;

    public Question113(String name, int moons) {
        this.name = name;
        this.moons = moons;
    }


    public static void main(String[] args) {
        Question113[] question113s={
                new Question113("Mercury",0),
                new Question113("Venus",0),
                new Question113("Earth",1),
                new Question113("Mars",2)
        };
        System.out.println(question113s);
        System.out.println(question113s[2]);
        System.out.println(question113s[2].moons);
    }
}


//Output:
/*[LJava_cert.Question113;@5e2de80c
Java_cert.Question113@1d44bcfa
1
*/
//Correct option is D
