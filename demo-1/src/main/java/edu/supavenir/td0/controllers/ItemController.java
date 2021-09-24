package edu.supavenir.td0.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import edu.supavenir.td0.models.Element;
import edu.supavenir.td0.technics.CssMessage;

@Controller
@SessionAttributes("items")
public class ItemController {

	@ModelAttribute("items")
	public List<Element> getItems() {
		return new HashMap();
	}

	@GetMapping("/")
	public String itemsAction() {
		return "items";
	}

	@GetMapping("/items/new")
	public String itemsNew() {
		return "form";
	}

	@PostMapping("/items/addNew")
	public RedirectView add(Element elm, @SessionAttribute List<Element> items, RedirectAttributes attrs) {
		if (!items.containsValue(elm)) {
			items.put(elm.getNom(),elm);
			attrs.addFlashAttribute("msg", CssMessage.SuccessMessage("Element <b>" + "</b> ajoute"));
		} else {
			attrs.addFlashAttribute("msg", CssMessage.ErrorMessage("Cet élément existe déja !"));
		}
		return new RedirectView("/");
	}

	@GetMapping("/items/dec/{nom}")
	public RedirectView decAction(@PathVariable String nom,)

	/*
	 * @GetMapping("/testAdd") public RedirectView add(@SessionAttribute
	 * List<Element> items) { Element elm = new Element("bop", 25);
	 * elm.setNom("bop"); if (!items.contains(elm)) { } items.add(elm); return new
	 * RedirectView("/"); }
	 */
}
