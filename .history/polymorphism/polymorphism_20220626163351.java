class Dog {
    public void main() {
        System.out.println("Dog is Playing!");
    }
    public void play() {
        System.out.println("Dog is Playing!");
    }
}

class Puppy extends Dog {}

class Sem1 {
    public static void main(String[] args) {
        Puppy p1 = new Puppy();
        p1.play();
    }
}
