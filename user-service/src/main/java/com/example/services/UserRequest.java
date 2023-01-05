package com.example.services;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserRequest {
    private String userName;
    private String email;
    private String name;
    private int age;
}
