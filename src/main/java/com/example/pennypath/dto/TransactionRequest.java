package com.example.pennypath.dto;


import com.example.pennypath.enums.TransactionType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.math.BigDecimal;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class TransactionRequest {

    private BigDecimal amount;
    private TransactionType transactionType;
    private String description;
    private String accountNumber;

    private String destinationAccountNumber;
}
