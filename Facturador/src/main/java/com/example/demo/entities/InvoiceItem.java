package com.example.demo.entities;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "invoice_item")
@Schema(description = "Entidad que representa un item de una factura " , example = "{\"id\":\"00000000-0000-0000-0000-000000000000\",\"invoiceId\":\"00000000-0000-0000-0000-000000000000\",\"productId\":\"00000000-0000-0000-0000-000000000000\",\"quantity\":100,\"subtotal\":100.0}")
public class InvoiceItem {

    @Schema(description = "Id del item de la factura" ,example = "00000000-0000-0000-0000-000000000000")
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    @Schema(description = "Id de la factura" , example = "00000000-0000-0000-0000-000000000000")
    @ManyToOne
    @JoinColumn(name = "invoice_id", nullable = false)
    @JsonBackReference
    private Invoice invoice;

    @Schema (description = "Id del producto" ,example = "1 INT , UUID 00000000-0000-0000-0000-000000000000")
    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    @Schema(description = "Cantidad de productos" , example = "100")
    @NotNull
    @Column(nullable = false)
    private Integer quantity;

    @Schema(description = "Subtotal de la factura" , example = "100.0")
    @NotNull
    @Column(nullable = false)
    private Double subtotal;


    public InvoiceItem(Invoice invoice, Product product, Integer quantity) {
        this.invoice = invoice;
        this.product = product;
        this.quantity = quantity;
        this.subtotal = calculateSubtotal();
    }

    public Double calculateSubtotal() {
        return this.product.getPrice() * this.quantity;
    }


    public void setSubtotal(){
        this.subtotal = this.calculateSubtotal();
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
        this.subtotal = calculateSubtotal();
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public double getSubtotal() {
        return this.subtotal;
    }


    public Integer getQuantity() {
        return quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "InvoiceItem{" +
                "id=" + id +
                ", invoiceId=" + (invoice != null ? invoice.getId() : "null") +
                ", productId=" + (product != null ? product.getId() : "null") +
                ", quantity=" + quantity +
                ", subtotal=" + subtotal +
                '}';
    }

}