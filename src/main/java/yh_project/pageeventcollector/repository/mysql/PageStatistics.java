package yh_project.pageeventcollector.repository.mysql;


import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class PageStatistics {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private Long total_count;
    private String top_event;
    private String second_event;
    private String third_event;
    private LocalDateTime start_date;
    private LocalDateTime end_date;
    private LocalDateTime created_date;


}
