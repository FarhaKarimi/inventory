// package: com.inventory.dto

package com.inventory.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InvoiceResponse {
    private String invoiceNumber;
    private String customerName;
    private BigDecimal total;
    private List<InvoiceItemResponse> items;
    private String createdAt;
}