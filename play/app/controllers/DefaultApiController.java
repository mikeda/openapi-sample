package controllers;

import apimodels.Article;
import apimodels.ArticleCreateParams;

import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import java.io.File;
import play.libs.Files.TemporaryFile;
import openapitools.OpenAPIUtils;
import com.fasterxml.jackson.core.type.TypeReference;

import javax.validation.constraints.*;
import com.typesafe.config.Config;

import openapitools.OpenAPIUtils.ApiAction;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2023-01-23T17:32:40.131544Z[Etc/UTC]")
public class DefaultApiController extends Controller {
    private final DefaultApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private DefaultApiController(Config configuration, DefaultApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result createArticle(Http.Request request, Integer id) throws Exception {
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
        return imp.createArticleHttp(request, id, articleCreateParams);
    }

    @ApiAction
    public Result listArticles(Http.Request request) throws Exception {
        return imp.listArticlesHttp(request);
    }

}
