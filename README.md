# OpenAPI

```bash
docker run --rm -v "${PWD}:/local" openapitools/openapi-generator-cli generate -i /local/openapi.yaml -g java-play-framework -o /local/out/play
```

```bash
docker run --rm -v "${PWD}:/local" openapitools/openapi-generator-cli generate -i /local/openapi.yaml -g typescript-axios -o /local/out/axios --additional-properties=withSeparateModelsAndApi=true,apiPackage=api,modelPackage=model
```
