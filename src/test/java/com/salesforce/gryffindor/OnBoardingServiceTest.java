package com.salesforce.gryffindor;

import org.junit.Test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class OnBoardingServiceTest {

    @Test
    public void setOrientationDateOnAllNewHires() {

        //Collaborator
        EmployeeDAO employeeDAO = mock(EmployeeDAO.class);

        //Subject Under Test
        OnBoardingService onBoardingService
                = new OnBoardingService(employeeDAO);

        Employee bob = new Employee("Bob", "Simons", HiringStatus.COMPLETED);
        List<Employee> newHires = Arrays.asList(
                bob,
                new Employee("Carly", "Bellevue", HiringStatus.IN_PROCESS),
                new Employee("Justin", "Bieber", HiringStatus.FAILED)
        );


        when(employeeDAO.newHires()).thenReturn(newHires);

        onBoardingService.setOrientationDate(LocalDate.of(2018, 3, 1));

        assertEquals(LocalDate.of(2018, 3, 1), bob.getOrientationDate());

        verify(employeeDAO);
    }
}
