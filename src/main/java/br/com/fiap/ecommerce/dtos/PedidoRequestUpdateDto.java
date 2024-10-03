package br.com.fiap.ecommerce.dtos;

import org.modelmapper.ModelMapper;
import br.com.fiap.ecommerce.model.Pedido;

import java.time.LocalDate;

public class PedidoRequestUpdateDto {
    private LocalDate dataPedido;
    private String formaPagamento;
    private String status;
    private Double valorTotal;
    private Long idCliente;

    private static final ModelMapper modelMapper = new ModelMapper();

    public LocalDate getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(LocalDate dataPedido) {
        this.dataPedido = dataPedido;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public Pedido toModel(Long id) {
        Pedido result = modelMapper.map(this, Pedido.class);
        result.setId(id);
        return result;
    }
}
