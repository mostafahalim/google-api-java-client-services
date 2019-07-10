/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.serviceconsumermanagement.v1.model;

/**
 * `Documentation` provides the information for describing a service.
 *
 * Example: documentation:   summary: >     The Google Calendar API gives access     to most
 * calendar features.   pages:   - name: Overview     content: == include google/foo/overview.md ==
 * - name: Tutorial     content: == include google/foo/tutorial.md ==     subpages;     - name: Java
 * content: == include google/foo/tutorial_java.md ==   rules:   - selector:
 * google.calendar.Calendar.Get     description: >       ...   - selector:
 * google.calendar.Calendar.Put     description: >       ...
 *
 * Documentation is provided in markdown syntax. In addition to standard markdown features,
 * definition lists, tables and fenced code blocks are supported. Section headers can be provided
 * and are interpreted relative to the section nesting of the context where a documentation fragment
 * is embedded.
 *
 * Documentation from the IDL is merged with documentation defined via the config at normalization
 * time, where documentation provided by config rules overrides IDL provided.
 *
 * A number of constructs specific to the API platform are supported in documentation text.
 *
 * In order to reference a proto element, the following notation can be used:
 * fully.qualified.proto.name]] To override the display text used for the link, this can be used:
 * display text]fully.qualified.proto.name] Text can be excluded from doc using the following
 * notation: -- internal comment --
 *
 * A few directives are available in documentation. Note that directives must appear on a single
 * line to be properly identified. The `include` directive includes a markdown file from an external
 * source: == include path/to/file == The `resource_for` directive marks a message to be the
 * resource of a collection in REST view. If it is not specified, tools attempt to infer the
 * resource from the operations in a collection: == resource_for v1.shelves.books == The directive
 * `suppress_warning` does not directly affect documentation and is documented together with service
 * config validation.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Consumer Management API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Documentation extends com.google.api.client.json.GenericJson {

  /**
   * The URL to the root of documentation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String documentationRootUrl;

  /**
   * Declares a single overview page. For example: documentation:   summary: ...   overview: ==
   * include overview.md ==
   *
   * This is a shortcut for the following declaration (using pages style): documentation:   summary:
   * ...   pages:   - name: Overview     content: == include overview.md ==
   *
   * Note: you cannot specify both `overview` field and `pages` field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String overview;

  /**
   * The top level pages for the documentation set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Page> pages;

  /**
   * A list of documentation rules that apply to individual API elements.
   *
   * **NOTE:** All service configuration rules follow "last one wins" order.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<DocumentationRule> rules;

  /**
   * Specifies the service root url if the default one (the service name from the yaml file) is not
   * suitable. This can be seen in any fully specified service urls as well as sections that show a
   * base that other urls are relative to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serviceRootUrl;

  /**
   * A short summary of what the service does. Can only be provided by plain text.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String summary;

  /**
   * The URL to the root of documentation.
   * @return value or {@code null} for none
   */
  public java.lang.String getDocumentationRootUrl() {
    return documentationRootUrl;
  }

  /**
   * The URL to the root of documentation.
   * @param documentationRootUrl documentationRootUrl or {@code null} for none
   */
  public Documentation setDocumentationRootUrl(java.lang.String documentationRootUrl) {
    this.documentationRootUrl = documentationRootUrl;
    return this;
  }

  /**
   * Declares a single overview page. For example: documentation:   summary: ...   overview: ==
   * include overview.md ==
   *
   * This is a shortcut for the following declaration (using pages style): documentation:   summary:
   * ...   pages:   - name: Overview     content: == include overview.md ==
   *
   * Note: you cannot specify both `overview` field and `pages` field.
   * @return value or {@code null} for none
   */
  public java.lang.String getOverview() {
    return overview;
  }

  /**
   * Declares a single overview page. For example: documentation:   summary: ...   overview: ==
   * include overview.md ==
   *
   * This is a shortcut for the following declaration (using pages style): documentation:   summary:
   * ...   pages:   - name: Overview     content: == include overview.md ==
   *
   * Note: you cannot specify both `overview` field and `pages` field.
   * @param overview overview or {@code null} for none
   */
  public Documentation setOverview(java.lang.String overview) {
    this.overview = overview;
    return this;
  }

  /**
   * The top level pages for the documentation set.
   * @return value or {@code null} for none
   */
  public java.util.List<Page> getPages() {
    return pages;
  }

  /**
   * The top level pages for the documentation set.
   * @param pages pages or {@code null} for none
   */
  public Documentation setPages(java.util.List<Page> pages) {
    this.pages = pages;
    return this;
  }

  /**
   * A list of documentation rules that apply to individual API elements.
   *
   * **NOTE:** All service configuration rules follow "last one wins" order.
   * @return value or {@code null} for none
   */
  public java.util.List<DocumentationRule> getRules() {
    return rules;
  }

  /**
   * A list of documentation rules that apply to individual API elements.
   *
   * **NOTE:** All service configuration rules follow "last one wins" order.
   * @param rules rules or {@code null} for none
   */
  public Documentation setRules(java.util.List<DocumentationRule> rules) {
    this.rules = rules;
    return this;
  }

  /**
   * Specifies the service root url if the default one (the service name from the yaml file) is not
   * suitable. This can be seen in any fully specified service urls as well as sections that show a
   * base that other urls are relative to.
   * @return value or {@code null} for none
   */
  public java.lang.String getServiceRootUrl() {
    return serviceRootUrl;
  }

  /**
   * Specifies the service root url if the default one (the service name from the yaml file) is not
   * suitable. This can be seen in any fully specified service urls as well as sections that show a
   * base that other urls are relative to.
   * @param serviceRootUrl serviceRootUrl or {@code null} for none
   */
  public Documentation setServiceRootUrl(java.lang.String serviceRootUrl) {
    this.serviceRootUrl = serviceRootUrl;
    return this;
  }

  /**
   * A short summary of what the service does. Can only be provided by plain text.
   * @return value or {@code null} for none
   */
  public java.lang.String getSummary() {
    return summary;
  }

  /**
   * A short summary of what the service does. Can only be provided by plain text.
   * @param summary summary or {@code null} for none
   */
  public Documentation setSummary(java.lang.String summary) {
    this.summary = summary;
    return this;
  }

  @Override
  public Documentation set(String fieldName, Object value) {
    return (Documentation) super.set(fieldName, value);
  }

  @Override
  public Documentation clone() {
    return (Documentation) super.clone();
  }

}
