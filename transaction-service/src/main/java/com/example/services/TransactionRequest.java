package com.example.services;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TransactionRequest {
    private String fromUser;
    private String toUser;
    private int amount;
}
