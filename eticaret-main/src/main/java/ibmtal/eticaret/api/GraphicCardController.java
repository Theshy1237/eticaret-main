package ibmtal.eticaret.api;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import ibmtal.eticaret.business.services.GraphicCardService;
import ibmtal.eticaret.entity.GraphicCard;
@RestController
@RequestMapping("/api/graphicCard")
public class GraphicCardController {
private GraphicCardService graphicCardService;
@Autowired
public GraphicCardController(GraphicCardService graphicCardService) {
	super();
	this.graphicCardService = graphicCardService;
}
@GetMapping("/getAll")
public ArrayList<GraphicCard> getAll(){
	return this.graphicCardService.getAll();
}
}
