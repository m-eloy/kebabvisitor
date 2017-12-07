import fr.unilim.iut.kebab.Assiette;
import fr.unilim.iut.kebab.ingredients.*;

public class VisitorRegimeVegetarien implements VisitorRegime {
	
	public boolean visit(Assiette ingredientAssiette){
		return true;
	}

	public boolean visit(Agneau ingredientAgneau) {
		return false;
	}
	
	public boolean visit(Tomate ingredientTomate){
		return true;
	}
	
	public boolean visit(Boeuf ingredientBoeuf){
		return false;
	}
	
	public boolean visit(Crevette ingredientCrevette){
		return false;
	}
	
	public boolean visit(Fromage ingredientFromage){
		return true;
	}
	
	public boolean visit(Oignon ingredientOignon){
		return true;
	}
	
	public boolean visit(Sauce ingredienteSauce){
		return true;
	}
	
	public boolean visit(Pain ingredientPain){
		return true;
	}
	
	public boolean visit(Thon ingredientThon){
		return false;
	}
	
	public boolean visit(Salade ingredientSalade){
		return true;
	}
}
