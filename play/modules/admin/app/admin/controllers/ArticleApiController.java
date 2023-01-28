package admin.controllers;

import openapitools.OpenAPIUtils;
import admin.apimodels.ArticleCreateParams;

import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;

import com.typesafe.config.Config;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2023-01-24T13:21:54.059164Z[Etc/UTC]")
public class ArticleApiController extends Controller {
    private final ArticleApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private ArticleApiController(Config configuration, ArticleApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @OpenAPIUtils.ApiAction
    public Result createArticle(Http.Request request) throws Exception {
        JsonNode nodearticleCreateParams = request.body().asJson();
        ArticleCreateParams articleCreateParams;
        if (nodearticleCreateParams != null) {
            articleCreateParams = mapper.readValue(nodearticleCreateParams.toString(), ArticleCreateParams.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(articleCreateParams);
            }
        } else {
            articleCreateParams = null;
        }
        return imp.createArticleHttp(request, articleCreateParams);
    }

    @OpenAPIUtils.ApiAction
    public Result deleteArticle(Http.Request request, Integer id) throws Exception {
        return imp.deleteArticleHttp(request, id);
    }

    @OpenAPIUtils.ApiAction
    public Result getArticles(Http.Request request) throws Exception {
        return imp.getArticlesHttp(request);
    }

    @OpenAPIUtils.ApiAction
    public Result updateArticle(Http.Request request, Integer id) throws Exception {
        return imp.updateArticleHttp(request, id);
    }

}
