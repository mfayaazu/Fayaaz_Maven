package Java_cert;

class Question8 {
    Question8() {
        System.out.println("Shape");
    }

    protected void area() {
        System.out.println("Shape");
    }
}

class Square extends Question8 {
    int side;
    Square(){
        /*insert Code Here*/
        this.side = side;
    }

    public void area() {
        System.out.println("Shape");
    }
}

class Rectangle extends Square {
    int len, br;

    Rectangle(int x, int y) {
        /*Insert Code here*/
        super();
        super.side=x;
        len = x;
        br = y;
    }

    public void area() {
        System.out.println("Rectangle");
    }
}



//Issues solved when I inserted super(); super.side=x and used Public in Rectangle class area method
//Option E and F are correct Answers