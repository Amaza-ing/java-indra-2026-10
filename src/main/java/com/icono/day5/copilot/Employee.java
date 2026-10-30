package com.icono.day5.copilot;

import java.math.BigDecimal;
import java.util.concurrent.atomic.AtomicLong;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Employee {
    private static final AtomicLong NEXT_ID = new AtomicLong();

    private final long id;
    private String firstName;
    private String lastName;
    private String email;
    private String department;
    private BigDecimal salary;

    public Employee(String firstName, String lastName, String email, String department, BigDecimal salary) {
        this.id = NEXT_ID.incrementAndGet();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.department = department;
        this.salary = salary;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}
