package com.example.pennypath.dto;

import com.example.pennypath.entity.Account;
import com.example.pennypath.enums.TransactionStatus;
import com.example.pennypath.enums.TransactionType;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TransactionDTO {

    private Long id;
    private BigDecimal amount;
    private TransactionType transactionType;
    private String description;
    private TransactionStatus transactionStatus;
    private LocalDateTime transactionDate;

    @JsonBackReference
    private AccountDTO account;

    private String sourceAccount;
    private String destinationAccount;
}
