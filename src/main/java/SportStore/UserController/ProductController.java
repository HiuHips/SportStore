package SportStore.UserController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import SportStore.Service.User.IProductService;

@Controller
public class ProductController extends BaseController{
	@Autowired	
	private IProductService _productService;
	
	@RequestMapping(value= { "chi-tiet-san-pham/{id}"})
	public ModelAndView Product(@PathVariable long id) {
		_mvShare.setViewName("user/products/product");
		_mvShare.addObject("product", _productService.GetProductsByID(id));
		int idCategory = _productService.GetProductsByID(id).getId_category();
		_mvShare.addObject("productByIDCategory", _productService.GetProductsByIDCategory(idCategory));
		return _mvShare;
	}
}
