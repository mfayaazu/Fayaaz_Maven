package Java_cert;/*interface Exportable{
    void export();
}

class Tool implements Exportable{
    protected void export(){
        System.out.println("Tool::export");
    }
}
class Question134 extends Tool implements Exportable {

    public void export(){
        System.out.println("RTool::export");
    }

    public static void main(String[] args) {
        Tool aTool =  new Question134();
        Tool bTool =  new Tool();
//        callExport(aTool);
//        callExport(bTool);
    }
    public static void callExport(Exportable ex){
        ex.export();
    }
}*/


//Option : B
//Reason : export have different access modifiers in Interface and Exportable.