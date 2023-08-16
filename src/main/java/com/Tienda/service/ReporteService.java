
package com.Tienda.service;

import java.io.IOException;
import java.util.Map;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;

/**
 *
 * @author AnaJimenezCh
 */
public interface ReporteService {

   
   public ResponseEntity<Resource> generaReporte (
            String reporte,
            Map<String, Object> parametros,
            String tipo
   ) throws IOException;  
}