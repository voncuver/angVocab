package com.voncuver.ang.data.dao;

import org.bson.Document;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.voncuver.ang.data.dto.Word;

public class WordDao {

    private final MongoCollection<Document> wordCollection;

    public WordDao(MongoDatabase database) {
        wordCollection = database.getCollection("word");
    }

    public void save(Word word) {
        Document document = new Document("from", word.getFrom()).append(
                "direction", word.getDirection().name()).append("to",
                word.getTo());
        wordCollection.insertOne(document);
    }

    public void getBy(Word word) {
        Document document = new Document("from", word.getFrom()).append(
                "direction", word.getDirection().name()).append("to",
                word.getTo());
        wordCollection.insertOne(document);
    }
}
