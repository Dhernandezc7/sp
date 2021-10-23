/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.demoP2BPrimero2;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



/**
 *
 * @author vh367
 */
@Controller //analiza lo que queremos y lo busca en Templates para ver si lo encuentra
public class controladorprincipal {
   @GetMapping("/")
   public String inicio (Model model){//constructor para organizar nuestros datos
       var a="hola desde el controlador";
       var persona=new  clspersona();//variable de tipo de clase clspersona
       persona.setNombre("Amaranta");// 
       persona.setApellido("Lopex");
       persona.setEnero("500");
       persona.setFebrero("800");
       persona.setMarzo("900");
       
       
       var persona2=new clspersona ();
        persona2.setNombre("Ruldin"); //estos datos llevará cada columna de la tabla
       persona2.setApellido("Rodriguez");
       persona2.setEnero("700");
       persona2.setFebrero("800");
       persona2.setMarzo("900");
      
       
      var personas= Arrays.asList(persona, persona2);//array va a llevar los datos de la persona1 y persona2
       
        model.addAttribute("personas",personas);//enviamos todos los datos de la persona al array
        model.addAttribute("a",a);
       
      
       return "Index";//retornamos la pagina
   }
   
}
