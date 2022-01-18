package com.secjong.instagramclone.template.controller;

import com.secjong.instagramclone.template.dto.TemplateDto;
import com.secjong.instagramclone.template.service.TemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/template")
public class TemplateController {

    @Autowired
    private TemplateService templateService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<TemplateDto> getName (@PathVariable(name = "id", required = true) String id) {
        TemplateDto templateDto = templateService.getTemplateById(id);
        return new ResponseEntity<>(templateDto, HttpStatus.OK);
    }

}
