class Employee {
    public void calculate(int num1, int num2) {
        System.out.println("Total of two numbers" + (num1 + num2))
    }

    public void calculate(int num1, int num2, int num3) {
        System.out.println("TOT" + (num1 + num2 + num3))
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
