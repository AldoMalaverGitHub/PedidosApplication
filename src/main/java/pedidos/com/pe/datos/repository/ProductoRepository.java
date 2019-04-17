/**
 * 
 */
package pedidos.com.pe.datos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pedidos.com.pe.datos.entidades.Producto;

/**
 * @author almal
 *
 */
@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {

}
