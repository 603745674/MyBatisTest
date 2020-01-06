package com.langkun;


public class TbBrand {

  private Integer brandId;
  private String brandName;


  public Integer getBrandId() {
    return brandId;
  }

  public void setBrandId(Integer brandId) {
    this.brandId = brandId;
  }

  public String getBrandName() {
    return brandName;
  }

  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }

  @Override
  public String toString() {
    return "TbBrand{" +
            "brandId=" + brandId +
            ", brandName='" + brandName + '\'' +
            '}';
  }
}
