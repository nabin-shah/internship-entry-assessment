package entryAssessment;


public class Exercise3 {
    public static void main(String[] args) {
        // Cannot directly create an instance of an abstract class
        // A abstractA = new A("Abstract A"); // This would cause a compile-time error

        B concreteB = new B("Instance of B", "Hello from B");
        C concreteC = new C();
        D objectD = new D(concreteB);

        concreteB.PrintName(); // Calls the PrintName() method of B, which in turn calls the private PrintName method
        concreteC.PrintName("Hello from C");
        objectD.processA(); // Calls the PrintName() method of the associated A object (which is a B instance)

        
    }
}



// Class A (Abstract)
abstract class A {
    protected String Name;

    public A(String name) {
        this.Name = name;
    }

    public abstract void PrintName();
}

// Class B (Extends A)
class B extends A {
    private String message;

    public B(String name, String message) {
        super(name);
        this.message = message;
    }

    private void PrintName(String message) {
        System.out.println("B: " + message);
    }

    @Override
    public void PrintName() {
        // Calls the private PrintName method
        PrintName(this.message); 
    }
}

// Class C
class C {
    public void PrintName(String message) {
        System.out.println("C: " + message);
    }
}

// Class D (relationship with A)
class D {
    private A aObject;

    public D(A a) {
        this.aObject = a;
    }

    public void processA() {
        if (aObject != null) {
            aObject.PrintName();
        } else {
            System.out.println("D: No A object associated.");
        }
    }
}

