package fr.unilim.iut.kebab.ingredients;

import fr.unilim.iut.kebab.Kebab;
import fr.unilim.iut.kebab.visitor.VisitorRegime;

public class Thon extends Ingredient {

	public Thon(String nom, Kebab kebab) {
		super(nom, kebab);

	}

	@Override
	public boolean isPescetarien() {
		return super.isPescetarien();
	}
	
	@Override
    public boolean accept(VisitorRegime visitorRegime) {
		return visitorRegime.visit(this);
	}

}
