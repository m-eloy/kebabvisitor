package fr.unilim.iut.kebab;

import java.util.ArrayList;
import java.util.List;
import fr.unilim.iut.kebab.ingredients.Ingredient;
import fr.unilim.iut.kebab.visitor.VisitorRegimeVegetarien;

public abstract class Kebab {
	public List<Ingredient> getIngredients() {
		return new ArrayList<Ingredient>();
	}
	public boolean isVegetarien() {
		List<Ingredient> ingredients = this.getIngredients();
		for (Ingredient ingredient : ingredients) {
			if(ingredient.accept(new VisitorRegimeVegetarien()) == false) {
				return false;
			}
		}
		
		return true;
	}
	public abstract boolean isPescetarien();
}
