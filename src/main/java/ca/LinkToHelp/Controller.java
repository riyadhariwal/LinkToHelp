package ca.LinkToHelp;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping("/")
    public String test (){
        System.out.println("Controller -> welcome");

        return "index";
    }

    @RequestMapping("/organization_list")
    public String listOrganization(Model model) {
        OrganizationBusiness organizationBusiness = new OrganizationBusiness();
        ArrayList<Organization> organizationList = organizationBusiness.getOrganizationList();

        model.addAllAttributes(organizationList);

        return "context";
    }
}
