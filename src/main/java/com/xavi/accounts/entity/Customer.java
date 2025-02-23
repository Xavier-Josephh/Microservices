package com.xavi.accounts.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.web.bind.annotation.GetMapping;

@Entity
@Getter @Setter @ToString @NoArgsConstructor @AllArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="customer_id")
    private Long customerId;
    private String name;
    private String email;
    @Column(name="mobile_number")
    private String mobileNumber;
}
