public class Employee {


    private String worker;
    private int salaryWorker;
    private int deptNumber;
    private final int id;
    private static int counter;


    public Employee(String worker, int salaryWorker, int deptNumber,int id) {
        this.worker = worker;
        this.salaryWorker = salaryWorker;
        this.deptNumber = deptNumber;
        this.id = getCounter();
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    public String getWorker() {
        return worker;
    }

    public int getDeptNumber() {
        return deptNumber;
    }

    public int getId() {
        return id;
    }

    public int getSalaryWorker() {
        return salaryWorker;
    }

    public void setWorker(String worker) {
        this.worker = worker;
    }

    public void setSalaryWorker(int salaryWorker) {
        this.salaryWorker = salaryWorker;
    }

    public void setDeptNumber(int deptNumber) {
        this.deptNumber = deptNumber;
    }


    @Override
    public String toString() {
        return "ФИО сотрудника: "+ worker+". Зарплата сотрудника: "+salaryWorker+
                ". Номер отдела: "+deptNumber+". Идентификационный номер: "+id + ".";
    }
}
