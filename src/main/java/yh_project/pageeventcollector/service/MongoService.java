package yh_project.pageeventcollector.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;
import yh_project.pageeventcollector.repository.mongo.collection.pageEvent.PageEvent;

@Service
@RequiredArgsConstructor
public class MongoService {
    private final MongoRepository mongoRepository;
    public void insertPageEvent(PageEvent event) {
        mongoRepository.save(event);
    }


}
