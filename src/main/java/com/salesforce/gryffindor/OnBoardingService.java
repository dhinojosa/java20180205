package com.salesforce.gryffindor;

import java.time.LocalDate;
import java.util.List;

public class OnBoardingService {
    private final EmployeeDAO employeeDAO;

    public OnBoardingService(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    public void setOrientationDate(LocalDate date) {
        List<Employee> newHires = this.employeeDAO.newHires();
        newHires.stream()
                .filter(employee -> employee.getHiringStatus()
                                             .equals(HiringStatus.COMPLETED))
                .forEach(employee -> employee.setOrientationDate(date));
    }
}
