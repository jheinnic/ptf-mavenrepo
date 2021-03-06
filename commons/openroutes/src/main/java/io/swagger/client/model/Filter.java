package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Filter
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-16T23:56:32.457Z")
public class Filter {
  @SerializedName("category_group_ids")
  private List<Long> categoryGroupIds = null;

  @SerializedName("catoegory_ids")
  private List<Long> catoegoryIds = null;

  public Filter categoryGroupIds(List<Long> categoryGroupIds) {
    this.categoryGroupIds = categoryGroupIds;
    return this;
  }

  public Filter addCategoryGroupIdsItem(Long categoryGroupIdsItem) {
    if (this.categoryGroupIds == null) {
      this.categoryGroupIds = new ArrayList<Long>();
    }
    this.categoryGroupIds.add(categoryGroupIdsItem);
    return this;
  }

   /**
   * Get categoryGroupIds
   * @return categoryGroupIds
  **/
  @ApiModelProperty(value = "")
  public List<Long> getCategoryGroupIds() {
    return categoryGroupIds;
  }

  public void setCategoryGroupIds(List<Long> categoryGroupIds) {
    this.categoryGroupIds = categoryGroupIds;
  }

  public Filter catoegoryIds(List<Long> catoegoryIds) {
    this.catoegoryIds = catoegoryIds;
    return this;
  }

  public Filter addCatoegoryIdsItem(Long catoegoryIdsItem) {
    if (this.catoegoryIds == null) {
      this.catoegoryIds = new ArrayList<Long>();
    }
    this.catoegoryIds.add(catoegoryIdsItem);
    return this;
  }

   /**
   * Get catoegoryIds
   * @return catoegoryIds
  **/
  @ApiModelProperty(value = "")
  public List<Long> getCatoegoryIds() {
    return catoegoryIds;
  }

  public void setCatoegoryIds(List<Long> catoegoryIds) {
    this.catoegoryIds = catoegoryIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Filter filter = (Filter) o;
    return Objects.equals(this.categoryGroupIds, filter.categoryGroupIds) &&
        Objects.equals(this.catoegoryIds, filter.catoegoryIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryGroupIds, catoegoryIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Filter {\n");
    
    sb.append("    categoryGroupIds: ").append(toIndentedString(categoryGroupIds)).append("\n");
    sb.append("    catoegoryIds: ").append(toIndentedString(catoegoryIds)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

