package com.portal.article.mapper;

import com.portal.my.mapper.MyMapper;
import com.portal.pojo.Article;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleMapper extends MyMapper<Article> {
}