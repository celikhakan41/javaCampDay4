package com.javacamp.logger;

import com.javacamp.entities.Gamers;
import com.javacamp.entities.Games;

public interface Logger {
    void added();

    void updated();

    void deleted();

    void failed();

    void sold();



}
