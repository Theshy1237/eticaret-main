package ibmtal.eticaret.business.manegers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




import ibmtal.eticaret.business.services.ColorService;
import ibmtal.eticaret.database.ColorDao;

import ibmtal.eticaret.entity.Color;
@Service
public class  ColorManeger implements ColorService{

private ColorDao colorDao;
@Autowired
public ColorManeger(ColorDao colorDao) {
	super();
	this.colorDao = colorDao;
}

	
	

public ColorDao getColorDao() {
	return colorDao;
}
public void setColorDao(ColorDao colorDao) {
	this.colorDao = colorDao;
}
@Override
public ArrayList<Color> getAll(){
	return new ArrayList<Color>(this.colorDao.findAll());
} 
 @Override
 public Color addColor(Color color) {
	 this.colorDao.save(color);
	 return color;
 } 





}