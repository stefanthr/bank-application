package com.example.bank.jpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "Transaction")
@Data
@NoArgsConstructor
public class Transaction {

    @Id
    @GeneratedValue
    private Long id;
    private Long senderAccountId;
    private Long receiverAccountId;
    private double amount;
    private LocalDateTime initiationDateAndTime;
    private LocalDateTime completionDateAndTime;
    private String reference;

}
