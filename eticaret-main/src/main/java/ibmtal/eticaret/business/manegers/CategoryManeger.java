package ibmtal.eticaret.business.manegers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import ibmtal.eticaret.business.services.CategoryService;
import ibmtal.eticaret.core.result.Result;
import ibmtal.eticaret.database.CategoryDao;
import ibmtal.eticaret.entity.Category;
@Service
public class  CategoryManeger implements CategoryService{
private CategoryDao categoryDao;
@Autowired
public CategoryManeger(CategoryDao categoryDao) {
	super();
	this.categoryDao = categoryDao;
}
@Override
public ArrayList<Category> getAll(){
	return new ArrayList<Category>(this.categoryDao.findAll());
}

@Override
public Result<Category> addCategory(Category category) {
	Result<Category> result=new Result<Category>();
	if(category.getName().isEmpty()) {
		result.newError("name","Boş Geçilemez");
	}
                   
	if(category.getName().length()>50) {
		result.newError("name", "50 Karakterden Fazla Olamaz");
	}
		if(category.getShortName().isEmpty()) {
			result.newError("ShortName", "Boş Gecemez");
			
		}
			if(category.getShortName().length()>5) {
				result.newError("ShortName", "5 Karakterden Fazla Olmaz");
			}
				
	if(result.isSuccess()) {
		this.categoryDao.save(category);
	}
	return result;
}
}