// package: com.inventory.dto

package com.inventory.dto;

import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InvoiceItemRequest {
    private Long productId;
    private Integer quantity;
}