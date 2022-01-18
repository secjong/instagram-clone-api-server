package com.secjong.instagramclone.template.service;

import com.secjong.instagramclone.template.dto.TemplateDto;
import org.springframework.stereotype.Service;

@Service
public class TemplateServiceImpl implements TemplateService {

    @Override
    public TemplateDto getTemplateById(String id) {
        TemplateDto templateDto = new TemplateDto();
        templateDto.setId("A001");
        templateDto.setName("sejong");
        templateDto.setAge(33);
        templateDto.setIsActive("Y");
        return templateDto;
    }
}
