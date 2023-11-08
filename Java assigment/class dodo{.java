class dodo{// class name
public static void main(String args[]) {// main method
    aime myobj=new aime();
    myobj.show();
    myobj.dis();
    myobj.calc();
    myobj.add();
    myobj.interfacetest();
    
}// end of main method
}// end of main class

class Daddy{
    //declaration of variable
int l=37;
int k=23;

public void add(){
    int result=l+k;// result for calculation
    System.out.println(result);// output

}
}
class keke extends Daddy{//keke extends daddy
public static void dis(){
    System.out.println("This class is called Bruno"); // the output message
}
}
class keke extends Chris{//keke extends chris
public static void calc(){
    // declaration of variable
    int v=22;
    int w=11;
    int result=v-w;//calculation 
    System.out.println(result);// print output
}
}

interface vovo {// interface
void interfacetest();
} 

class aim extends  keke implements E{// aime extends keke and implement E
public  void show() {
    System.out.println(f+g);
    
}

public void interfacetest(){

System.out.println("The interface method");  // the output
}
}

