package com.minazuki.namemanagement;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class NameController {

    private final NameService nameService;

    public NameController(NameService nameService) {
        this.nameService = nameService;
    }

    @GetMapping("/names_management")
    public List<Name> getNames() {
        List<Name> names = nameService.getNames();
        return names;
    }
}