package com.example.pennypath.dto;

import com.example.pennypath.entity.User;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class NotificationDTO {

    private Long id;
    private String subject;

    @NotBlank(message = "Recipient is Required")
    private String recipient;

    private String body;
    private String notificationType;
    private User user;
    private LocalDateTime createdAt;
}
