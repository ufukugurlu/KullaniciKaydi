package com.example.ensondemo.Controller;


import com.example.ensondemo.Entity.Employee;
import com.example.ensondemo.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;


    @GetMapping("/")
    public  String get(Model model){
        model.addAttribute("list" , employeeService.listAll());
        return  "index";

    }

    @GetMapping("/new")
    public String newEmployee(Model model){
        Employee emp = new Employee();
        model.addAttribute("emp" , emp);
        return "new-employee";


    }

    @PostMapping("/save")
    public  String save (@ModelAttribute("emp") Employee emp){

    employeeService.save(emp);
    return "redirect:/";



    }

    @GetMapping("/edit/{id}")
    public ModelAndView update(@PathVariable(name="id") Integer employeeId){

     ModelAndView mav = new ModelAndView("edit-employee");


     Employee emp = employeeService.get(employeeId);


     mav.addObject("calisan", emp);

     return  mav;
         }


      @GetMapping("/delete/{id}")
      public  String delete(@PathVariable(name="id") int id ){

        employeeService.delete(id);

            return "redirect:/";

      }
}
