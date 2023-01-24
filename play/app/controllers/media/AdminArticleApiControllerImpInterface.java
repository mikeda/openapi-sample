package controllers.media;

import apimodels.media.Article;
import apimodels.media.ArticleCreateParams;

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
public abstract class AdminArticleApiControllerImpInterface {
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

    public Result getAdminArticlesHttp(Http.Request request) throws Exception {
        List<Article> obj = getAdminArticles(request);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (Article curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract List<Article> getAdminArticles(Http.Request request) throws Exception;

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
