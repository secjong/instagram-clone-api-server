package com.secjong.instagramclone.template.service;

import com.secjong.instagramclone.template.dto.TemplateDto;
import org.springframework.stereotype.Service;

public interface TemplateService {

    public TemplateDto getTemplateById (String id);
}
