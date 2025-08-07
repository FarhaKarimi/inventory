// package: com.inventory.dto

package com.inventory.dto;

import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InvoiceRequest {
    private Long customerId;
    private List<InvoiceItemRequest> items;
}
