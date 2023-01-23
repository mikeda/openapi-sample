package controllers;

import apimodels.Article;
import apimodels.ArticleCreateParams;

import com.google.inject.Inject;
import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import play.mvc.Result;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import openapitools.OpenAPIUtils;
import openapitools.SecurityAPIUtils;
import static play.mvc.Results.ok;
import static play.mvc.Results.unauthorized;
import play.libs.Files.TemporaryFile;

import javax.validation.constraints.*;

@SuppressWarnings("RedundantThrows")
public abstract class DefaultApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result createArticleHttp(Http.Request request, Integer id, ArticleCreateParams articleCreateParams) throws Exception {
        Article obj = createArticle(request, id, articleCreateParams);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract Article createArticle(Http.Request request, Integer id, ArticleCreateParams articleCreateParams) throws Exception;

    public Result listArticlesHttp(Http.Request request) throws Exception {
        List<Article> obj = listArticles(request);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (Article curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<Article> listArticles(Http.Request request) throws Exception;

}