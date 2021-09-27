package edu.supavenir.td0.models;

public class Element {
	private String nom;
	private int evaluation;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getEvaluation() {
		return evaluation;
	}

	public void setEvaluation(int evaluation) {
		this.evaluation = evaluation;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Element)) {
			return false;
		}
		return ((Element) obj).getNom().equals(this.nom);
	}

	@Override
	public String toString() {
		return "Element [nom=" + nom + "]";
	}

	public Element(String nom) {
		this.nom = nom;
	}

	public Element() {
	}

	public void inc() {
		this.evaluation++;
	}

	public void dec() {
		this.evaluation--;
	}
}
