package main.people;

public class Job {
    int salary;
    double mult;
    String pos;
    String jobName;
    boolean fullTime;

    Job(String Job_Name, int Salary, double multiplier, String Position, boolean fullTime){
        setMult(multiplier);
        setPos(Position);
        setSalary(Salary);
        setJobName(Job_Name);
        setFullTime(fullTime);
        getJob();
    }

    public double getMult() {
        return mult;
    }

    public String getJobName() {
        return jobName;
    }

    public void setFullTime(boolean fullTime) {
        this.fullTime = fullTime;
    }

    public int getSalary() {
        return salary;
    }

    public String getPos() {
        return pos;
    }

    public boolean getFullTime() {
        return this.fullTime;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
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

    public int calcSalary(){
        int temp;
        temp = (int) (this.salary * this.mult);
        return  temp;
    }

    void getJob() {
        if (this.fullTime){
            System.out.println("Job: " + getJobName() + ", Salary (per hour): " + calcSalary() + " Full-Time");
        } else {
            System.out.println("Job: " + getJobName() + ", Salary (per hour): " + calcSalary() + " Part-Time");
        }
    }
}
