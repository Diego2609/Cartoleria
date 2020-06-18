package it.dstech.cartoleria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import it.dstech.cartoleria.models.Prodotto;
import it.dstech.cartoleria.service.ProductsService;

@Controller
public class ProductsController {
	@Autowired
	private ProductsService service;

	@RequestMapping("/")
	public ModelAndView home() {
		List<Prodotto> listProdotto = service.listAll();
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("listProdotti", listProdotto);
		return mav;
	}

	@RequestMapping("/new")
	public String newProdottoForm(Model model) {
		Prodotto prodotto = new Prodotto();
		model.addAttribute("prodotto", prodotto);
		return "nuovoProdotto";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveProdotto(@ModelAttribute("prodotto") Prodotto prodotto) {
		service.save(prodotto);
		return "redirect:/";
	}

	@RequestMapping("/edit")
	public ModelAndView editProdottoForm(@RequestParam long id) {
		ModelAndView model = new ModelAndView("modificaProdotto");
		Prodotto prodotto = service.get(id);
		model.addObject("prodotto", prodotto);

		return model;
	}

	@RequestMapping("/delete")
	public String deleteProdottoForm(@RequestParam long id) {
		service.delete(id);
		return "redirect:/";
	}

	@RequestMapping(value = "/indietro", method = RequestMethod.POST)
	public String indietro() {
		return "redirect:/";
	}
}
