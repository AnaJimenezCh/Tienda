
package com.Tienda.dao;

/**
 *
 * @author AnaJimenezCh
 */
import com.Tienda.domain.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentaDao extends JpaRepository<Venta, Long> {

}
