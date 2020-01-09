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

package com.google.api.services.docs.v1.model;

/**
 * Creates a Footnote segment and inserts a new FootnoteReference to it at the given location.
 *
 * The new Footnote segment will contain a space followed by a newline character.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Docs API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CreateFootnoteRequest extends com.google.api.client.json.GenericJson {

  /**
   * Inserts the footnote reference at the end of the document body.
   *
   * Footnote references cannot be inserted inside a header, footer or footnote. Since footnote
   * references can only be inserted in the body, the segment ID field must be empty.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private EndOfSegmentLocation endOfSegmentLocation;

  /**
   * Inserts the footnote reference at a specific index in the document.
   *
   * The footnote reference must be inserted inside the bounds of an existing Paragraph. For
   * instance, it cannot be inserted at a table's start index (i.e. between the table and its
   * preceding paragraph).
   *
   * Footnote references cannot be inserted inside an equation, header, footer or footnote. Since
   * footnote references can only be inserted in the body, the segment ID field must be empty.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Location location;

  /**
   * Inserts the footnote reference at the end of the document body.
   *
   * Footnote references cannot be inserted inside a header, footer or footnote. Since footnote
   * references can only be inserted in the body, the segment ID field must be empty.
   * @return value or {@code null} for none
   */
  public EndOfSegmentLocation getEndOfSegmentLocation() {
    return endOfSegmentLocation;
  }

  /**
   * Inserts the footnote reference at the end of the document body.
   *
   * Footnote references cannot be inserted inside a header, footer or footnote. Since footnote
   * references can only be inserted in the body, the segment ID field must be empty.
   * @param endOfSegmentLocation endOfSegmentLocation or {@code null} for none
   */
  public CreateFootnoteRequest setEndOfSegmentLocation(EndOfSegmentLocation endOfSegmentLocation) {
    this.endOfSegmentLocation = endOfSegmentLocation;
    return this;
  }

  /**
   * Inserts the footnote reference at a specific index in the document.
   *
   * The footnote reference must be inserted inside the bounds of an existing Paragraph. For
   * instance, it cannot be inserted at a table's start index (i.e. between the table and its
   * preceding paragraph).
   *
   * Footnote references cannot be inserted inside an equation, header, footer or footnote. Since
   * footnote references can only be inserted in the body, the segment ID field must be empty.
   * @return value or {@code null} for none
   */
  public Location getLocation() {
    return location;
  }

  /**
   * Inserts the footnote reference at a specific index in the document.
   *
   * The footnote reference must be inserted inside the bounds of an existing Paragraph. For
   * instance, it cannot be inserted at a table's start index (i.e. between the table and its
   * preceding paragraph).
   *
   * Footnote references cannot be inserted inside an equation, header, footer or footnote. Since
   * footnote references can only be inserted in the body, the segment ID field must be empty.
   * @param location location or {@code null} for none
   */
  public CreateFootnoteRequest setLocation(Location location) {
    this.location = location;
    return this;
  }

  @Override
  public CreateFootnoteRequest set(String fieldName, Object value) {
    return (CreateFootnoteRequest) super.set(fieldName, value);
  }

  @Override
  public CreateFootnoteRequest clone() {
    return (CreateFootnoteRequest) super.clone();
  }

}
