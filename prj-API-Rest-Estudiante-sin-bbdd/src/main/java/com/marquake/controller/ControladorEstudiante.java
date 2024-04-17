package com.marquake.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.marquake.data.Estudiante;
import com.marquake.servicios.EstudianteServicioImpl;

@Controller
@RequestMapping("/estudiante")
public class ControladorEstudiante {

	@Autowired
	EstudianteServicioImpl estudianteServicio;

	//EstudianteServicioIF estudianteServicio;

	@RequestMapping("/principal")
	public String getEstudiante(Model model) {
		//System.out.println("petición estudiante...");
		//System.out.println("estudianteServicio.getListaEstudiantes().get(0): " + estudianteServicio.getListaEstudiantes().get(0));
		//System.out.println(estudianteServicio.getListaEstudiantes());

		Integer a = new Integer("A");
		model.addAttribute("estudiantes", estudianteServicio.getListaEstudiantes() );

		return "estudiantes";
	}

	@RequestMapping("/lista")
	public String listarEstudiante(Model model) {
		//System.out.println("petición estudiante...");
		//System.out.println("estudianteServicio.getListaEstudiantes().get(0): " + estudianteServicio.getListaEstudiantes().get(0));
		//System.out.println(estudianteServicio.getListaEstudiantes());

		model.addAttribute("estudiantes", estudianteServicio.getListaEstudiantes() );

		return "estudiantes_lista";
	}

	@RequestMapping("/alta")
	public String altaEstudiante(Model model) {
		//model.addAttribute("estudiantes", estudianteServicio.getListaEstudiantes() );

		Estudiante estudiante = new Estudiante();
		model.addAttribute("estudiante", estudiante);
		
		return "estudiantes_alta";
	}

	@RequestMapping("/alta_estudiante")
	public String altaEstudianteNuevo(@ModelAttribute("estudiante") Estudiante estudiante) {
		//model.addAttribute("estudiantes", estudianteServicio.getListaEstudiantes() );

		System.out.println("NUEVO ESTUDIANTE: Nombre: " + estudiante.getNombre() + " / apellido: " + estudiante.getApellido() );

		//Estudiante estudiante = new Estudiante();
		//model.addAttribute("estudiante", estudiante);
		
		return "estudiantes_alta_confirmacion";
	}

	@RequestMapping("/modificar/{id}")
	public String modificarEstudiante(@PathVariable int id) {

		System.out.println("Se va a modificar el registro: " + id);
		return "estudiantes_modificar_confirmacion";
	}

	@RequestMapping("/borrar/{id}")
	public String borrarEstudiante(@PathVariable int id) {

		System.out.println("Se va a borrar el registro: " + id);
		return "estudiantes_borrar_confirmacion";
	}

	@RequestMapping("/estudiante_consultar")
	public String consultarEstudiante(Model model) {
		model.addAttribute("estudiantes", estudianteServicio.getListaEstudiantes() );

		return "estudiantes";
	}

	@ExceptionHandler({Exception.class})
	public void manejadorDePetes(Exception ex) {
		System.out.println("algo a petado: " + ex.getMessage());
	}
}