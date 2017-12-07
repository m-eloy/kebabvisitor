package fr.unilim.iut.kebab;

import java.util.LinkedList;
import java.util.List;

import fr.unilim.iut.kebab.ingredients.Ingredient;
import fr.unilim.iut.kebab.visitor.VisitorRegime;

public class Assiette implements Kebab {

	public List<Ingredient> getIngredients() {
		return new LinkedList<>();
	}

	public boolean isVegetarien() {
		return true;
	}

	public boolean isPescetarien() {
		return true;
	}
	
	public boolean accept(VisitorRegime visitorRegime) {
		return visitorRegime.visit(this);
	}

}
