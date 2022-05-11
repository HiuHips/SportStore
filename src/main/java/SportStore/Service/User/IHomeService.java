package SportStore.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SportStore.Dto.ProductsDto;
import SportStore.Entity.Categorys;
import SportStore.Entity.Menus;
import SportStore.Entity.Slides;
@Service
public interface IHomeService {
	@Autowired
	public List<Slides> GetDataSlide();
	public List<Categorys> GetDataCategory();
	public List<Menus> GetDataMenu();
	public List<ProductsDto> GetData();
}
