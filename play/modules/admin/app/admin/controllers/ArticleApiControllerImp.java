package admin.controllers;

import admin.apimodels.ArticleCreateParams;
import admin.apimodels.Article;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2023-01-24T13:21:54.059164Z[Etc/UTC]")
public class ArticleApiControllerImp extends ArticleApiControllerImpInterface {
    @Override
    public Article createArticle(Http.Request request, ArticleCreateParams articleCreateParams) throws Exception {
        //Do your magic!!!
        return new Article();
    }

    @Override
    public Article deleteArticle(Http.Request request, Integer id) throws Exception {
        //Do your magic!!!
        return new Article();
    }

    @Override
    public List<Article> getArticles(Http.Request request) throws Exception {
        //Do your magic!!!
        return new ArrayList<Article>();
    }

    @Override
    public Article updateArticle(Http.Request request, Integer id) throws Exception {
        //Do your magic!!!
        return new Article();
    }

}
