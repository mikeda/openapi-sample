package admin.controllers;

import com.google.inject.AbstractModule;
import openapitools.SecurityAPIUtils;

public class Module extends AbstractModule {

    @Override
    protected void configure() {
        bind(ArticleApiControllerImpInterface.class).to(ArticleApiControllerImp.class);
        bind(SecurityAPIUtils.class);
    }
}