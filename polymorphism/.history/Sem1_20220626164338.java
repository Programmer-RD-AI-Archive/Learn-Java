class Dog {
    public void eat(){}
    public void  p
    lay()

    {
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
        Puppy p1 = new Puppy();
        p1.play();
    }
}
