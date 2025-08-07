// package: com.inventory.repository

package com.inventory.repository;

import com.inventory.model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
    List<Invoice> findByCustomer_Id(Long customerId);

    @Query("SELECT i FROM Invoice i WHERE i.createdAt BETWEEN :start AND :end")
    List<Invoice> findByDateRange(@Param("start") LocalDateTime start, @Param("end") LocalDateTime end);

    Optional<Invoice> findByInvoiceNumber(String invoiceNumber);
}