
package com.Tienda.Controller;

import com.Tienda.dao.UsuarioDao;
import com.Tienda.domain.Usuario;
import com.Tienda.service.ProductoService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author AnaJimenezCh
 */
@Controller
public class IndexController {
    
   @Autowired
    ProductoService productoService;
    
    @RequestMapping("/")
    public String page(Model model, HttpSession session){
         var listaProductos = productoService.getProductos(true);
        model.addAttribute("productos", listaProductos);
   // String imagen = (String)session.getAttribute("usuarioImagen");
     //  model.addAttribute("avatar", "imagen");
       
     /*  session.setAttribute("idUsuario", model);
     Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal(); 
       
       UserDetails user = null;
       
       if (principal instanceof UserDetails){
           user = (UserDetails) principal;
       
       
       }
       if(user != null){
           Usuario usuario = usuarioDao.findByUsername(user.getUsername());
           session.setAttribute("Email", usuario.getCorreo());
       }
      */
       return "index";
    }
    
}
