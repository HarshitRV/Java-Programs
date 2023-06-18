package src.uni.fat.q1;

public class Animal {
    public Animal() {
        construct();
    }

    private void construct() {
        System.out.println("constructing animal");
    }

    public void sound() {
        System.out.println("make sound");
    }

    protected void eat() {
        System.out.println("eating");
    }
}

// single inheritance
class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("bark bark");
    }

    @Override
    protected void eat() {
        System.out.println("nom nom");
    }
}

// multilevel inheritance
class Puppy extends Dog {
    @Override
    public void sound() {
        System.out.println("weep weep");
    }

    @Override
    protected void eat() {
        System.out.println("num num");
    }
}

// hierarchial inheritance
class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("meow meow");
    }

    @Override
    protected void eat() {
        System.out.println("nim nim");
    }
}

interface EngineStart {
    public void start();
}

interface EngineStop {
    public void stop();
}

class Vehicle implements EngineStart, EngineStop {
    @Override
    public void start() {
        System.out.println("engine starts");
    };

    @Override
    public void stop() {
        System.out.println("engine stops");
    };
}

class Demo {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Dog puppy = new Puppy();
        Animal cat = new Cat();

        // Dynamic method dispatch
        dog.sound();
        dog.eat();

        puppy.sound();
        puppy.eat();

        cat.sound();
        cat.eat();
        // ------------------------

        // Multiple inheritance indirectly
        Vehicle vehicle = new Vehicle();
        vehicle.start();

        vehicle.stop();
    }
}