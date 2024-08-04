package yh_project.pageeventcollector.repository.mongo.collection.pageEvent;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@Document(collection = "page_event_logger")
public class PageEvent {
    @Id
    private String id;
    private String section;
    private String element;
    private LocalDateTime eventTime;
    private String requestIP;

    public PageEvent() {
    }

    @Builder
    public PageEvent(String section, String element, LocalDateTime eventTime, String requestIP) {
        this.section = section;
        this.element = element;
        this.eventTime = eventTime;
        this.requestIP = requestIP;
    }
}
