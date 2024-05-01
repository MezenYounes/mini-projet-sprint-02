package com.mezen.camion.Controller;
import java.text.ParseException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.mezen.camion.entities.Camion;
import com.mezen.camion.service.CamionService;

@Controller
public class CamionController {
	@Autowired
	private CamionService camionservice;	
	
	//@RequestMapping("/listeCamions")
	//public String listeCamions(ModelMap modelMap,
		//	@RequestParam (name="page",defaultValue = "0") int page,
			//@RequestParam (name="size", defaultValue = "2") int size)
	//{
	//Page<Camion> cams = camionservice.getAllCamionsParPage(page, size);
//	modelMap.addAttribute("camions", cams);
//	modelMap.addAttribute("pages", new int[cams.getTotalPages()]);
//	modelMap.addAttribute("currentPage", page);

//	return "listeCamions";
//	}
	@RequestMapping("/showCreate")
	public String showCreate()
	{
	return "createCamion";
	}
	@RequestMapping("/saveCamion")
	public String saveCamion(@ModelAttribute("camion") Camion camion, ModelMap modelMap) throws ParseException
	{
		Camion saveCamion = camionservice.saveCamion(camion);
		String msg ="camion enregistré avec Id "+saveCamion.getIdcamion();
		modelMap.addAttribute("msg", msg);
		return "createCamion";
		}
//	@RequestMapping("/supprimerCamion")
	//public String supprimerCamion(@RequestParam("id") Long id,ModelMap modelMap,
		//	@RequestParam (name="page",defaultValue = "0") int page,
			//@RequestParam (name="size", defaultValue = "2") int size)
//	{
	//	camionservice.deleteCamionById(id);
		//Page<Camion> cams = camionservice.getAllCamionsParPage(page, size);
//	modelMap.addAttribute("camions", cams);
//	modelMap.addAttribute("pages", new int[cams.getTotalPages()]);
//	modelMap.addAttribute("currentPage", page);
//	modelMap.addAttribute("size", size);


	//return "listeCamions";
	//}
	@RequestMapping("/modifierCamion")
	public String editerCamion(@RequestParam("id") Long id,ModelMap modelMap)
	{
		Camion c= camionservice.getCamion(id);
	modelMap.addAttribute("camions", c);
	return "editerCamion";
	}
	@RequestMapping("/updateCamion")
	public String updateCamion(@ModelAttribute("camion") Camion camion, ModelMap modelMap) throws ParseException
	{

		camionservice.updateCamion(camion);
	 List<Camion> cams = camionservice.getAllCamions();
	 modelMap.addAttribute("camionss", cams);
	return "listeCamions";
	}

	}



	


