public class Main {
    public static void main(String[] args) {
       //Task2
        var workHours = 640;
        var employeeWorkingHours = 8;
        var employeesInCompany = workHours / employeeWorkingHours;
        System.out.println("Всего работников в компании - " + employeesInCompany + " человек");
        employeesInCompany += 94;
        employeeWorkingHours = workHours/employeesInCompany;
        System.out.println("Если в компании работает " + employeesInCompany + " человек, то всего " + employeeWorkingHours + " часов работы может быть поделено" +
                " между сотрудниками");




    }
}