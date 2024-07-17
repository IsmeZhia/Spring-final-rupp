package com.example.springfinalrupp.dto;

import lombok.Builder;

@Builder
public record CustomerResponse(
        Long id,
        String lastName,
        String firstName,
        String phone
) {
}
