
package com.Tienda.dao;

/**
 *
 * @author AnaJimenezCh
 */

import com.Tienda.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoriaDao extends JpaRepository<Categoria, Long>{
   
}
