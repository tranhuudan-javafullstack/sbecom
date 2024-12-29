package com.ecommerce.project.security.response;

import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@Setter
@Getter
@RequiredArgsConstructor
public class MessageResponse {
    String message;
}