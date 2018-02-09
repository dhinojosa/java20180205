package com.salesforce.gryffindor;

import java.util.List;

public interface EmployeeDAO {
    public void persist(Employee employee);
    public List<Employee> newHires();
}
