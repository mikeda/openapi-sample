package controllers.media;

import apimodels.media.Article;

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

    @ApiAction
    public Result getArticle(Http.Request request, Integer id) throws Exception {
        return imp.getArticleHttp(request, id);
    }

    @ApiAction
    public Result getArticles(Http.Request request) throws Exception {
        return imp.getArticlesHttp(request);
    }

}
