
package com.Tienda.service;

/**
 *
 * @author AnaJimenezCh
 */


import jakarta.mail.MessagingException;

public interface CorreoService {
    public void enviarCorreoHtml(
            String para, 
            String asunto, 
            String contenidoHtml) 
            throws MessagingException;
}