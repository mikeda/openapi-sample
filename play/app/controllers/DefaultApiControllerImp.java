package controllers;

import apimodels.Article;
import apimodels.ArticleCreateParams;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2023-01-23T17:32:40.131544Z[Etc/UTC]")
public class DefaultApiControllerImp extends DefaultApiControllerImpInterface {
    @Override
    public Article createArticle(Http.Request request, Integer id, ArticleCreateParams articleCreateParams) throws Exception {
        //Do your magic!!!
        return new Article();
    }

    @Override
    public List<Article> listArticles(Http.Request request) throws Exception {
        //Do your magic!!!
        return new ArrayList<Article>();
    }

}
