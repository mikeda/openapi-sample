package admin.controllers;

import openapitools.OpenAPIUtils;
import openapitools.SecurityAPIUtils;
import admin.apimodels.Article;
import admin.apimodels.ArticleCreateParams;

import com.google.inject.Inject;
import com.typesafe.config.Config;
import play.mvc.Http;
import java.util.List;

import play.mvc.Result;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;

import static play.mvc.Results.ok;
import static play.mvc.Results.unauthorized;

@SuppressWarnings("RedundantThrows")
public abstract class ArticleApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result createArticleHttp(Http.Request request, ArticleCreateParams articleCreateParams) throws Exception {
        Article obj = createArticle(request, articleCreateParams);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Article createArticle(Http.Request request, ArticleCreateParams articleCreateParams) throws Exception;

    public Result deleteArticleHttp(Http.Request request, Integer id) throws Exception {
        Article obj = deleteArticle(request, id);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Article deleteArticle(Http.Request request, Integer id) throws Exception;

    public Result getArticlesHttp(Http.Request request) throws Exception {
        List<Article> obj = getArticles(request);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (Article curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<Article> getArticles(Http.Request request) throws Exception;

    public Result updateArticleHttp(Http.Request request, Integer id) throws Exception {
        Article obj = updateArticle(request, id);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Article updateArticle(Http.Request request, Integer id) throws Exception;

}
