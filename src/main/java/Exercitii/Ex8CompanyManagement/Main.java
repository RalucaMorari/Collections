package Exercitii.Ex8CompanyManagement;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
// O companie multinationala are o lista de angajati,
// iar fiecare angajat este caracterizat de: varsta, tara, nume.
//
//Scrie urmatoarele metode:
//
//O metoda care returneaza angajatii care au peste 50 de ani, din companie
//O metoda care returneaza o lista cu angajatii din Romania
//O metoda care sorteaza angajatii dupa tara
//O metoda care sorteaza angajatii dupa nume
//O metoda care returneaza o mapa, in care cheia este tara si valoarea este numarul de angajati din acea tara
//O metoda care returneaza o mapa, in care cheia este tara si valoarea o lista cu toti angajatii din acea tara

        Employee employee1 = new Employee("Ioan Popa", "Romania", 49);
        Employee employee2 = new Employee("Marian Popescu", "Romania", 58);
        Employee employee3 = new Employee("Ana Vintila", "Romania", 50);
        Employee employee4 = new Employee("Angelique", "Franta", 29);
        Employee employee5 = new Employee("Pierre", "Franta", 59);
        Employee employee6 = new Employee("Ivan", "Rusia", 49);
        Employee employee7 = new Employee("James", "GB", 58);
        Employee employee8 = new Employee("Jenny", "GB", 37);
        Employee employee9 = new Employee("Igor", "Bulgaria", 52);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);
        employeeList.add(employee6);
        employeeList.add(employee7);
        employeeList.add(employee8);
        employeeList.add(employee9);

        System.out.println(employeeList);

        Company company = new Company(employeeList);
        CountryComparator countryComparator = new CountryComparator();
        Map<String, List<Employee>> employeesByCountry = new HashMap<>();

      System.out.println(company.filterByAgeGreaterThan(50));

      company.sortByCountry();
        System.out.println(company);

       System.out.println(company.getEmployeesByCountry());

        System.out.println(company.getNumberOfEmployeesByCountry());
       System.out.println(company.getEmployeeByName());

    }
}
