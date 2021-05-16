package com.javacamp.logger;

import com.javacamp.entities.Gamers;

public class LoggerImpl implements Logger {

    @Override
    public void added() {
        System.out.println("Sisteme başarılı bir şekilde kayıt oldu");
    }

    @Override
    public void failed() {
        System.out.println("Geçersiz bilgi girişi");
    }

    @Override
    public void sold() {
        System.out.println("Satın alım başarılı");
    }

    @Override
    public void updated() {
        System.out.println("Güncellendi");
    }

    @Override
    public void deleted() {
        System.out.println("Silindi");
    }


}
