package com.examination.api.model.types;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum RoleType {

    ROLE_USER("사용자"),
    ROLE_ADMIN("어드민");

    private final String description;
}
