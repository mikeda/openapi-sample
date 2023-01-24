package controllers.media;

import apimodels.media.Article;
import apimodels.media.ArticleCreateParams;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2023-01-24T13:21:54.059164Z[Etc/UTC]")
public class AdminArticleApiControllerImp extends AdminArticleApiControllerImpInterface {
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
    public List<Article> getAdminArticles(Http.Request request) throws Exception {
        //Do your magic!!!
        return new ArrayList<Article>();
    }

    @Override
    public Article updateArticle(Http.Request request, Integer id) throws Exception {
        //Do your magic!!!
        return new Article();
    }

}
