package Java_cert;

class Question112 {
    String type = "4W";
    int maxSpeed = 100;
    Question112(){

    }

    public Question112(String type, int maxSpeed) {
        this.type = type;
        this.maxSpeed = maxSpeed;
    }
}

    class Q_Car extends Question112{
        String trans;

        Q_Car(String trans){                      //Line N1
            this.trans=trans;

        }

        Q_Car(String type, int maxSpeed, String trans){
           // super(type,maxSpeed);
            this(trans);                        //Line N2
        }
    }



//Output is Line n1 and line n2 gives compilation error.
//Correct option is B
//Line N1 gives error because there is no default constructor in Question112
//Line N2 give error because Call to 'this()' must be first statement in constructor body

