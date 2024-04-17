#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import ${package}.data.Estudiante;
import ${package}.servicios.ServicioEstudiante;

@Controller
@RequestMapping("/estudiantes")
public class ControladorEstudiantes {

	@Autowired
	ServicioEstudiante servicioEstudiante;

	@RequestMapping("/")
	public String getEstudiantes(Model model) {
		return "estudiantes";
	}

	@RequestMapping("/lista")
	public String getListaEstudiantes(Model model) {

		model.addAttribute("estudiantes", servicioEstudiante.getEstudiantes());

		return "estudiantes_lista";
	}

	@RequestMapping("/alta")
	public String getFormularioAlta(@ModelAttribute("estudiantes") Estudiante estudiante) {
		return "estudiantes_alta";
	}

}
