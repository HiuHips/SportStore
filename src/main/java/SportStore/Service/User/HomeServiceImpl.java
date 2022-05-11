package SportStore.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SportStore.Dao.CategorysDao;
import SportStore.Dao.MenuDao;
import SportStore.Dao.ProductsDao;
import SportStore.Dao.SlidesDao;
import SportStore.Dto.ProductsDto;
import SportStore.Entity.Categorys;
import SportStore.Entity.Menus;
import SportStore.Entity.Slides;
@Service
public class HomeServiceImpl implements IHomeService{
	@Autowired
	private SlidesDao slidesDao;
	@Autowired
	private CategorysDao categorysDao;
	@Autowired
	private MenuDao menuDao;
	@Autowired
	private ProductsDao productsDao;

	public List<Slides> GetDataSlide() {
		return slidesDao.GetDataSlide();
	}

	public List<Categorys> GetDataCategory() {
		return categorysDao.GetDataCategorys();
	}

	public List<Menus> GetDataMenu() {
		return menuDao.GetDataMenus();
	}

	public List<ProductsDto> GetDataProducts() {
		List<ProductsDto> listProducts = productsDao.GetDataProducts();
		return listProducts;
	}

	public List<ProductsDto> GetData() {
		// TODO Auto-generated method stub
		return null;
	}


	
	

	
}


