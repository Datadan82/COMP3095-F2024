package ca.gbc.productservice.dto;

import java.math.BigDecimal;

public record ProductRequest(
        string id,
        string name,
        string description,
        BigDecimal price
) {
}

