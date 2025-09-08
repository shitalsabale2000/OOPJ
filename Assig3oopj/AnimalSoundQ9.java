/
class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog → Bark");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat → Meow");
    }
}

public class AnimalSoundQ9 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.makeSound();
        cat.makeSound();
    }
}
