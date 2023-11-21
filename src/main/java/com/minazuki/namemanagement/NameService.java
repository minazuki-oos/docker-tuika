package com.minazuki.namemanagement;

import java.util.List;
import org.springframework.stereotype.Service;



@Service
public class NameService {

    private final NameMapper nameMapper;

    public NameService(NameMapper nameMapper) {
        this.nameMapper = nameMapper;
    }

    public List<Name> getNames() {
        List<Name> names = nameMapper.findAll();
        return names;
    }
}