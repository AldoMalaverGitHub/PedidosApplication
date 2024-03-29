package pedidos.com.pe.datos.entidades;
// Generated 16/04/2019 09:38:29 PM by Hibernate Tools 5.2.10.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * DetallePedido generated by hbm2java
 */
@Entity
@Table(name = "DetallePedido", catalog = "pedido_db")
public class DetallePedido implements java.io.Serializable {

	private DetallePedidoId id;
	private Pedido pedido;
	private Producto producto;
	private Integer cantidad;
	private Double precio;

	public DetallePedido() {
	}

	public DetallePedido(DetallePedidoId id, Pedido pedido, Producto producto) {
		this.id = id;
		this.pedido = pedido;
		this.producto = producto;
	}

	public DetallePedido(DetallePedidoId id, Pedido pedido, Producto producto, Integer cantidad, Double precio) {
		this.id = id;
		this.pedido = pedido;
		this.producto = producto;
		this.cantidad = cantidad;
		this.precio = precio;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "idpedido", column = @Column(name = "idpedido", nullable = false)),
			@AttributeOverride(name = "idproducto", column = @Column(name = "idproducto", nullable = false)) })
	public DetallePedidoId getId() {
		return this.id;
	}

	public void setId(DetallePedidoId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idpedido", nullable = false, insertable = false, updatable = false)
	public Pedido getPedido() {
		return this.pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idproducto", nullable = false, insertable = false, updatable = false)
	public Producto getProducto() {
		return this.producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	@Column(name = "cantidad")
	public Integer getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	@Column(name = "precio", precision = 22, scale = 0)
	public Double getPrecio() {
		return this.precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

}
