package br.com.fiap.ecommerce.dtos;

import org.modelmapper.ModelMapper;

import br.com.fiap.ecommerce.model.ItemPedido;

public class ItemPedidoResponseDto {
    private Long id;
    private Long idPedido;
    private Long idProduto;
    private Integer quantidade;
    private Double valorTotal;
    private static final ModelMapper modelMapper = new ModelMapper();

    public ItemPedidoResponseDto toDto(ItemPedido itemPedido) {
        return modelMapper.map(itemPedido, ItemPedidoResponseDto.class);
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getIdPedido() {
        return idPedido;
    }
    public void setIdPedido(Long idPedido) {
        this.idPedido = idPedido;
    }
    public Long getIdProduto() {
        return idProduto;
    }
    public void setIdProduto(Long idProduto) {
        this.idProduto = idProduto;
    }
    public Integer getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
    public Double getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
