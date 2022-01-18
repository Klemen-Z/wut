package main.people.Jobs;

public abstract class Job {
    int salary;
    double mult;
    String pos;

    Job(int Salary, double multiplier, String Position){
        setMult(multiplier);
        setPos(Position);
        setSalary(Salary);
        getJob();
    }

    public double getMult() {
        return mult;
    }

    public int getSalary() {
        return salary;
    }

    public String getPos() {
        return pos;
    }

    public void setMult(double mult) {
        this.mult = mult;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    abstract void getJob();
}
