public class ChildClass extends ParentClass{
    public static void staticMethod() {
        System.out.println("child static method");
    }

    @Override
    public void testMethod() {
        System.out.println("child method");
    }

    public void childMethod() {
        System.out.println("parent method");
    }

    public static void main(String[] args) {
        ParentClass pc = new ChildClass();
        //here pc is a reference variable of type ParentClass
        //and object is of type ChildClass
        //method resolution takes place at compile time, so parent method is called because variable is of type parent
        pc.staticMethod();//parent static method
        pc.testMethod(); //child method
        pc.parentMethod();//parent method
        //pc.childMethod //Not Possible

        ChildClass cc = new ChildClass();
        cc.staticMethod();//child static method

        ParentClass pcm = new ParentClass();
        pcm.parentMethod();
        pcm.testMethod();

    }
}

class ParentClass {
    public static void staticMethod() {
        System.out.println("parent static method");
    }

    public void testMethod() {
        System.out.println("parent method");
    }

    public void parentMethod() {
        System.out.println("parent method");
    }
}
