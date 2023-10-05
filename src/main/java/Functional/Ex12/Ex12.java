package Functional.Ex12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//12. Gestiunea angajatilor
//        Un angajat este caracterizat de nume si salariu. Un departament este caracterizat de nume, cod, si o lista de angajati. Codul este un String
//
//        Avand o lista de departamente intr-un main, care are fiecare o lista de angajati,
//        scrie o metoda care primeste lista de departamente si un salariu minim.
//
//        Metoda va returna cati angajati din toate departamentele au salariul mai mare decat salariul minim primit ca parametru.
//
//        (HINT: stream pe departamente si apoi flatMap pentru a ajunge la angajati, apoi filter pentru a filtra pe cei cu salariul mai mare decat salariul minim si count la final pentru a-i numara)
//
//        Rezolva problema si fara expresii lambda
public class Ex12 {
    public static void main(String[] args) {
        List<Employee> employee1 = Arrays.asList(new Employee("Ionel", 2000), new Employee("Mitica", 5000));
        List<Employee> employee2 = Arrays.asList(new Employee("Georgica", 7000),new Employee("Mirel", 8000));
        List<Department> departmentList = Arrays.asList(new Department("A","aA", employee1), new Department("B", "bB", employee2));


        System.out.println(getNumberOfEmployeesWithSalaryGraterThan(departmentList, 6000));

        Long numberOfEmployeesWithSalaryGreaterThan = departmentList.stream()
                .flatMap(department -> department.getEmployees().stream())
                .filter(employee -> employee.getSalary() > 6000)
                .count();
        System.out.println(numberOfEmployeesWithSalaryGreaterThan);
    }
    public static Integer getNumberOfEmployeesWithSalaryGraterThan(List<Department>departments, Integer baseSalary){
        int count = 0;
        for(Department department : departments){
            for (Employee employee : department.getEmployees()){
                if(employee.getSalary()>baseSalary){
                    count++;
                }
            }
        }
        return count;
    }
}
