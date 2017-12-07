import fr.unilim.iut.kebab.Assiette;
import fr.unilim.iut.kebab.ingredients.*;

public interface VisitorRegime {

	boolean visit(Assiette ingredientAssiette);
	boolean visit(Agneau ingredientAgneau);
	boolean visit(Tomate ingredientTomate);
	boolean visit(Boeuf ingredientBoeuf);
	boolean visit(Crevette ingredientCrevette);
	boolean visit(Fromage ingredientFromage);
	boolean visit(Oignon ingredientOignon);
	boolean visit(Sauce ingredientSauce);
	boolean visit(Pain ingredientPain);
	boolean visit(Thon ingredientThon);
	boolean visit(Salade ingredientSalade);
}
