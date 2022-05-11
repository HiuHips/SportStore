package SportStore.Service.User;

import java.util.List;

import org.springframework.stereotype.Service;

import SportStore.Dto.ProductsDto;
@Service
public interface ICategoryService {
	public List<ProductsDto> GetDataProductsPaginate(int id, int start, int totalPage);
	
	public List<ProductsDto> GetAllProductsByID(int id);
}
