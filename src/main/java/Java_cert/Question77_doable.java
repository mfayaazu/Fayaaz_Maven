package Java_cert;

interface Question77_doable {
    public void doSomething(String s);
}


abstract class Task implements Question77_doable {
    public void doSomethingElse(String s) {

    }
}

abstract class Work implements Question77_doable {
    public abstract void doSomething(String s);

    public void doYourThing(Boolean b) {
    }
}

class Job implements Question77_doable {
    public void doSomething(Integer i) {
    }

    @Override
    public void doSomething(String s) {

    }
}

class Action implements Question77_doable {
    public void doSomething(Integer i) {
    }

    public void doThis(Integer j) {
    }

    @Override
    public void doSomething(String s) {

    }
}

class Do implements Question77_doable {
    public void doSomething(Integer i) {
    }

    public void doSomething(String s) {
    }

    public void doThat(String s) {
    }
}

//Explanation:
/*
Option A, although the Task class does not actually implement the DoSomething method of the Doable interface,
the Task class is an abstract class, thus allowing unimplemented methods.

Option B, abstract methods cannot have programmatic blocks.

Option C, the doSomething abstract method of the Job class differs from the doSomething method of the Doable interface,
and will not be considered as a doSomething method of implementing the Doable interface,
so the Job class cannot be compiled without the doSomething method of the actual Doable interface. .

Option D, the reason for the error is the same as option C.

Option E, doSomething method to make a successful Doable interface.
 */