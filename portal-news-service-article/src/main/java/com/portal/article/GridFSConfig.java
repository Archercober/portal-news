package com.portal.article;

import com.mongodb.client.MongoDatabase;
import com.mongodb.client.gridfs.GridFSBucket;
import com.mongodb.client.gridfs.GridFSBuckets;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDatabaseFactory;

@Configuration
public class GridFSConfig {

    @Value("${spring.data.mongodb.database}")
    private String mongodb;

    @Autowired
    private MongoDatabaseFactory mongoDbFactory;

    @Bean
    public GridFSBucket gridFSBucket() {
        MongoDatabase mongoDatabase = mongoDbFactory.getMongoDatabase();
        GridFSBucket bucket = GridFSBuckets.create(mongoDatabase);
        return bucket;
    }

}