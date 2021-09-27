package edu.supavenir.td0.models;

import java.util.List;

public class Categorie {
	private String nom;
	private List<Element> items;
	
	public Categorie(String nom) {
		this.nom = nom;
		items = new ArrayList<Element>();
	}
	
	public Element getElementByName(String nom) {
		int index = items.indexOf(new Element(nom));
		return items.get(index);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Element> getItems() {
		return items;
	}

	public void setItems(List<Element> items) {
		this.items = items;
	}
	
	public boolean addItem(Element elm) {
		if (!items.contains(elm)) {
			return items.add(elm);
		}
		return false;
		
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Categorie)) {
			return false;
		}
		return ((Categorie) obj).getNom().equals(this.nom);
	}
}
