package com.voncuver.ang.data.dto;

import java.util.ArrayList;
import java.util.List;

public class Word {

    private final String from;

    private final List<String> to;

    private final Direction direction;

    public Word(Direction direction, String from, String to) {
        this.direction = direction;
        this.from = from;
        this.to = new ArrayList<String>() {
            private static final long serialVersionUID = 6305748414515299345L;

            {
                add(to);
            }
        };
    }

    public String getFrom() {
        return from;
    }

    public List<String> getTo() {
        return to;
    }

    public void append(String wordTo) {
        to.add(wordTo);
    }

    public Direction getDirection() {
        return direction;
    }
}