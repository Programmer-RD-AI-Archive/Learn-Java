class Dog {
    public static void main(String[] args) {
       
    }
    public void play() {
        System.out.println("Dog is Playing!");
    }
}

class Puppy extends Dog {}

class Sem1 {
    public static void main(String[] args) {
        Puppy p1 = new Dog();
        p1.play();
    }
}
