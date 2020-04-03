package com.example.mapper;

import com.example.domain.Article;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ArticleMapper {

    //根据id查询文章（包含对应的评论）
    public Article selectArticle(Integer id);


}
