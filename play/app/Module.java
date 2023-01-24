import com.google.inject.AbstractModule;

import controllers.media.*;
import openapitools.SecurityAPIUtils;

public class Module extends AbstractModule {

    @Override
    protected void configure() {
        bind(AdminArticleApiControllerImpInterface.class).to(AdminArticleApiControllerImp.class);
        bind(ArticleApiControllerImpInterface.class).to(ArticleApiControllerImp.class);
        bind(SecurityAPIUtils.class);
    }
}