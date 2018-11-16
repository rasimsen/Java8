import java.sql.Date;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Message {
  private Long id;
  private Long originatingId;
  private String payload;
  private String metadata;
  private String username = "default";
  private Date dateEntered;
  private Date dateDeleted;
  private String messageId;
  private String correlationId;


  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public Long getOriginatingId() {
    return originatingId;
  }


  public void setOriginatingId(Long originatingId) {
    this.originatingId = originatingId;
  }


  public String getPayload() {
    return payload;
  }


  public void setPayload(String payload) {
    this.payload = payload;
  }


  public String getMetadata() {
    return metadata;
  }


  public void setMetadata(String metadata) {
    this.metadata = metadata;
  }


  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }


  public Date getDateEntered() {
    return dateEntered;
  }


  public void setDateEntered(Date dateEntered) {
    this.dateEntered = dateEntered;
  }


  public Date getDateDeleted() {
    return dateDeleted;
  }


  public void setDateDeleted(Date dateDeleted) {
    this.dateDeleted = dateDeleted;
  }


  public String getMessageId() {
    return messageId;
  }


  public void setMessageId(String messageId) {
    this.messageId = messageId;
  }


  public String getCorrelationId() {
    return correlationId;
  }


  public void setCorrelationId(String correlationId) {
    this.correlationId = correlationId;
  }


  public String getFormat() {
    return format;
  }


  public void setFormat(String format) {
    this.format = format;
  }


  public String getDirection() {
    return direction;
  }


  public void setDirection(String direction) {
    this.direction = direction;
  }


  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public String getError() {
    return error;
  }


  public void setError(String error) {
    this.error = error;
  }


  public String getT2SActorMessageId() {
    return t2SActorMessageId;
  }


  public void setT2SActorMessageId(String t2SActorMessageId) {
    this.t2SActorMessageId = t2SActorMessageId;
  }


  private String format;
  private String direction;
  private String type;
  private String status = "PENDING";
  private String error;
  private String t2SActorMessageId;


  /**
   * Constructor.
   * @param payload the payload
   * @param originatingId the originating id
   * @param format the format
   * @param direction the direction
   * @param type the type
   */
  public Message(String payload, Long originatingId, String format, String direction, String type) {
    this.payload = payload;
    this.originatingId = originatingId;
    this.format = format;
    this.direction = direction;
    this.type = type;
  }
//
//  public Message(String payload, Long originatingId, Format format, Direction direction) {
//    this(payload, originatingId, format, direction, null);
//  }

  public Message(String payload, String format, String direction) {
    this(payload, null, format, direction, null);
  }

  public Message() {}
}
