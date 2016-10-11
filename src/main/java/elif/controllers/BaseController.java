package elif.controllers;

import elif.entities.Company;
import elif.services.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

/**
 * Created by Nazar on 05.10.2016.
 */
@Controller
public class BaseController {
    @Autowired
    private CompanyService companyService;

    @RequestMapping(value="/toCompanyCreatePage")
    public String toCompanyCreatePage(){
        return "createCompany";
    }

    @RequestMapping(value = "/toCreateCompany", method = RequestMethod.POST)
    public ModelAndView createCompany(@RequestParam("companyName")String companyName, @RequestParam("companyEarnings")String companyEarnings){
        companyService.createCompany(companyName,Integer.parseInt(companyEarnings));
        return new ModelAndView("redirect:/");
    }

    @RequestMapping(value = "/")
    public String findAllCompanies(Model model){
        List<Company> companies =  companyService.findAllCompanies();
        model.addAttribute("companies",companies);
        return "allCompanies";
    }

    @RequestMapping(value = "/findOneCompany/{id}")
    public String findOneCompany(@PathVariable(value = "id") String id,Model model){
        Company company = companyService.findOneCompany(Integer.parseInt(id));
        model.addAttribute("company",company);
        List<Company> companies = companyService.findChildren(Integer.parseInt(id));
        model.addAttribute("companies",companies);
        return "theCompanyPage";
    }

    @RequestMapping(value = "/toCompanyEditPage/{id}")
    public String toCompanyEditPage(@PathVariable(value = "id")String id,Model model){
        Company company = companyService.findOneCompany(Integer.parseInt(id));
        model.addAttribute("companyForEdit",company);
        return "editCompany";
    }

    @RequestMapping(value = "/toCompanyEdit/{id}", method = RequestMethod.POST)
    public ModelAndView toCompanyEdit(@PathVariable("id")String id, @RequestParam("companyName")String companyName, @RequestParam("companyEarnings") String companyEarnings){
        companyService.CompanyEdit(Integer.parseInt(id),companyName,Integer.parseInt(companyEarnings));
        return new ModelAndView("redirect:/");
    }

    @RequestMapping(value = "/toCompanyDelete/{id}",method = RequestMethod.GET)
    public ModelAndView toCompanyDelete(@PathVariable("id")String id){
        companyService.deleteCompany(Integer.parseInt(id));
        return new ModelAndView("redirect:/");
    }

    @RequestMapping(value = "/addChildPage/{id}")
    public String addChildPage(@PathVariable("id")String id,Model model){
        Company company = companyService.findOneCompany(Integer.parseInt(id));
        model.addAttribute("company",company);
        return "addChildPage";
    }

    @RequestMapping(value = "/addChild/{id}",method = RequestMethod.POST)
    public String addChild(@PathVariable("id")String id,@RequestParam("companyName")String companyName,@RequestParam("companyEarnings")String companyEarnings){
        companyService.addChild(Integer.parseInt(id),companyName,Integer.parseInt(companyEarnings));
        return "allCompanies";
    }

}
