package tasks1;

import org.junit.jupiter.api.Test;

class ImmutableObjectTest {

    @Test
    public void test1() {
        ImmutableObject immutableObject = new ImmutableObject( "D", 2 );
        int integer = immutableObject.getInteger();
        System.out.println("Integer, which is immutableInteger = " + integer);
        integer=4;
        System.out.println("Integer after change = " + integer);
        System.out.println("Immutable obj integer = " + immutableObject.getInteger());

        String name = immutableObject.getName();
        System.out.println("String name is = " + name);
        name = "24";
        System.out.println("String after change = [...] = " + name);
        name = new String("3545");
        System.out.println("String after change = [new String(...)] = " + name);
        System.out.println("Immutable obj String = " + immutableObject.getName());
    }

}