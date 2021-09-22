package edu.supavenir.td0.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.view.RedirectView;

import edu.supavenir.td0.models.Element;

@Controller
@SessionAttributes("items")
public class ItemController {

	@ModelAttribute("items")
	public List<Element> getItems() {
		return new ArrayList<>();
	}

	@GetMapping("/items")
	public String itemsAction() {
		return "items";
	}

	@GetMapping("/testAdd")
	public RedirectView add(@SessionAttribute List<Element> items) {
		Element elm = new Element("bop", 25);
		elm.setNom("bop");
		if (!items.contains(elm)) {
		}
		items.add(elm);
		return new RedirectView("/td0/items");
	}
}
