class Dog {

    public void play() {
        System.out.println("Dog is Playing!");
    }
}

class Puppy extends Dog {
    public void play() {
        System.out.println("Puppy is playing!");
    }
}

class Sem1 {
    public static void main(String[] args) {
        Dog p1 = new Dog();
        p1.play();
    }
}
