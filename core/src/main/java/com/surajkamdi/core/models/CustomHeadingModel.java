package com.surajkamdi.core.models;

import com.adobe.cq.export.json.ComponentExporter;
import com.adobe.cq.export.json.ExporterConstants;
import javax.annotation.Nonnull;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = SlingHttpServletRequest.class,
    resourceType = CustomHeadingModel.RESOURCE_TYPE,
    adapters = {CustomHeadingModel.class, ComponentExporter.class},
    defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
@Exporter(name = ExporterConstants.SLING_MODEL_EXPORTER_NAME, extensions = ExporterConstants.SLING_MODEL_EXTENSION)
public class CustomHeadingModel implements ComponentExporter {

  protected static final String RESOURCE_TYPE = "my-aem-project/components/content/custom-heading";

  @ValueMapValue(name = "heading")
  private String heading;

  @ValueMapValue(name = "headingType")
  private String headingType;

  @ValueMapValue(name = "headingColor")
  private String headingColor;

  public String getHeading() {
    return heading;
  }

  public String getHeadingType() {
    return headingType;
  }

  public String getHeadingColor() {
    return headingColor;
  }

  @Nonnull
  @Override
  public String getExportedType() {
    return RESOURCE_TYPE;
  }
}
