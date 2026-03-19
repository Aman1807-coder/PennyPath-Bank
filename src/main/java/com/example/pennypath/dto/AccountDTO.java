package com.example.pennypath.dto;

import com.example.pennypath.enums.AccountStatus;
import com.example.pennypath.enums.AccountType;
import com.example.pennypath.enums.CurrencyType;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AccountDTO {

    private Long id;
    private String accountNumber;
    private BigDecimal balance;

    @JsonBackReference
    private UserDTO user;

    private AccountType accountType;
    private CurrencyType currencyType;
    private AccountStatus accountStatus;

    @JsonManagedReference
    private List<TransactionDTO> transactions;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime closedAt;
}
