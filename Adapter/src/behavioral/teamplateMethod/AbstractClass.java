package behavioral.teamplateMethod;

public abstract class AbstractClass {
    public abstract void primitiveOperationA();
    public abstract void primitiveOperationB();

    public void templateMethod(){
        primitiveOperationA();
        primitiveOperationB();
    }
}

