package Test.MultiLevelInheritance;

 class Parent {
    void ParentClassMethod(){
        System.out.println("Hello I am the Parent");
    }
}

 class Child extends Parent {
    void ChildClassMethod(){
        System.out.println("Hello I am Child Class Method");
        this.ParentClassMethod();
    }
}

 class GrandChild extends Child{
    void GrandchildClassMethod(){
        System.out.println("Hello I am the GrandChild");
        this.ChildClassMethod();
        this.ParentClassMethod();
    }
}


public class MultiLevelInheritance {

    public static void main(String[] args) {
        GrandChild GrandchildObj = new GrandChild();
        GrandchildObj.GrandchildClassMethod();
        GrandchildObj.ChildClassMethod();
        GrandchildObj.ParentClassMethod();
    }
    
}