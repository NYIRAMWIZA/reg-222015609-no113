
public class workt1 {// class name
    public static void main(String[] args) {// main method
        var classd = new ClassD();
        classd.print("thanks");
        classd.saysalute();// call of saysalute method
        classd.sayHi();// call of sayhi method
        classd.sayByi();// callof saybyi method
        classd.classDMethod();//call of classDmethod
        System.out.println("Hello again!");//print output
    }// end of main method
}// end of main class
class ClassA implements InterfaceE {//class A implements interface
    public void saysalute(){ 
        System.out.println("Hello, again!");
    }
    
    public void print(String message) {
        System.out.println(message);
    }
}

class ClassB extends ClassA {// classB extends classA

    public void sayHi(){//method
        System.out.println("Hi, all of us!");
    }
}

class ClassC extends ClassB implements InterfaceE {//class C extends classB and implements interface

    public void sayByi(){// method 2
        System.out.println("Byi, all of us!");// print output
    }
    
    public void print(String message) {
        super.print(message);
    }
}

class ClassD extends ClassC {// classD extends classC
    public void classDMethod(){
        System.out.println("In class D.");
    }
}

interface InterfaceE {
    void print(String message);// output
}
