package com.yourxiong.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class KeyWord implements Serializable {
    private  String keyword;
    private List<News> news;
}
