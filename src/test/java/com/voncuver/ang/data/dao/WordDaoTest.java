package com.voncuver.ang.data.dao;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;
import com.voncuver.ang.data.dto.Direction;
import com.voncuver.ang.data.dto.Word;

public class WordDaoTest {

    private MongoClient mongoClient;
    private MongoDatabase wordDatabase;

    private WordDao dao;

    @Before
    public void before() {
        mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost"));
        wordDatabase = mongoClient.getDatabase("wordTest");
        dao = new WordDao(wordDatabase);
    }

    @Test
    public void simpleSaveTest() {
        Word word = new Word(Direction.ANG_TO_PLN, "apple", "jabłko");

        dao.save(word);

    }

    @After
    public void tearDown() {
        mongoClient.close();
    }
}
