package ca.gbc.productservice.dto;

import java.math.BigDecimal;

public record ProductResponse(
        string id,
        string name,
        string description,
        BigDecimal price
) {
}
