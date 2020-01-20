package com.company;

public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee("Иванов Петр Петрович", "Бухгалтер", "ivanov@mail.ru", "+7995959595", 35000, 34);
        //employee.getInfoEmployee();

        // Задание 4 и 5

        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Петров Иван Иванович", "HR специалист", "petrov@mail.ru", "+78567896352", 30000, 41);
        employeeArray[1] = new Employee("Сидоров Петр Степанович", "Директор", "sidor@mail.ru", "+78567843252", 90000, 47);
        employeeArray[2] = new Employee("Смирнова Ольга Николаевна", "Начальник кадров", "smirno@mail.ru", "+78598543552", 50000, 38);
        employeeArray[3] = new Employee("Степанов Марк Иванович", "Инженерт", "stepanov@mail.ru", "+79856896352", 50000, 43);
        employeeArray[4] = new Employee("Кузнецова Светлана Сергеевна", "Секреатарь", "kuznecovass@mail.ru", "+79997896352", 23000, 26);

        for (int i =0; i < employeeArray.length; i++) {
            if (employeeArray[i].getAge() > 40) {
                employeeArray[i].getInfoEmployee();
            }
        }
    }
}

