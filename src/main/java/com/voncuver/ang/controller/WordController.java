package com.voncuver.ang.controller;

import com.voncuver.ang.data.dao.WordDao;
import com.voncuver.ang.data.dto.Direction;
import com.voncuver.ang.data.dto.Word;

public class WordController {

    private WordDao wordService;

    public void saveWord(Direction direction, String from, String to) {
        Word word = new Word(direction, from, to);
        wordService.save(word);
    }
}