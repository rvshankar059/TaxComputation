package com.employee.taxComputation.entity;

import com.sun.istack.internal.NotNull;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String employee_Id;
    @Column
    @NotNull
    private String firstName;
    @Column
    @NotNull
    private String lastName;
    @Column
    @NotNull
    private String email;
    @Column
    @NotNull
    private Date dateOfJoining;
    @Column
    private long salary;
    @Column
    @NotNull
    private List<Integer> phoneNo;


}
