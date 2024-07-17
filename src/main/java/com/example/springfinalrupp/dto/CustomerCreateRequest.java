package com.example.springfinalrupp.dto;

import lombok.Builder;

@Builder
public record CustomerCreateRequest(
        String lastName,
        String firstName,
        String phone
) {
}
