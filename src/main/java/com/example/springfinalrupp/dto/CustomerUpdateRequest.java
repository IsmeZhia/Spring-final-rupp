package com.example.springfinalrupp.dto;

import lombok.Builder;

@Builder
public record CustomerUpdateRequest(
        String lastName,
        String firstName,
        String phone
) {
}
