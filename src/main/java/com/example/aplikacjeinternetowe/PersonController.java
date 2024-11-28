package com.example.aplikacjeinternetowe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PersonController {

    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/persons")
    public String getPersons(Model model) {
        model.addAttribute("persons", personService.getPeople());
        return "persons";
    }

    @GetMapping("/persons/{index}")
    public String getPerson(@PathVariable int index, Model model) {
        Person person = personService.getPerson(index);
        if (person != null) {
            model.addAttribute("person", person);
            return "person";
        }
        return "error";
    }

    @GetMapping("/persons/add")
    public String addPersonForm(Model model) {
        model.addAttribute("person", new Person());
        return "addPerson";
    }

    @PostMapping("/persons")
    public String addPerson(@ModelAttribute Person person) {
        personService.addPerson(person);
        return "redirect:/persons";
    }
}