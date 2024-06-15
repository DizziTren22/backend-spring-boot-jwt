package com.example.proyectobackendspringboot.controller.dto.request;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RegisterRequest {

    private String userName;

    private String password;

    private String firstName;

    private String lastName;
}
