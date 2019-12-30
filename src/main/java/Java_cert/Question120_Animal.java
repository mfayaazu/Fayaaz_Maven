package Java_cert;

class Question120_Animal {
    String type ="Canine";
    int maxSpeed=60;

    Question120_Animal(){}
    Question120_Animal(String type,int maxSpeed){
        this.type=type;
        this.maxSpeed=maxSpeed;
    }
}

class WildAnimal extends Question120_Animal{
    String bounds;

    WildAnimal(String bounds){
        //line n1
        super();
        this.bounds=bounds;
    }
    WildAnimal(String type,int maxSpeed,String bounds){
        //line n2
        super (type, maxSpeed) ; this.bounds = bounds;
    }
}
/*
Output:
Canine 60 Long
Feline 80 Short

Correct Answer is : A,E
 */


