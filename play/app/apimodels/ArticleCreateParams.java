package apimodels;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ArticleCreateParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2023-01-24T00:25:45.213559Z[Etc/UTC]")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ArticleCreateParams   {
  @JsonProperty("title")
  @NotNull

  private String title;

  @JsonProperty("content")
  
  private String content;

  public ArticleCreateParams title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ArticleCreateParams content(String content) {
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArticleCreateParams articleCreateParams = (ArticleCreateParams) o;
    return Objects.equals(title, articleCreateParams.title) &&
        Objects.equals(content, articleCreateParams.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, content);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArticleCreateParams {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

