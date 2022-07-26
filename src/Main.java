public class Main {

    public static void giveMinSalary(Employee[] employees) {
        if (employees.length > 0) {
            Employee emp = employees[0];
            for (Employee employee : employees) {
                if (emp.getSalaryWorker() > employee.getSalaryWorker())
                    emp = employee;
            }
                System.out.println("Сотрудник с минимальной зарплатой:" +" "+ emp.getSalaryWorker()+", рублей "+ emp.getWorker()+", отдел № "+emp.getDeptNumber()+", ID "+ emp.getId());
        }else
            System.out.println("Массив пуст!");
        System.out.println();
    }

    public static void giveMaxSalary(Employee[] employees) {
        if (employees.length > 0) {
            Employee emp = employees[0];
            for (Employee employee : employees) {
                if (emp.getSalaryWorker() < employee.getSalaryWorker())
                    emp = employee;
            }
            System.out.println("Сотрудник с максимальной зарплатой: " +" "+ emp.getSalaryWorker()+" рублей,"+ emp.getWorker()+", отдел № "+emp.getDeptNumber()+", ID "+ emp.getId());
        }else
            System.out.println("Массив пуст!");
        System.out.println();
        }

    public static void typeAllWorkersInfo(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println();
    }


    public static void type10WorkersInfo(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.getWorker());
        }
        System.out.println();
    }


    public static int countAllWorkersSalary(Employee[] employees) {
        int sum = 0;
        for (Employee employee : employees){
            sum += employee.getSalaryWorker();
        }
        System.out.println("Общая сумма выплат в месяц составила:" + sum);
        return sum;
    }

    public static void averageSalary(Employee[] employee) {
        int sum = countAllWorkersSalary(employee);
        float average = (float) sum / employee.length;
        System.out.println("Средняя зарплата составляет:" + average);
        System.out.println();
    }

    public static void main(String[] args) {

        Employee[] employee = new Employee[10];

        employee[0] = new Employee("Ivanov Uriy Petrovich", 55000, 1, 10);
        employee[1] = new Employee("Sidorov Stepan Aleksandrovich", 52000, 1, 9);
        employee[2] = new Employee("Levi Adam Isacovich", 70000, 2, 8);
        employee[3] = new Employee("Ovchinnikova Vera Sergeevna", 50000, 2, 7);
        employee[4] = new Employee("Danilova Lidiya Ivanovna", 53000, 3, 6);
        employee[5] = new Employee("Kondratiev Anatoliy Borisovich", 65000, 3, 5);
        employee[6] = new Employee("Aguzarova Zhanna Igorevna", 63000, 4, 4);
        employee[7] = new Employee("Petrov Aleksey Urievich", 80000, 4, 3);
        employee[8] = new Employee("Yashina Anna Aleksandrovna", 82000, 5, 2);
        employee[9] = new Employee("Losev Andrey Timurovich", 81000, 5, 1);


        typeAllWorkersInfo(employee);
        giveMinSalary(employee);
        giveMaxSalary(employee);
        countAllWorkersSalary(employee);
        averageSalary(employee);
        type10WorkersInfo(employee);

        Employee.counter();
    }
}