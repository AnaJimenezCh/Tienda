
package com.Tienda.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 *
 * @author AnaJimenezCh
 */
public interface UsuarioDetailsService {
   public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
   
}
