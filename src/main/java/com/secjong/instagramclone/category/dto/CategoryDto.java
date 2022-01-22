package com.secjong.instagramclone.category.dto;

//@Alias("CategoryDto") // mapper에서 사용할 DTO 별칭
public class CategoryDto {
    private String id;
    private String name;
    private String prefix;

    public CategoryDto() {
    }

    public CategoryDto(String id, String name, String prefix) {
        this.id = id;
        this.name = name;
        this.prefix = prefix;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }
}
