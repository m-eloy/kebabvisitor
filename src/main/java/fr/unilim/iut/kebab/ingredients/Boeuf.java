package fr.unilim.iut.kebab.ingredients;

import fr.unilim.iut.kebab.Kebab;
import fr.unilim.iut.kebab.visitor.*;

public class Boeuf extends Ingredient {

	public Boeuf(String nom, Kebab kebab) {
		super(nom, kebab);
	}

	@Override
	public boolean isPescetarien() {
		return false;
	}
	
	@Override
    public boolean accept(VisitorRegime visitorRegime) {
		return visitorRegime.visit(this);
	}
}
