package de.neuefische.firstherokuproject;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HerokuController {


    @GetMapping
    public String hallo(){
        return "Multipliziert Zahlen o.O";
    }

    @GetMapping("/{id}")
    public int hello(@PathVariable int i){
        return i * i * i * i;
    }

}
