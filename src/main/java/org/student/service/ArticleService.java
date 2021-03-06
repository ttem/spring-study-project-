package org.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.student.domain.Article;
import org.student.mapper.ArticleMapper;

import java.util.Date;
import java.util.List;

@Service
public class ArticleService {

    @Autowired
    ArticleMapper articleMapper;

    public List<Article> getArticleList() {
        return articleMapper.getArticles();
    }

    public Article getArticleById(int id) {
        return articleMapper.getArticleById(id);
    }

    public void createArticle(Article article) {
        article.setLastUpdate(new Date());
        articleMapper.createArticle(article);
    }

    public void deleteArticle(int id) {
        articleMapper.deleteArticle(id);
    }

    public void updateArticle(Article article){
        article.setLastUpdate(new Date());
        articleMapper.updateArticle(article);
    }

    public int getArticlesCount() {
        return articleMapper.getArticlesCount();
    }
}
