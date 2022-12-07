package ibmtal.eticaret.business.manegers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ibmtal.eticaret.business.services.GraphicCardService;

import ibmtal.eticaret.database.GraphicCardDao;
import ibmtal.eticaret.entity.GraphicCard;

@Service
public class GraphicCardManeger implements GraphicCardService {
private GraphicCardDao graphicCardDao;
@Autowired
public GraphicCardManeger(GraphicCardDao graphicCardDao) {
	super();
	this.graphicCardDao = graphicCardDao;
}
@Override
public ArrayList<GraphicCard> getAll(){
	return new ArrayList<GraphicCard>(this.graphicCardDao.findAll());
}
}
