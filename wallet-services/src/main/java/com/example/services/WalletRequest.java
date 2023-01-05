package com.example.services;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class WalletRequest {
    private String userName;
    private int amount;
}
