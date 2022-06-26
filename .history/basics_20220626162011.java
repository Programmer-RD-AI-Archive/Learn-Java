class Employee {
    private double salary;

    public void setSalary(double s) {
        if (s > 200000) {
        System.out.println('Invalid Salary');
    }
    else{
        this.salary = s;
    }
    }

    public void displaySalary() {
        System.out.println(this.salary);
    }
}
class Sem1 {
    public static void main(String args[]) {
        Employee e1 = new Employee();
        e1.salary = 600000;
        e1.displaceSalary();
    }
}
