package br.com.fiap.ecommerce.dtos;

import org.modelmapper.ModelMapper;
import br.com.fiap.ecommerce.model.ItemPedido;

public class ItemPedidoRequestUpdateDto {
    private Integer quantidade;
    private Double valorTotal;
    private Long idProduto;
    private Long idPedido;

    private static final ModelMapper modelMapper = new ModelMapper();

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

    public Long getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Long idProduto) {
        this.idProduto = idProduto;
    }

    public Long getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Long idPedido) {
        this.idPedido = idPedido;
    }

    public ItemPedido toModel(Long id) {
        ItemPedido result = modelMapper.map(this, ItemPedido.class);
        result.setId(id);
        return result;
    }
}
