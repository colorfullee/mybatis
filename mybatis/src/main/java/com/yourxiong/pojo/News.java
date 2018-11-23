package com.yourxiong.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class News implements Serializable {
    private String id;
    private String title;
    private String description;
    private String picUrl;
    private String url;
    private String type;
    private List<KeyWord> keyWords;
}
